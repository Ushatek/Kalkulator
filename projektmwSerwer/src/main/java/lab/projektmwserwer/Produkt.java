package lab.projektmwserwer;

/**
 * Klasa zawierajaca informacje o konkretnym produkcie
 */
public class Produkt 
{
    private String nazwa;//nazwa produktu
    private String kodEAN;//kod produktu (uzytkownik moze uzywac ich naprzemiennie
    private double kcal;//kalorycznosc w 1 jednostce (g/ml)
    private double weglowodany;//ilosc weglowodanow w jednostce
    private double tluszcze;//ilosc tluszczy w jednostce
    private double bialko;//ilosc bialka w jednostce
    
    //gettery
    public String getNazwa() {
        return nazwa;
    }

    public String getKodEAN() {
        return kodEAN;
    }

    public double getKcal() {
        return kcal;
    }

    public double getWeglowodany() {
        return weglowodany;
    }

    public double getTluszcze() {
        return tluszcze;
    }

    public double getBialko() {
        return bialko;
    }
    
    //settery
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKodEAN(String kodEAN) {
        this.kodEAN = kodEAN;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public void setWeglowodany(double weglowodany) {
        this.weglowodany = weglowodany;
    }

    public void setTluszcze(double tluszcze) {
        this.tluszcze = tluszcze;
    }

    public void setBialko(double bialko) {
        this.bialko = bialko;
    }
    //kontruktor

    public Produkt(String nazwa, String kodEAN, double kcal, double weglowodany, double tluszcze, double bialko) 
    {
        this.nazwa = nazwa;
        this.kodEAN = kodEAN;
        this.kcal = kcal;
        this.weglowodany = weglowodany;
        this.tluszcze = tluszcze;
        this.bialko = bialko;
    }
    public Produkt() 
    {
    }
}