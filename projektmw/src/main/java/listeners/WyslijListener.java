package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import lab.projektmw.DietaZOknami;

/**
 * Klasa listener obslugujaca wysylanie wpisanych informacji - produktu i ilosci do serwera
 */
public class WyslijListener implements ActionListener
{
    private DietaZOknami dietaZOknami;
    private PrintWriter out;

    public DietaZOknami getDietaZOknami() {
        return dietaZOknami;
    }

    public PrintWriter getOut() {
        return out;
    }

    public void setDietaZOknami(DietaZOknami dietaZOknami) {
        this.dietaZOknami = dietaZOknami;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }

    public WyslijListener(DietaZOknami dietaZOknami, PrintWriter out) {
        this.dietaZOknami = dietaZOknami;
        this.out = out;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String produkt;
        String ilosc;
        produkt = getDietaZOknami().getProdukt().getText();
        ilosc = getDietaZOknami().getIlosc().getText();
        if (!produkt.isEmpty() && !ilosc.isEmpty() && !produkt.contains("$") && !ilosc.contains("$"))//jesli wypelniono oba pola dane produktu i ilosci i nie wpisano $ jako znaku uzywanego przez serwer jako rozdzilacz danych
        {
            getDietaZOknami().getProdukt().setText("");//czyscimy linie wejsciowe po wyslaniu w aplikacji klienta
            getDietaZOknami().getIlosc().setText("");
            try {
                getOut().println(produkt);//wysylamy przez printwritera nasze dane do serwera
                getOut().println(ilosc);
            } catch (Exception ex) {
                System.out.println("Problem przy wysylaniu wiadomosci");
            }
        }
    }
}