package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import lab.projektmw.DietaZOknami;

/**
 * Klasa listener obslugujaca dodawanie zjedzonych produktow z pliku
 */
public class DodajZPlikuListener implements ActionListener
{
    private DietaZOknami dietaZOknami;

    public DietaZOknami getDietaZOknami() {
        return dietaZOknami;
    }

    public void setDietaZOknami(DietaZOknami dietaZOknami) {
        this.dietaZOknami = dietaZOknami;
    }

    public DodajZPlikuListener(DietaZOknami dietaZOknami) 
    {
        this.dietaZOknami = dietaZOknami;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int potwierdzenieWczytywania = JOptionPane.showConfirmDialog(getDietaZOknami().getPanelGlowny(), 
                "Czy chcesz wczytać produkty z pliku?\nPrawidłowy format to:\nNazwa (lub kod)\nIlość\nPowtarzaj te linie dowolną ilość razy.", 
                "Wczytaj produkty", JOptionPane.YES_NO_OPTION);
        if (potwierdzenieWczytywania == 0) 
        {
            try 
            {
                JFileChooser fileChooser = new JFileChooser(System.getProperty("user.home") + "/Desktop");
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Pliki txt", "txt"));
                fileChooser.setAcceptAllFileFilterUsed(false);
                fileChooser.getSelectedFile();
                fileChooser.showOpenDialog(getDietaZOknami().getPanelGlowny());

                FileReader fileReader = new FileReader(fileChooser.getSelectedFile());
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) //co 2 linie wczytane dodajemy zjedzony produkt 
                {
                    getDietaZOknami().getProdukt().setText(line);
                    if ((line = bufferedReader.readLine()) != null) 
                    {
                        getDietaZOknami().getIlosc().setText(line);
                    }
                    getDietaZOknami().getWyslij().doClick();
                }
                bufferedReader.close();
            } 
            catch (FileNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(getDietaZOknami().getPanelGlowny(), "Wystąpił błąd! Nie podano pliku.");
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(getDietaZOknami().getPanelGlowny(), "Wystąpił błąd formatu pliku!");
            }
        }
    }
}