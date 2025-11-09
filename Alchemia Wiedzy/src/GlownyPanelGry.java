import javax.swing.*;
import java.awt.*;

public class GlownyPanelGry extends JPanel {
    private OknoGry okno;
    private SilnikLaczenia silnik;
    private PrawyPanelGry prawyPanel;

    private Element zaznaczonyElemet1 = null;
    private Element zaznaczonyElemet2 = null;

    private JPanel panelOdkrytychElementow;
    private JLabel komunikatLabel;

    public GlownyPanelGry(OknoGry okno, SilnikLaczenia silnik, PrawyPanelGry prawyPanel) {
        this.okno = okno;
        this.silnik = silnik;
        this.prawyPanel = prawyPanel;

        setPreferredSize(new Dimension(964,0));
        setBorder(BorderFactory.createLineBorder(new Color(175,183,245),4));
        setBackground(new Color(255,255,255));


        // Odkryte Elementy

    }
}
