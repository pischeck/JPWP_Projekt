import java.util.List;

public class Gra {
    private BazaDanych bazaDanych;
    private List<Element> odkryteElementy;
    private int liczbaOdkrytych;
    private int liczbaWszystkichElementow;

    public Gra();

    // Proba polaczenia dwoch elementow
    public Element polaczElementy(Element e1, Element e2);

    // Zapisywanie/wczytywanie postepu
    public void zapiszPostep(String sciezka);
    public void wczytajPostep(String sciezka);

    // Sprawdzanie czy gra zakonczona
    public boolean czyGraZakonczona();

    public int getPostep();
}
