package lab.projektmw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import listeners.KlawiszeListener;
import threads.ZegarThread;

/**
 * Klasa budująca interfejs okna głównego aplikacji
 */
public class Dieta extends JFrame
{
    private JPanel panelGlowny;
    private JPanel panelGorny;
    private JPanel panelCentralny;
    private JPanel panelCentralnyDieta;
    private JPanel panelCentralnyParametry;
    private JPanel panelCentralnyParametryDane;
    private JPanel panelDolnyDane;
    private JPanel panelDolny;
    
    private JLabel nazwaAplikacji;
    private JLabel napisDzis;
    private JLabel napisZapotrzebowanie;
    private JLabel napisKalorie;
    private JLabel napisBialko;
    private JLabel napisTluszcze;
    private JLabel napisWeglowodany;
    private JLabel zjedzoneKalorie;
    private JLabel zjedzoneBialko;
    private JLabel zjedzoneTluszcze;
    private JLabel zjedzoneWeglowodany;
    private JLabel zapotrzebowanieKalorie;
    private JLabel zapotrzebowanieBialko;
    private JLabel zapotrzebowanieTluszcze;
    private JLabel zapotrzebowanieWeglowodany;
    private JLabel napisParametry;
    private JLabel napisWiek;
    private JLabel napisWaga;
    private JLabel napisWzrost;
    private JLabel napisPlec;
    private JLabel parametrWiek;
    private JLabel parametrWaga;
    private JLabel parametrWzrost;
    private JLabel parametrPlec;
    private JLabel napisDodajProdukt;
    private JLabel napisIlosc;
    
    private JButton zmienParametry;
    private JButton dodajPlik;
    protected JButton wyslij;
    
    private JTextField zegar;
    private JTextField produkt;
    private JTextField ilosc;
    
    //gettery
    public JPanel getPanelGlowny() 
    {
        return panelGlowny;
    }

    public JPanel getPanelGorny() {
        return panelGorny;
    }

    public JPanel getPanelCentralny() {
        return panelCentralny;
    }

    public JPanel getPanelCentralnyDieta() {
        return panelCentralnyDieta;
    }

    public JPanel getPanelCentralnyParametry() {
        return panelCentralnyParametry;
    }

    public JPanel getPanelCentralnyParametryDane() {
        return panelCentralnyParametryDane;
    }

    public JPanel getPanelDolnyDane() {
        return panelDolnyDane;
    }

    public JPanel getPanelDolny() {
        return panelDolny;
    }

    public JLabel getNazwaAplikacji() {
        return nazwaAplikacji;
    }

    public JLabel getNapisDzis() {
        return napisDzis;
    }

    public JLabel getNapisZapotrzebowanie() {
        return napisZapotrzebowanie;
    }

    public JLabel getNapisKalorie() {
        return napisKalorie;
    }

    public JLabel getNapisBialko() {
        return napisBialko;
    }

    public JLabel getNapisTluszcze() {
        return napisTluszcze;
    }

    public JLabel getNapisWeglowodany() {
        return napisWeglowodany;
    }

    public JLabel getZjedzoneKalorie() {
        return zjedzoneKalorie;
    }

    public JLabel getZjedzoneBialko() {
        return zjedzoneBialko;
    }

    public JLabel getZjedzoneTluszcze() {
        return zjedzoneTluszcze;
    }

    public JLabel getZjedzoneWeglowodany() {
        return zjedzoneWeglowodany;
    }

    public JLabel getZapotrzebowanieKalorie() {
        return zapotrzebowanieKalorie;
    }

    public JLabel getZapotrzebowanieBialko() {
        return zapotrzebowanieBialko;
    }

    public JLabel getZapotrzebowanieTluszcze() {
        return zapotrzebowanieTluszcze;
    }

    public JLabel getZapotrzebowanieWeglowodany() {
        return zapotrzebowanieWeglowodany;
    }

    public JLabel getNapisParametry() {
        return napisParametry;
    }

    public JLabel getNapisWiek() {
        return napisWiek;
    }

    public JLabel getNapisWaga() {
        return napisWaga;
    }

    public JLabel getNapisWzrost() {
        return napisWzrost;
    }

    public JLabel getNapisPlec() {
        return napisPlec;
    }

    public JLabel getParametrWiek() {
        return parametrWiek;
    }

    public JLabel getParametrWaga() {
        return parametrWaga;
    }

    public JLabel getParametrWzrost() {
        return parametrWzrost;
    }

    public JLabel getParametrPlec() {
        return parametrPlec;
    }

    public JLabel getNapisDodajProdukt() {
        return napisDodajProdukt;
    }

    public JLabel getNapisIlosc() {
        return napisIlosc;
    }

    public JButton getZmienParametry() {
        return zmienParametry;
    }

    public JButton getDodajPlik() {
        return dodajPlik;
    }

    public JButton getWyslij() {
        return wyslij;
    }

    public JTextField getZegar() {
        return zegar;
    }

    public JTextField getProdukt() {
        return produkt;
    }

    public JTextField getIlosc() {
        return ilosc;
    }
    
    //settery
    public void setPanelGlowny(JPanel panelGlowny) {
        this.panelGlowny = panelGlowny;
    }

    public void setPanelGorny(JPanel panelGorny) {
        this.panelGorny = panelGorny;
    }

    public void setPanelCentralny(JPanel panelCentralny) {
        this.panelCentralny = panelCentralny;
    }

    public void setPanelCentralnyDieta(JPanel panelCentralnyDieta) {
        this.panelCentralnyDieta = panelCentralnyDieta;
    }

    public void setPanelCentralnyParametry(JPanel panelCentralnyParametry) {
        this.panelCentralnyParametry = panelCentralnyParametry;
    }

    public void setPanelCentralnyParametryDane(JPanel panelCentralnyParametryDane) {
        this.panelCentralnyParametryDane = panelCentralnyParametryDane;
    }

    public void setPanelDolnyDane(JPanel panelDolnyDane) {
        this.panelDolnyDane = panelDolnyDane;
    }

    public void setPanelDolny(JPanel panelDolny) {
        this.panelDolny = panelDolny;
    }

    public void setNazwaAplikacji(JLabel nazwaAplikacji) {
        this.nazwaAplikacji = nazwaAplikacji;
    }

    public void setNapisDzis(JLabel napisDzis) {
        this.napisDzis = napisDzis;
    }

    public void setNapisZapotrzebowanie(JLabel napisZapotrzebowanie) {
        this.napisZapotrzebowanie = napisZapotrzebowanie;
    }

    public void setNapisKalorie(JLabel napisKalorie) {
        this.napisKalorie = napisKalorie;
    }

    public void setNapisBialko(JLabel napisBialko) {
        this.napisBialko = napisBialko;
    }

    public void setNapisTluszcze(JLabel napisTluszcze) {
        this.napisTluszcze = napisTluszcze;
    }

    public void setNapisWeglowodany(JLabel napisWeglowodany) {
        this.napisWeglowodany = napisWeglowodany;
    }

    public void setZjedzoneKalorie(JLabel zjedzoneKalorie) {
        this.zjedzoneKalorie = zjedzoneKalorie;
    }

    public void setZjedzoneBialko(JLabel zjedzoneBialko) {
        this.zjedzoneBialko = zjedzoneBialko;
    }

    public void setZjedzoneTluszcze(JLabel zjedzoneTluszcze) {
        this.zjedzoneTluszcze = zjedzoneTluszcze;
    }

    public void setZjedzoneWeglowodany(JLabel zjedzoneWeglowodany) {
        this.zjedzoneWeglowodany = zjedzoneWeglowodany;
    }

    public void setZapotrzebowanieKalorie(JLabel zapotrzebowanieKalorie) {
        this.zapotrzebowanieKalorie = zapotrzebowanieKalorie;
    }

    public void setZapotrzebowanieBialko(JLabel zapotrzebowanieBialko) {
        this.zapotrzebowanieBialko = zapotrzebowanieBialko;
    }

    public void setZapotrzebowanieTluszcze(JLabel zapotrzebowanieTluszcze) {
        this.zapotrzebowanieTluszcze = zapotrzebowanieTluszcze;
    }

    public void setZapotrzebowanieWeglowodany(JLabel zapotrzebowanieWeglowodany) {
        this.zapotrzebowanieWeglowodany = zapotrzebowanieWeglowodany;
    }

    public void setNapisParametry(JLabel napisParametry) {
        this.napisParametry = napisParametry;
    }

    public void setNapisWiek(JLabel napisWiek) {
        this.napisWiek = napisWiek;
    }

    public void setNapisWaga(JLabel napisWaga) {
        this.napisWaga = napisWaga;
    }

    public void setNapisWzrost(JLabel napisWzrost) {
        this.napisWzrost = napisWzrost;
    }

    public void setNapisPlec(JLabel napisPlec) {
        this.napisPlec = napisPlec;
    }

    public void setParametrWiek(JLabel parametrWiek) {
        this.parametrWiek = parametrWiek;
    }

    public void setParametrWaga(JLabel parametrWaga) {
        this.parametrWaga = parametrWaga;
    }

    public void setParametrWzrost(JLabel parametrWzrost) {
        this.parametrWzrost = parametrWzrost;
    }

    public void setParametrPlec(JLabel parametrPlec) {
        this.parametrPlec = parametrPlec;
    }

    public void setNapisDodajProdukt(JLabel napisDodajProdukt) {
        this.napisDodajProdukt = napisDodajProdukt;
    }

    public void setNapisIlosc(JLabel napisIlosc) {
        this.napisIlosc = napisIlosc;
    }

    public void setZmienParametry(JButton zmienParametry) {
        this.zmienParametry = zmienParametry;
    }

    public void setDodajPlik(JButton dodajPlik) {
        this.dodajPlik = dodajPlik;
    }

    public void setWyslij(JButton wyslij) {
        this.wyslij = wyslij;
    }

    public void setZegar(JTextField zegar) {
        this.zegar = zegar;
    }

    public void setProdukt(JTextField produkt) {
        this.produkt = produkt;
    }

    public void setIlosc(JTextField ilosc) {
        this.ilosc = ilosc;
    }
    
    //kontruktor
    public Dieta()
    {
        super("Dietetyczny kalkulator");
        budujOknoGlowne();
    }
    
    /**
    * funkcja zerujaca zjedzone kalorie o polnocy
    */
    public void resetujSkladniki()
    {
        getZjedzoneKalorie().setText("0");
        getZjedzoneKalorie().setForeground(Color.green);
        getZjedzoneWeglowodany().setText("0");
        getZjedzoneTluszcze().setText("0");
        getZjedzoneBialko().setText("0");
    }
    /**
    * Funkcja obliczajaca zapotrzebowanie na kalorie i skladniki odzywcze wedlug aktualnych parametrow uzytkownika
    */
    public void liczZapotrzebowanie()
    {
        /**
         * Liczymy zapotrzebowanie kaloryczne ze wzoru Mifflina i przyjmujemy srednia aktywność fizyczna
        */
        if(getParametrPlec().getText().equals("Mężczyzna"))
        {
            getZapotrzebowanieKalorie().setText(String.valueOf(Math.round(((10*Double.parseDouble(getParametrWaga().getText())) + 
                    (6.25 * Double.parseDouble(getParametrWzrost().getText())) - (5 * Double.parseDouble(getParametrWiek().getText())) + 5) * 1.5)));
        }
        if(getParametrPlec().getText().equals("Kobieta"))
        {
            getZapotrzebowanieKalorie().setText(String.valueOf(Math.round(((10*Double.parseDouble(getParametrWaga().getText())) + 
                    (6.25 * Double.parseDouble(getParametrWzrost().getText())) - (5 * Double.parseDouble(getParametrWiek().getText())) - 161) * 1.5)));
        }
        getZapotrzebowanieWeglowodany().setText(String.valueOf(Math.round((Double.parseDouble(getZapotrzebowanieKalorie().getText()) * 0.55) / 4)));
        getZapotrzebowanieTluszcze().setText(String.valueOf(Math.round((Double.parseDouble(getZapotrzebowanieKalorie().getText()) * 0.3) / 9)));
        getZapotrzebowanieBialko().setText(String.valueOf(Math.round((Double.parseDouble(getZapotrzebowanieKalorie().getText()) * 0.15) / 4)));
    }
    
    /**
     * Funkcja wywolujaca ostrzegawcze okno dialogowe po dodaniu produktu, gdy przekroczylismy kalorie
    */
    public void oknoPrzekroczonoLimit()
    {
        if(Integer.valueOf(getZjedzoneKalorie().getText()) > Integer.valueOf(getZapotrzebowanieKalorie().getText()))
        {
            getZjedzoneKalorie().setForeground(Color.red);
            JOptionPane.showMessageDialog(getPanelGlowny(), "Przekroczono limit kalorii");
        }
    }
    /**
     * Funkcja zmieniajaca ilosc zjedzonych kalori i skladnikow marko
     * @param linia
    */
    public void zmienZjedzone(String linia)
    {
        String linie[] = linia.split("\\$");//rozdzilamy stringa na poszczegolen dane
        //zmieniamy wyswietlane zjedzone skladniki
        getZjedzoneKalorie().setText(
                String.valueOf(Math.round(Double.parseDouble(getZjedzoneKalorie().getText()) + 
                        ((Double.parseDouble(linie[0]) * Double.parseDouble(linie[4]) *100.0)/100.0))));
        getZjedzoneWeglowodany().setText(
                String.valueOf(Math.round(Double.parseDouble(getZjedzoneWeglowodany().getText()) + 
                        ((Double.parseDouble(linie[1]) * Double.parseDouble(linie[4]) *100.0)/100.0))));
        getZjedzoneTluszcze().setText(
                String.valueOf(Math.round(Double.parseDouble(getZjedzoneTluszcze().getText()) + 
                        ((Double.parseDouble(linie[2]) * Double.parseDouble(linie[4]) *100.0)/100.0))));
        getZjedzoneBialko().setText(
                String.valueOf(Math.round(Double.parseDouble(getZjedzoneBialko().getText()) + 
                        ((Double.parseDouble(linie[3]) * Double.parseDouble(linie[4]) *100.0)/100.0))));
        oknoPrzekroczonoLimit();//sprawdzamy czy przekroczono kalorie
    }
    
    /**
     * Budowanie okna glownego aplikacji
    */
    private void budujOknoGlowne()
    {
        setSize(550, 500);
        setPanelGlowny(new JPanel(new BorderLayout()));
        setContentPane(getPanelGlowny());
        
        //panel gorny
        setPanelGorny(new JPanel());
        getPanelGorny().setLayout(new BoxLayout(getPanelGorny(), BoxLayout.Y_AXIS));
        setNazwaAplikacji(new JLabel("Kalkulator dietetyczny"));
        getNazwaAplikacji().setAlignmentX(JLabel.CENTER_ALIGNMENT);
        getNazwaAplikacji().setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        getNazwaAplikacji().setFont(new Font("Roboto", Font.BOLD, 20));
        
        setZegar(new JTextField());
        getZegar().setHorizontalAlignment(JTextField.CENTER);
        getZegar().setPreferredSize(new Dimension(WIDTH, 50));
        getZegar().setEditable(false);
        getZegar().setFont(new Font("Roboto", Font.BOLD, 20));
        getZegar().setText("Miejsce na godzine i date");//tekst domyslny, nie bedzie wypisywany w przypadku dzialania zegara
        
        getPanelGorny().add(getNazwaAplikacji());
        getPanelGorny().add(getZegar());
        getPanelGlowny().add(getPanelGorny(), BorderLayout.NORTH);
                
        //panel centralny
        setPanelCentralny(new JPanel());
        getPanelCentralny().setLayout((new BoxLayout(getPanelCentralny(), BoxLayout.Y_AXIS)));
        getPanelCentralny().setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        
        setPanelCentralnyDieta(new JPanel(new GridLayout(5, 3)));
        getPanelCentralnyDieta().setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        setNapisDzis(new JLabel("Wykorzystanie"));
        setNapisZapotrzebowanie(new JLabel("Zapotrzebowanie"));
        setNapisKalorie(new JLabel("Kalorie [kcal]"));
        setNapisWeglowodany(new JLabel("Węglowodany [g]"));
        setNapisTluszcze(new JLabel("Tłuszcze [g]"));
        setNapisBialko(new JLabel("Białko [g]"));
        setZjedzoneKalorie(new JLabel("0"));
        getZjedzoneKalorie().setForeground(Color.green);
        setZjedzoneWeglowodany(new JLabel("0"));
        setZjedzoneTluszcze(new JLabel("0"));
        setZjedzoneBialko(new JLabel("0"));
        setZapotrzebowanieKalorie(new JLabel("2500"));
        setZapotrzebowanieWeglowodany(new JLabel("340"));
        setZapotrzebowanieTluszcze(new JLabel("80"));
        setZapotrzebowanieBialko(new JLabel("60"));
        getPanelCentralnyDieta().add(new JLabel(""));
        getPanelCentralnyDieta().add(getNapisDzis());
        getPanelCentralnyDieta().add(getNapisZapotrzebowanie());
        getPanelCentralnyDieta().add(getNapisKalorie());
        getPanelCentralnyDieta().add(getZjedzoneKalorie());
        getPanelCentralnyDieta().add(getZapotrzebowanieKalorie());
        getPanelCentralnyDieta().add(getNapisWeglowodany());
        getPanelCentralnyDieta().add(getZjedzoneWeglowodany());
        getPanelCentralnyDieta().add(getZapotrzebowanieWeglowodany());
        getPanelCentralnyDieta().add(getNapisTluszcze());
        getPanelCentralnyDieta().add(getZjedzoneTluszcze());
        getPanelCentralnyDieta().add(getZapotrzebowanieTluszcze());
        getPanelCentralnyDieta().add(getNapisBialko());
        getPanelCentralnyDieta().add(getZjedzoneBialko());
        getPanelCentralnyDieta().add(getZapotrzebowanieBialko());
        
        setPanelCentralnyParametry(new JPanel());
        getPanelCentralnyParametry().setLayout((new BoxLayout(getPanelCentralnyParametry(), BoxLayout.Y_AXIS)));
        getPanelCentralnyParametry().setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        setNapisParametry(new JLabel("Moje parametry"));
        getNapisParametry().setFont(new Font("Roboto", Font.BOLD, 15));
        getNapisParametry().setAlignmentX(JLabel.CENTER_ALIGNMENT);
        setPanelCentralnyParametryDane(new JPanel(new GridLayout(2, 4)));
        getPanelCentralnyParametryDane().setBorder(BorderFactory.createEmptyBorder(10, 80, 0, 60));
        setNapisWaga(new JLabel("Waga [kg]"));
        getNapisWaga().setHorizontalAlignment(JLabel.CENTER);
        setNapisWzrost(new JLabel("Wzrost [cm]"));
        getNapisWzrost().setHorizontalAlignment(JLabel.CENTER);
        setNapisWiek(new JLabel("Wiek"));
        getNapisWiek().setHorizontalAlignment(JLabel.CENTER);
        setNapisPlec(new JLabel("Płeć"));
        getNapisPlec().setHorizontalAlignment(JLabel.CENTER);
        getPanelCentralnyParametryDane().add(getNapisWaga());
        getPanelCentralnyParametryDane().add(getNapisWzrost());
        getPanelCentralnyParametryDane().add(getNapisWiek());
        getPanelCentralnyParametryDane().add(getNapisPlec());
        setParametrWaga(new JLabel("70"));
        getParametrWaga().setHorizontalAlignment(JLabel.CENTER);
        setParametrWzrost(new JLabel("180"));
        getParametrWzrost().setHorizontalAlignment(JLabel.CENTER);
        setParametrWiek(new JLabel("28"));
        getParametrWiek().setHorizontalAlignment(JLabel.CENTER);
        setParametrPlec(new JLabel("Mężczyzna"));
        getParametrPlec().setHorizontalAlignment(JLabel.CENTER);
        getPanelCentralnyParametryDane().add(getParametrWaga());
        getPanelCentralnyParametryDane().add(getParametrWzrost());
        getPanelCentralnyParametryDane().add(getParametrWiek());
        getPanelCentralnyParametryDane().add(getParametrPlec());
        getPanelCentralnyParametry().add(getNapisParametry());
        getPanelCentralnyParametry().add(getPanelCentralnyParametryDane());
        setZmienParametry(new JButton("Zmien parametry"));
        getZmienParametry().setAlignmentX(JLabel.CENTER_ALIGNMENT);
        
        getPanelCentralny().add(getPanelCentralnyDieta());
        getPanelCentralny().add(new JSeparator());
        getPanelCentralny().add(getPanelCentralnyParametry());
        getPanelCentralny().add(getZmienParametry());
        getPanelGlowny().add(getPanelCentralny(), BorderLayout.CENTER);
        
        //panel dolny
        setPanelDolny(new JPanel());
        getPanelDolny().setLayout((new BoxLayout(getPanelDolny(), BoxLayout.Y_AXIS)));
        getPanelDolny().setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        setPanelDolnyDane(new JPanel(new FlowLayout()));
        setNapisDodajProdukt(new JLabel("Dodaj produkt"));
        setProdukt(new JTextField());
        getProdukt().setPreferredSize(new Dimension(200, 30));
        setNapisIlosc(new JLabel("Ilosc [g]"));
        setIlosc(new JTextField());
        getIlosc().setPreferredSize(new Dimension(50, 30));
        setDodajPlik(new JButton("Dodaj z pliku"));
        setWyslij(new JButton("Wyślij"));
        getWyslij().setPreferredSize(new Dimension(50, 40));
        getWyslij().setAlignmentX(JButton.CENTER_ALIGNMENT);
        getPanelDolnyDane().add(getNapisDodajProdukt());
        getPanelDolnyDane().add(getProdukt());
        getPanelDolnyDane().add(getNapisIlosc());
        getPanelDolnyDane().add(getIlosc());
        getPanelDolnyDane().add(getDodajPlik());
        getPanelDolny().add(new JSeparator());
        getPanelDolny().add(getPanelDolnyDane());
        getPanelDolny().add(getWyslij());      
        getPanelGlowny().add(getPanelDolny(), BorderLayout.SOUTH);
        
        //thread
        ZegarThread zegarThread = new ZegarThread(getZegar(), this);
        zegarThread.start();
        
        liczZapotrzebowanie();
        getIlosc().addKeyListener(new KlawiszeListener(this));
        getProdukt().addKeyListener(new KlawiszeListener(this));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}