import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        List<Element> elementy = Element.wczytajElementyZPliku(Config.SCIEZKA_ELEMENTY);
        List<Kombinacja> kombinacje = Kombinacja.wczytajKombinacjeZPliku(Config.SCIEZKA_KOMBINACJE, elementy);

        SilnikLaczenia silnik = new SilnikLaczenia(kombinacje,elementy);

        Element woda = Element.znajdzElement(elementy, "Woda");
        Element ogien = Element.znajdzElement(elementy, "Ogień");

        Element wynik = silnik.polacz(woda, ogien);
        if (wynik != null) {
            System.out.println("Połączenie dało: " + wynik.getNazwa());
        }
        silnik.resetujGre(Config.SCIEZKA_ODKRYTE);
        silnik.pokazOdkryteElementy();
    }
}
