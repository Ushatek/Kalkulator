package lab.projektmwserwer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Optional;

/**
 * Klasa, ktora bedzie powolywala nowego anonimowego laczącego sie klienta (nie identyfikujemy tu klienta po nazwie itp.)
 * tworzy watek z polaczeniem klienta z serwerem i jego funkcjinalnosci
 */
public class SerwerKlient extends Thread
{
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public Socket getSocket() {
        return socket;
    }

    public PrintWriter getOut() {
        return out;
    }

    public BufferedReader getIn() {
        return in;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public void setOut(PrintWriter out) {
        this.out = out;
    }

    public void setIn(BufferedReader in) {
        this.in = in;
    }
    
    //kontruktor
    public SerwerKlient(Socket socket) 
    {
        this.socket = socket;
    }
    
    private void inicjalizujKanalyKomunikacyjne() throws IOException
    {
        setIn(new BufferedReader(
            new InputStreamReader(getSocket().getInputStream())));

        // Obiekt do pisania do klienta
        setOut(new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(
                        getSocket().getOutputStream())), true));
        System.out.println("Stworzono kanaly komunikacyjne");
    }
    
    private void rozmawiaj() throws IOException
    {
        while(true)
        {
            String produkt;//odczytujemy linie z nazwa towaru/kodem kreskowym
            String ilosc;//linia z iloscia produktu
            produkt = getIn().readLine();
            ilosc = getIn().readLine();

            //wyszukujemy czy wyslany produkt jest w naszej bazie
            Optional<Produkt> szukanyProduktNazwa;
            Optional<Produkt> szukanyProduktKod;
            szukanyProduktNazwa = ListaProduktow.listaProduktow.stream().filter(prod -> prod.getNazwa().equalsIgnoreCase(produkt)).findAny();
            szukanyProduktKod = ListaProduktow.listaProduktow.stream().filter(prod -> prod.getKodEAN().equalsIgnoreCase(produkt)).findAny();
            if(szukanyProduktNazwa.isPresent() || szukanyProduktKod.isPresent())
            {
                Produkt p1 = new Produkt();
                for (Produkt prod : ListaProduktow.listaProduktow) 
                {
                    if(prod.getNazwa().equalsIgnoreCase(produkt) || prod.getKodEAN().equalsIgnoreCase(produkt))
                    {
                        p1 = prod;
                    }
                }
                //jako ze przeslemy wszystkie dane jako 1 string to dla uproszczenia jako rozdzilacz rezerwujemy znak $, bedzie on zastrzezony we wpisywaniu przez uzytkownika
                String string = p1.getKcal() + "$" + p1.getWeglowodany()+ "$" + p1.getTluszcze()+ "$" + p1.getBialko()+ "$" + ilosc;
                getOut().println(string);//przesylamy do klienta string z danymi
            }
            else
            {
                getOut().println(Serwer.BRAK_TOWARU);//zwracamy jesli nie znaleziono towaru w bazie danych
            }
                        
            if(produkt != null && produkt.equals(Serwer.KONIEC_POLACZENIA))
            {
                System.out.println("Klient konczy polaczenie.");
                getOut().println("Konczymy rozmowe...");
                getOut().println(Serwer.KONIEC_POLACZENIA);
                break;
            }
        }
    }
    
    @Override
    public void run()
    {
        try 
        {
            inicjalizujKanalyKomunikacyjne();
            rozmawiaj();
        } 
        catch (IOException ex) 
        {
            System.out.println("Klient zamknal aplikacje.");
        }
        finally
        {
            try 
            {
                getIn().close();
                System.out.println("Zamknieto strumien wejsciowy z klientem");
                getOut().close();
                System.out.println("Zamknieto strumien wyjsciowy z klientem");
                getSocket().close();
                System.out.println("Zamknieto socket z klientem ");
            } 
            catch (IOException ex) 
            {
                System.out.println("Wystapil blad podczas zamykania polaczenie z klinetem ");
            }
        }
    }
}