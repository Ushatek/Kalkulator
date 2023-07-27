package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lab.projektmw.DietaZOknami;

/**
 * Klasa listener obslugujaca przycisk zmien parametry, wywoluje ona okno zmien parametry
 */
public class ZmienParametryListener implements ActionListener
{
    private DietaZOknami dietaZOknami;

    public DietaZOknami getDietaZOknami() {
        return dietaZOknami;
    }

    public void setDietaZOknami(DietaZOknami dietaZOknami) {
        this.dietaZOknami = dietaZOknami;
    }
    
    //konstruktor
    public ZmienParametryListener(DietaZOknami dietaZOknami) 
    {
        this.dietaZOknami = dietaZOknami;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try
        {
            getDietaZOknami().oknoZmienParametry();
        }
        catch(Exception ex)
        {
        }
    }
}