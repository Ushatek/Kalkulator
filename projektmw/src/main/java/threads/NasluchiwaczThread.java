package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab.projektmw.DietaZOknami;
import lab.projektmw.SocketDieta;

/**
 * Klasa zawierajaca watek ciagle nasluchujacy danych wejsciowych
 */
public class NasluchiwaczThread extends Thread
{
    private DietaZOknami dietaZOknami;
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    public DietaZOknami getDietaZOknami() {
        return dietaZOknami;
    }

    public BufferedReader getIn() {
        return in;
    }

    public PrintWriter getOut() {
        return out;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setDietaZOknami(DietaZOknami dietaZOknami) {
        this.dietaZOknami = dietaZOknami;
    }

    public void setIn(BufferedReader in) {
        this.in = in;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public NasluchiwaczThread(DietaZOknami dietaZOknami, BufferedReader in, PrintWriter out, Socket socket) 
    {
        this.dietaZOknami = dietaZOknami;
        this.in = in;
        this.out = out;
        this.socket = socket;
    }
    
    @Override
    public void run()
    {
        String line;
        while(true)
        {
            try 
            {
                line = getIn().readLine();
                if(line.equals(SocketDieta.BRAK_TOWARU))
                {
                    getDietaZOknami().oknoBrakProduktu();
                    while(getDietaZOknami().getStraznik() == 1)
                    {
                        try 
                        {
                            Thread.sleep(1000);
                        } 
                        catch (InterruptedException ex) 
                        {
                            Logger.getLogger(NasluchiwaczThread.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                else
                {
                    getDietaZOknami().zmienZjedzone(line);
                }
                
            } 
            catch (IOException ex) 
            {
                System.out.println("Blad przy czytaniu wiadomosci.");
            }
        }
    }
}