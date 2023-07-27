package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import lab.projektmw.DietaZOknami;

/**
 * Klasa listener dodajaca do zjedzonych produkt ktorego nie ma w bazie
 */
public class DodajProduktListener implements ActionListener
{
    private DietaZOknami dietaZOknami;

    public DietaZOknami getDietaZOknami() {
        return dietaZOknami;
    }

    public void setDietaZOknami(DietaZOknami dietaZOknami) {
        this.dietaZOknami = dietaZOknami;
    }

    public DodajProduktListener(DietaZOknami dietaZOknami) 
    {
        this.dietaZOknami = dietaZOknami;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try 
        {
            if (Double.parseDouble(getDietaZOknami().getKalorie().getText()) < 0
                    || Double.parseDouble(getDietaZOknami().getWeglowodany().getText()) < 0
                    || Double.parseDouble(getDietaZOknami().getTluszcze().getText()) < 0
                    || Double.parseDouble(getDietaZOknami().getBialko().getText()) < 0
                    || Double.parseDouble(getDietaZOknami().getIloscProduktu().getText()) < 0) 
            {
                throw new Exception();//wylapuje zly zakres liczbowy
            }
            String line = "";
            line = line.concat(getDietaZOknami().getKalorie().getText() + "$");
            line = line.concat(getDietaZOknami().getWeglowodany().getText() + "$");
            line = line.concat(getDietaZOknami().getTluszcze().getText() + "$");
            line = line.concat(getDietaZOknami().getBialko().getText() + "$");
            line = line.concat(getDietaZOknami().getIloscProduktu().getText());
            getDietaZOknami().zmienZjedzone(line);
        } 
        catch (Exception ex) 
        {
            //wylapuje jesli ktos poda cos innego niz akceptowane liczby
            JOptionPane.showMessageDialog(getDietaZOknami().getPanelGlownyProdukt(), "Podano zle wartosci!");
        }
        getDietaZOknami().setStraznik(0);
        getDietaZOknami().getNowyProdukt().setVisible(false);
    }
}