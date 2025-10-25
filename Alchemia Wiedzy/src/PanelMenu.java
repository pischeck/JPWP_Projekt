import javax.swing.*;
import java.util.List;

public class PanelMenu extends JPanel {
    private JList<Element> listaElementow;
    private JLabel labelPostep;
    private JButton btnZapisz;
    private JButton btnWczytaj;

    public void aktualizujListe(List<Element> elementy);
    public void aktualizujPostep(int odkryte, int wszystkie);
}