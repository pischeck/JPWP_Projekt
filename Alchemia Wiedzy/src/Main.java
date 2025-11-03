import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        List<Element> elementy = Element.wczytajElementyZPliku(Config.SCIEZKA_ELEMENTY);
        List<Kombinacja> kombinacje = Kombinacja.wczytajKombinacjeZPliku(Config.SCIEZKA_KOMBINACJE, elementy);


        OknoGry gra = new OknoGry();
        //test

    }
}