package threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JTextField;
import lab.projektmw.Dieta;

/**
 * Ciagle działający wątek zegara
 */
public class ZegarThread extends Thread
{
    private JTextField aktualnyCzas;
    private String godzina;
    private Dieta dieta;

    public JTextField getAktualnyCzas() {
        return aktualnyCzas;
    }

    public String getGodzina() {
        return godzina;
    }

    public Dieta getDieta() {
        return dieta;
    }
    
    public void setAktualnyCzas(JTextField aktualnyCzas) {
        this.aktualnyCzas = aktualnyCzas;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }
    
    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    
    public ZegarThread(JTextField aktualnyCzas, Dieta dieta) 
    {
        this.aktualnyCzas = aktualnyCzas;
        this.dieta = dieta;
    }
    @Override
    public void run()
    {
        Locale locale = new Locale("pl", "PL");
        LocalDateTime czas;
        while(true)
        {
            czas = LocalDateTime.now();
            getAktualnyCzas().setText(String.valueOf(czas.format(DateTimeFormatter.ofPattern("HH:mm:ss   E MMM dd yyyy", locale))));
            setGodzina(String.valueOf(czas.format(DateTimeFormatter.ofPattern("HH:mm:ss", locale))));
            try 
            {
                if(getGodzina().equals("00:00:00"))//o polnocy rezetujemy wykorzystane składniki odżywcze
                {
                    getDieta().resetujSkladniki();
                }
                Thread.sleep(1000);//zegar odąwieża się do sekunde
            } 
            catch (InterruptedException ex) 
            {
            }
        }
    }
}