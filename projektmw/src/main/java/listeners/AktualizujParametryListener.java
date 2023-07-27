package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import lab.projektmw.DietaZOknami;

/**
 * Klasa listener akrualizujaca parametry uzytkownika
 */
public class AktualizujParametryListener implements ActionListener
{
    private DietaZOknami dietaZOknami;

    public DietaZOknami getDietaZOknami() {
        return dietaZOknami;
    }

    public void setDietaZOknami(DietaZOknami dietaZOknami) {
        this.dietaZOknami = dietaZOknami;
    }

    public AktualizujParametryListener(DietaZOknami dietaZOknami) 
    {
        this.dietaZOknami = dietaZOknami;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try 
        {
            //aplikacja nie oblujuje parametrow innych niż całkowite (np 70,5kg)!
            if (Integer.parseInt(getDietaZOknami().getWaga().getText()) < 0
                    || Integer.parseInt(getDietaZOknami().getWzrost().getText()) < 50
                    || Integer.parseInt(getDietaZOknami().getWiek().getText()) < 0
                    || Integer.parseInt(getDietaZOknami().getWaga().getText()) > 300
                    || Integer.parseInt(getDietaZOknami().getWzrost().getText()) > 250
                    || Integer.parseInt(getDietaZOknami().getWiek().getText()) > 130) 
            {
                throw new Exception();//wylapuje zly zakres liczbowy
            }
            getDietaZOknami().getParametrWaga().setText(getDietaZOknami().getWaga().getText());
            getDietaZOknami().getParametrWzrost().setText(getDietaZOknami().getWzrost().getText());
            getDietaZOknami().getParametrWiek().setText(getDietaZOknami().getWiek().getText());
        } 
        catch (Exception ex) 
        {
            //wylapuje jesli ktos poda cos innego niz liczbe calkowita i nie zmieni nic w parametrach
            JOptionPane.showMessageDialog(getDietaZOknami().getPanelGlownyParametry(), "Podano zle wartosci!");

        }
        getDietaZOknami().getParametrPlec().setText(getDietaZOknami().getPlec().getSelectedItem().toString());
        getDietaZOknami().getParametry().setVisible(false);
        getDietaZOknami().liczZapotrzebowanie();//przeliczamy zapotrzebowanie
        getDietaZOknami().oknoPrzekroczonoLimit();//jesli po zmianie parametrow przekroczylismy kalorie to informujemy
    }
}
