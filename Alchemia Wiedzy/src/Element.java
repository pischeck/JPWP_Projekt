import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Element {
    private String nazwa;
    private String opisNaukowy;
    private String ikona;
    private boolean czyOdkryty;


    public Element(String nazwa, String opisNaukowy, String ikona) {
        this.nazwa = nazwa;
        this.opisNaukowy = opisNaukowy;
        this.ikona = ikona;
        this.czyOdkryty = false;
    }


    public String getNazwa() {
        return nazwa;
    }

    public String getOpisNaukowy() {
        return opisNaukowy;
    }

    public String getIkona() {
        return ikona;
    }

    public boolean isCzyOdkryty() {
        return czyOdkryty;
    }

    public void setCzyOdkryty(boolean czyOdkryty) {
        this.czyOdkryty = czyOdkryty;
    }


    public static List<Element> wczytajElementyZPliku(String  sciezkaPliku) throws IOException {
        List<Element> elementy = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(sciezkaPliku))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                String[] pola = linia.split(";");
                if(pola.length == 3) {
                    Element e = new Element(pola[0], pola[1], pola[2]);
                    elementy.add(e);
                }
            }
        } catch (IIOException ex) {
            ex.printStackTrace();
        }
        return elementy;
    }
}

