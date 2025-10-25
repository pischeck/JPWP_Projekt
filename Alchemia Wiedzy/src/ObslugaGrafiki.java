import java.awt.image.BufferedImage;
import java.util.Map;

public class ObslugaGrafiki {
    private Map<String, BufferedImage> mapaIkon;

    public BufferedImage wczytajIkone(String nazwaElementu);

    // Cache dla często używanych grafik
    private void inizjalizujCache();
}
