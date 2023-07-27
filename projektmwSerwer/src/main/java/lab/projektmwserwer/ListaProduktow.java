package lab.projektmwserwer;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa zawierajaca publiczna liste produktow w arraylist
 */
public class ListaProduktow 
{
    public static List<Produkt> listaProduktow;
    
    static
    {
        listaProduktow = new ArrayList<>();
    }

    public ListaProduktow() 
    {
        //przykladowe produkty, z racji ze zwykly uzytkownik nie dodaje produktow nowych to tu nie weryfikuje np. unikalnosci nazw/kodow, uznajemy ze to po stronie bazy danych
        listaProduktow.add(new Produkt("mleko", "1", 0.42, 0.05, 0.01, 0.034));
        listaProduktow.add(new Produkt("banan", "2", 0.88, 0.23, 0.003, 0.011));
        listaProduktow.add(new Produkt("bulka", "3", 3.1, 0.52, 0.06, 0.011));
        listaProduktow.add(new Produkt("czekolada", "4", 5.45, 0.61, 0.31, 0.049));
        listaProduktow.add(new Produkt("kurczak", "5", 2.39, 0.0, 0.14, 0.27));
    } 
}