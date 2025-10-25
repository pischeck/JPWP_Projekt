import java.util.List;

public class BazaDanych {
    private List<Element> elementy;
    private List<Kombinacja> kombinacje;

    // Ładowanie danych z pliku tekstowego
    public void wczytajKombinacje(String sciezka);

    // Wyszukiwanie wyniku dla dwóch elementów
    public Element znajdzWynik(Element e1, Element e2);

    // Zwraca elementy podstawowe (woda, ogień, ziemia, powietrze)
    public List<Element> getPodstawoweElementy();
}
