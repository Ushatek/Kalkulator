package lab.projektmw;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import listeners.AktualizujParametryListener;
import listeners.DodajProduktListener;
import listeners.DodajZPlikuListener;
import listeners.WyslijListener;
import listeners.ZmienParametryListener;
import threads.NasluchiwaczThread;

/**
 * Klasa glowna, ktora docelowo wywolamy, buduje aplikacje z oknami dialogowymi, dziedziczy po klasie dieta budujacej okno glowne
 */
public class DietaZOknami extends Dieta
{    
    private JLabel wiekNapis;
    private JLabel waganapis;
    private JLabel wzrostNapis;
    private JLabel plecNapis;
    private JTextField waga;
    private JTextField wzrost;
    private JTextField wiek;
    private JComboBox plec;
    private JPanel panelGlownyParametry;
    private JPanel panelParametry;
    private JButton wyslijNoweParametry;
    private JDialog parametry;
    
    private JLabel kalorieNapis;
    private JLabel weglowodanynapis;
    private JLabel tluszczeNapis;
    private JLabel bialkoNapis;
    private JLabel iloscProduktuNapis;
    private JTextField kalorie;
    private JTextField weglowodany;
    private JTextField tluszcze;
    private JTextField bialko;
    private JTextField iloscProduktu;
    private JPanel panelGlownyProdukt;
    private JPanel panelProdukt;
    private JButton wyslijNowyProdukt;
    private JDialog nowyProdukt;
    
    private int straznik;//straznik potrzebny przy sytuacji dodawania kilku nowych produktow z pliku

    public JTextField getWaga() {
        return waga;
    }

    public JTextField getWzrost() {
        return wzrost;
    }

    public JTextField getWiek() {
        return wiek;
    }

    public JComboBox getPlec() {
        return plec;
    }

    public JPanel getPanelGlownyParametry() {
        return panelGlownyParametry;
    }

    public JPanel getPanelParametry() {
        return panelParametry;
    }

    public JButton getWyslijNoweParametry() {
        return wyslijNoweParametry;
    }

    public JDialog getParametry() {
        return parametry;
    }

    public JLabel getWiekNapis() {
        return wiekNapis;
    }

    public JLabel getWaganapis() {
        return waganapis;
    }

    public JLabel getWzrostNapis() {
        return wzrostNapis;
    }

    public JLabel getPlecNapis() {
        return plecNapis;
    }

    public JLabel getKalorieNapis() {
        return kalorieNapis;
    }

    public JLabel getWeglowodanynapis() {
        return weglowodanynapis;
    }

    public JLabel getTluszczeNapis() {
        return tluszczeNapis;
    }

    public JLabel getBialkoNapis() {
        return bialkoNapis;
    }

    public JTextField getKalorie() {
        return kalorie;
    }

    public JTextField getWeglowodany() {
        return weglowodany;
    }

    public JTextField getTluszcze() {
        return tluszcze;
    }

    public JTextField getBialko() {
        return bialko;
    }

    public JPanel getPanelGlownyProdukt() {
        return panelGlownyProdukt;
    }

    public JPanel getPanelProdukt() {
        return panelProdukt;
    }

    public JButton getWyslijNowyProdukt() {
        return wyslijNowyProdukt;
    }

    public JDialog getNowyProdukt() {
        return nowyProdukt;
    }

    public JLabel getIloscProduktuNapis() {
        return iloscProduktuNapis;
    }

    public JTextField getIloscProduktu() {
        return iloscProduktu;
    }

    public int getStraznik() {
        return straznik;
    }

    public void setWaga(JTextField waga) {
        this.waga = waga;
    }

    public void setWzrost(JTextField wzrost) {
        this.wzrost = wzrost;
    }

    public void setWiek(JTextField wiek) {
        this.wiek = wiek;
    }

    public void setPlec(JComboBox plec) {
        this.plec = plec;
    }

    public void setPanelGlownyParametry(JPanel panelGlownyParametry) {
        this.panelGlownyParametry = panelGlownyParametry;
    }

    public void setPanelParametry(JPanel panelParametry) {
        this.panelParametry = panelParametry;
    }

    public void setWyslijNoweParametry(JButton wyslijNoweParametry) {
        this.wyslijNoweParametry = wyslijNoweParametry;
    }

    public void setParametry(JDialog parametry) {
        this.parametry = parametry;
    }

    public void setWiekNapis(JLabel wiekNapis) {
        this.wiekNapis = wiekNapis;
    }

    public void setWaganapis(JLabel waganapis) {
        this.waganapis = waganapis;
    }

    public void setWzrostNapis(JLabel wzrostNapis) {
        this.wzrostNapis = wzrostNapis;
    }

    public void setPlecNapis(JLabel plecNapis) {
        this.plecNapis = plecNapis;
    }

    public void setKalorieNapis(JLabel kalorieNapis) {
        this.kalorieNapis = kalorieNapis;
    }

    public void setWeglowodanynapis(JLabel weglowodanynapis) {
        this.weglowodanynapis = weglowodanynapis;
    }

    public void setTluszczeNapis(JLabel tluszczeNapis) {
        this.tluszczeNapis = tluszczeNapis;
    }

    public void setBialkoNapis(JLabel bialkoNapis) {
        this.bialkoNapis = bialkoNapis;
    }

    public void setKalorie(JTextField kalorie) {
        this.kalorie = kalorie;
    }

    public void setWeglowodany(JTextField weglowodany) {
        this.weglowodany = weglowodany;
    }

    public void setTluszcze(JTextField tluszcze) {
        this.tluszcze = tluszcze;
    }

    public void setBialko(JTextField bialko) {
        this.bialko = bialko;
    }

    public void setPanelGlownyProdukt(JPanel panelGlownyProdukt) {
        this.panelGlownyProdukt = panelGlownyProdukt;
    }

    public void setPanelProdukt(JPanel panelProdukt) {
        this.panelProdukt = panelProdukt;
    }

    public void setWyslijNowyProdukt(JButton wyslijNowyProdukt) {
        this.wyslijNowyProdukt = wyslijNowyProdukt;
    }

    public void setNowyProdukt(JDialog nowyProdukt) {
        this.nowyProdukt = nowyProdukt;
    }

    public void setIloscProduktuNapis(JLabel iloscProduktuNapis) {
        this.iloscProduktuNapis = iloscProduktuNapis;
    }

    public void setIloscProduktu(JTextField iloscProduktu) {
        this.iloscProduktu = iloscProduktu;
    }

    public void setStraznik(int straznik) {
        this.straznik = straznik;
    }
    
    public DietaZOknami()
    {
        super();
        dodajListenery();
        
    }
    
    /**
    * Funkcja budujaca okno do zmiany parametrow waga, wzrost itp
    */
    public void oknoZmienParametry()
    {
        String[] tablicaPlec = {"Mężczyzna", "Kobieta"};//tablica z mozliwymi plciami do wyboru
        
        setParametry(new JDialog());
        getParametry().setTitle("Zmiana parametrów");
        getParametry().setSize(390, 150);
        getParametry().setLocationRelativeTo(getPanelGlowny());//srodkujemy wzgledem panelu glownego
        
        setPanelGlownyParametry(new JPanel());
        getPanelGlownyParametry().setLayout((new BoxLayout(getPanelGlownyParametry(), BoxLayout.Y_AXIS)));
        
        setPanelParametry(new JPanel(new GridLayout(2, 4)));
        getPanelParametry().setAlignmentX(JPanel.CENTER_ALIGNMENT);
        setWaganapis(new JLabel("Waga [kg]"));
        getWaganapis().setHorizontalAlignment(JLabel.CENTER);
        setWzrostNapis(new JLabel("Wzrost [cm]"));
        getWzrostNapis().setHorizontalAlignment(JLabel.CENTER);
        setWiekNapis(new JLabel("Wiek"));
        getWiekNapis().setHorizontalAlignment(JLabel.CENTER);
        setPlecNapis(new JLabel("Płeć"));
        getPlecNapis().setHorizontalAlignment(JLabel.CENTER);
        setWaga(new JTextField(getParametrWaga().getText()));
        getWaga().setHorizontalAlignment(JTextField.CENTER);
        setWzrost(new JTextField(getParametrWzrost().getText()));
        getWzrost().setHorizontalAlignment(JTextField.CENTER);
        setWiek(new JTextField(getParametrWiek().getText()));
        getWiek().setHorizontalAlignment(JTextField.CENTER);
        setPlec(new JComboBox(tablicaPlec));

        getPanelParametry().add(getWaganapis());
        getPanelParametry().add(getWzrostNapis());
        getPanelParametry().add(getWiekNapis());
        getPanelParametry().add(getPlecNapis());
        getPanelParametry().add(getWaga());
        getPanelParametry().add(getWzrost());
        getPanelParametry().add(getWiek());
        getPanelParametry().add(getPlec());
        
        setWyslijNoweParametry(new JButton("Aktualizuj parametry"));
        getWyslijNoweParametry().addActionListener(new AktualizujParametryListener(this));

        getWyslijNoweParametry().setAlignmentX(JButton.CENTER_ALIGNMENT);
        getPanelGlownyParametry().add(getPanelParametry());
        getPanelGlownyParametry().add(getWyslijNoweParametry());
        getParametry().add(getPanelGlownyParametry());
        
        getParametry().setVisible(true);
    }
    
    /**
    * Funkcja budujaca okno do dodania produktu "z reki" jesli nie ma go w bazie
    */
    public void oknoBrakProduktu()
    {
        int potwierdzenieWczytywania = JOptionPane.showConfirmDialog(this, "Brak produktu w bazie danych. Czy chcesz dodac parametry ręcznie?", "Nie znaleziono produktu", JOptionPane.YES_NO_OPTION);
        if (potwierdzenieWczytywania == 0)
        {
            setStraznik(1);
            setNowyProdukt(new JDialog());
            getNowyProdukt().setTitle("Dodaj produkt");
            getNowyProdukt().setSize(550, 150);
            getNowyProdukt().setLocationRelativeTo(getPanelGlowny());

            setPanelGlownyProdukt(new JPanel());
            getPanelGlownyProdukt().setLayout((new BoxLayout(getPanelGlownyProdukt(), BoxLayout.Y_AXIS)));

            setPanelProdukt(new JPanel(new GridLayout(2, 5)));
            getPanelProdukt().setAlignmentX(JPanel.CENTER_ALIGNMENT);
            setKalorieNapis(new JLabel("Kalorie [kcal]"));
            getKalorieNapis().setHorizontalAlignment(JLabel.CENTER);
            setWeglowodanynapis(new JLabel("Węglowodany [g]"));
            getWeglowodanynapis().setHorizontalAlignment(JLabel.CENTER);
            setTluszczeNapis(new JLabel("Tłuszcze [g]"));
            getTluszczeNapis().setHorizontalAlignment(JLabel.CENTER);
            setBialkoNapis(new JLabel("Białko [g]"));
            getBialkoNapis().setHorizontalAlignment(JLabel.CENTER);
            setIloscProduktuNapis(new JLabel("Ilość [g/ml]"));
            getIloscProduktuNapis().setHorizontalAlignment(JLabel.CENTER);
            setKalorie(new JTextField());
            getKalorie().setHorizontalAlignment(JTextField.CENTER);
            setWeglowodany(new JTextField());
            getWeglowodany().setHorizontalAlignment(JTextField.CENTER);
            setTluszcze(new JTextField());
            getTluszcze().setHorizontalAlignment(JTextField.CENTER);
            setBialko(new JTextField());
            getBialko().setHorizontalAlignment(JTextField.CENTER);
            setIloscProduktu(new JTextField());
            getIloscProduktu().setHorizontalAlignment(JTextField.CENTER);

            getPanelProdukt().add(getKalorieNapis());
            getPanelProdukt().add(getWeglowodanynapis());
            getPanelProdukt().add(getTluszczeNapis());
            getPanelProdukt().add(getBialkoNapis());
            getPanelProdukt().add(getIloscProduktuNapis());
            getPanelProdukt().add(getKalorie());
            getPanelProdukt().add(getWeglowodany());
            getPanelProdukt().add(getTluszcze());
            getPanelProdukt().add(getBialko());
            getPanelProdukt().add(getIloscProduktu());

            setWyslijNowyProdukt(new JButton("Dodaj produkt"));
            getWyslijNowyProdukt().addActionListener(new DodajProduktListener(this));

            getWyslijNowyProdukt().setAlignmentX(JButton.CENTER_ALIGNMENT);
            getPanelGlownyProdukt().add(getPanelProdukt());
            getPanelGlownyProdukt().add(getWyslijNowyProdukt());
            getNowyProdukt().add(getPanelGlownyProdukt());

            getNowyProdukt().setVisible(true);
        }
    }
    
    public final void dodajListenery()
    {
        SocketDieta socketKlienta = new SocketDieta();
        getZmienParametry().addActionListener(new ZmienParametryListener(this));
        getWyslij().addActionListener(new WyslijListener(this, socketKlienta.getOut()));
        getDodajPlik().addActionListener(new DodajZPlikuListener(this));
        new NasluchiwaczThread(this, socketKlienta.getIn(), socketKlienta.getOut(), socketKlienta.getSocket()).start();
    }
    
    
}