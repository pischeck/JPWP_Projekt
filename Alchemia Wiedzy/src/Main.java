import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String sciezkaPliku = "resources/elementy.txt";
        List<Element> elementy = Element.wczytajElementyZPliku(sciezkaPliku);

        for (Element e : elementy) {
            System.out.println("Nazwa: " +e.getNazwa());
            System.out.println("Opis: " + e.getOpisNaukowy());
            System.out.println("Ikonka: " + e.getIkona());
            System.out.println("---------------------------");
        }
    }
}
