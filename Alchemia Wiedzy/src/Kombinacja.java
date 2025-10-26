import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kombinacja {
    private Element element1;
    private Element element2;
    private Element wynik;


    public Kombinacja(Element element1, Element element2, Element wynik) {
        this.element1 = element1;
        this.element2 = element2;
        this.wynik = wynik;
    }

    public Element getElement1() {
        return element1;
    }

    public Element getElement2() {
        return element2;
    }

    public Element getWynik() {
        return wynik;
    }

    public static List<Kombinacja> wczytajKombinacjeZPliku(String sciezkaPliku, List<Element> elementy) {
        List<Kombinacja> kombinacje = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(sciezkaPliku))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                String[] czesci = linia.split("[+=]");
                if(czesci.length == 3) {
                    String nazwa1 = czesci[0].trim();
                    String nazwa2 = czesci[1].trim();
                    String wynik = czesci[2].trim();

                    Element e1 = znajdzElement(elementy, nazwa1);
                    Element e2 = znajdzElement(elementy, nazwa2);
                    Element wynikE1 = znajdzElement(elementy, wynik);

                    if(e1 != null && e2 != null && wynikE1 != null) {
                        kombinacje.add(new Kombinacja(e1, e2, wynikE1));
                    } else {
                        System.out.println("Nie znalezniono elementow dla linii: " + linia);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return kombinacje;
    }

    private static Element znajdzElement(List<Element> elementy, String nazwa) {
        for (Element e : elementy) {
            if(e.getNazwa().equalsIgnoreCase(nazwa)) {
                return e;
            }
        }
        return null;
    }
}
