import javax.swing.*;
import java.awt.*;

public class PanelGry extends JPanel {
    private OknoGry okno;

    public PanelGry(OknoGry okno) {
        this.okno = okno;
        setLayout(new BorderLayout());

        //Dodanie paneli
        JPanel prawyPanelGry = new PrawyPanelGry(okno);
        JPanel glownyPanelGry = new GlownyPanelGry(okno);
        add(prawyPanelGry, BorderLayout.EAST);
        add(glownyPanelGry, BorderLayout.WEST);

    }
}