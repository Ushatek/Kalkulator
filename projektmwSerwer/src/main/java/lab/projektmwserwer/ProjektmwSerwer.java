package lab.projektmwserwer;

/**
 * Klasa main serwera tworzaca dzialajacy serwer
 */
public class ProjektmwSerwer 
{

    public static void main(String[] args) 
    {
        //uruchamiamy najpier serwer
        try
        {
            // Tutaj znajduje się stworzenie serwera i jego uruchomienie
            
            new Serwer().uruchom();
        }
        catch (Exception ex)
        {
        }
    }
}