import java.util.List;

public class ZarzadcaPlikow {
    // Wczytywanie kombinacji z pliku tekstowego
    public List<Kombinacja> wczytajKombinacje(String sciezka);

    // Zapisywanie postepu gry lokalnie
    public void zapiszPostep(List<Element> odkryte, String sciezka);

    // Wczytywanie zapisanego postepu
    public List<String> wczytajPostep(String sciezka);
}
