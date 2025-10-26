import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String sciezkaElementy = "resources/elementy.txt";
        String sciezkaKombinacje = "resources/kombinacje.txt";
        List<Element> elementy = Element.wczytajElementyZPliku(sciezkaElementy);
        List<Kombinacja> kombinacje = Kombinacja.wczytajKombinacjeZPliku(sciezkaKombinacje, elementy);

        for (Element e : elementy) {
            System.out.println("Nazwa: " +e.getNazwa());
            System.out.println("Opis: " + e.getOpisNaukowy());
            System.out.println("Ikonka: " + e.getIkona());
            System.out.println("---------------------------");
        }

        for (Kombinacja k : kombinacje) {
            System.out.println(k);
        }


    }
}
