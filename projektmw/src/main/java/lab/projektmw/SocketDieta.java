package lab.projektmw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Klasa do laczenia sie klienta z serwerem
 */
public class SocketDieta 
{
    public static final int SERWER_PORT = 2002;
    public static final String BRAK_TOWARU = "BRAK TOWARU";
    
    private BufferedReader in;
    private PrintWriter out;
    private Socket socket;

    public BufferedReader getIn() {
        return in;
    }

    public PrintWriter getOut() {
        return out;
    }

    public Socket getSocket() {
        return socket;
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
    
    //kontruktor
    public SocketDieta() 
    {
        try 
        {
            socket = new Socket("localhost", SERWER_PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(SocketDieta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}