import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class OknoGry extends JFrame {
    private CardLayout cardLayout;
    private JPanel contentPanel;
    private List<Element> elementy;
    private List<Kombinacja> kombinacje;
    private SilnikLaczenia silnik;
    private PanelGry panelGry; // Referencja do panelu gry

    public OknoGry() {
        setTitle("Alchemia Wiedzy");
        setSize(1280, 1024);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Wczytanie danych z plików
        try {
            elementy = Element.wczytajElementyZPliku(Config.SCIEZKA_ELEMENTY);
            kombinacje = Kombinacja.wczytajKombinacjeZPliku(Config.SCIEZKA_KOMBINACJE, elementy);
            silnik = new SilnikLaczenia(kombinacje, elementy);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Błąd wczytania danych gry!",
                    "Błąd",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        // Dodanie paneli do contentPanel
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        PanelMenu panelMenu = new PanelMenu(this);
        contentPanel.add(panelMenu, "menu");

        panelGry = new PanelGry(this, elementy, silnik);
        contentPanel.add(panelGry, "gra");

        add(contentPanel);
        pokazPanel("menu");
    }

    public List<Element> getElementy() {
        return elementy;
    }

    public SilnikLaczenia getSilnik() {
        return silnik;
    }

    public PanelGry getPanelGry() {
        return panelGry;
    }

    // Przełączanie paneli
    public void pokazPanel(String nazwaPanelu) {
        cardLayout.show(contentPanel, nazwaPanelu);
    }

    // Panel z Misjami
    public void pokazOknoMisji() {
        JDialog dialog = new JDialog(this, true);
        dialog.setUndecorated(true);
        dialog.setSize(800, 700);
        dialog.setLocationRelativeTo(this);

        PanelMisje panelMisje = new PanelMisje(dialog);

        dialog.add(panelMisje);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    // Panel z informacjami
    public void pokazOknoInfo() {
        JDialog dialog = new JDialog(this, true);
        dialog.setUndecorated(true);
        dialog.setSize(800, 700);
        dialog.setLocationRelativeTo(this);

        PanelInfoAutor panelInfo = new PanelInfoAutor(dialog);

        dialog.add(panelInfo);
        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    // Panel wyjścia z gry
    public void pokazOknoPotwierdzeniaWyjscia() {
        JDialog dialog = new JDialog(this, true);
        dialog.setUndecorated(true);
        dialog.setSize(420, 220);
        dialog.setLocationRelativeTo(this);

        PanelPotwierdzeniaWyjscia panel = new PanelPotwierdzeniaWyjscia(dialog);
        dialog.add(panel);

        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    // Panel resetowania gry
    public void pokazOknoPotwierdzeniaResetu() {
        JDialog dialog = new JDialog(this, true);
        dialog.setUndecorated(true);
        dialog.setSize(420, 220);
        dialog.setLocationRelativeTo(this);

        // Pobierz referencje do paneli z PanelGry
        PrawyPanelGry prawyPanel = panelGry.getPrawyPanelGry();
        GlownyPanelGry glownyPanel = panelGry.getGlownyPanelGry();

        PanelPotwierdzeniaResetu panel = new PanelPotwierdzeniaResetu(
                dialog, silnik, prawyPanel);
        dialog.add(panel);

        dialog.pack();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }
}


