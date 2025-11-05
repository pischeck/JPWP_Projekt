import javax.swing.*;
import java.awt.*;

public class GlownyPanelGry extends JPanel {
    private OknoGry okno;

    public GlownyPanelGry(OknoGry okno) {
        this.okno = okno;
        setPreferredSize(new Dimension(964,0));
        setBorder(BorderFactory.createLineBorder(new Color(175,183,245),4));
        setBackground(new Color(255,255,255));


        // Odkryte Elementy

    }
}
