package lab.projektmw;

/**
 * Klasa main, wywoluje klase DietaZOknami ktora buduja cale okno aplikacji
 */
public class Projektmw 
{
    public static void main(String[] args) 
    {
        //new DietaZOknami();
        Integer i1 = new Integer(2);
        Integer i2 = new Integer(2);
        if(i1.equals(i2))
        {
            System.out.println(i1 == i2);
        }
    }
}