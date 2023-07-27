package lab.projektmwserwer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Klasa zawierajaca uruchamianie i watek serwera
 */
public class Serwer 
{
    /**
     * Wiadomość, po której otrzymaniu serwer kończy swoje działanie.
     */
    public static final String KONIEC_POLACZENIA = "KONIEC POLACZENIA";
    public static final String BRAK_TOWARU = "BRAK TOWARU";
    /**
     * Port, na którym działa serwer.
     */
    public static final int SERWER_PORT = 2002;
    
    /**
     * Ten obiekt odpowiada za całe działanie serwera.
     */
    private ServerSocket serverSocket;

    public ServerSocket getServerSocket()
    {
        return serverSocket;
    }
    public void setServerSocket(ServerSocket serverSocket)
    {
        this.serverSocket = serverSocket;
    }

    /**
     * Konstruktor próbuje utworzyć gniazdo.
     */
    Serwer()
    {
        try
        {
            serverSocket = new ServerSocket(SERWER_PORT);		
            System.out.println("Serwer dziala");
        }
        catch (IOException e)
        {
            System.out.println("Nie można utworzyć gniazda");
            System.exit(1);
        }
    }
    /**
     * Uruchamia serwer, nawiązuje połączenie z klientem i wymienia z nim
     * wiadomości do otrzymania wiadomości końcowej.
     *
     * @throws Exception
     */
    void uruchom() throws Exception 
    {
        //Deklaracje potrzebnych zmiennych
        Socket socket = null;

        ListaProduktow listaProduktow = new ListaProduktow();//wczytujemy liste produktow do serwera
        try 
        {
            //Czekamy, aż klient się połączy w nieskonczonej petli
            while (true) 
            {
                socket = getServerSocket().accept();
                listaProduktow.toString();
                new SerwerKlient(socket).start();
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Problem w komunikacji z klientem");
        } 
        finally 
        {
            try 
            {
                getServerSocket().close();
            } 
            catch (IOException e) 
            {
                System.out.println("Problem z zamykaniem połączenia");
            }
        }
    }
}