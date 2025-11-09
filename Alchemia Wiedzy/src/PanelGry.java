import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelGry extends JPanel {
    private OknoGry okno;
    private List<Element> elementy;
    private SilnikLaczenia silnik;
    private PrawyPanelGry prawyPanelGry;
    private GlownyPanelGry glownyPanelGry;

    public PanelGry(OknoGry okno, List<Element> elementy, SilnikLaczenia silnik) {
        this.okno = okno;
        this.elementy = elementy;
        this.silnik = silnik;

        setLayout(new BorderLayout());


        //Dodanie paneli
        prawyPanelGry = new PrawyPanelGry(okno, elementy);
        glownyPanelGry = new GlownyPanelGry(okno,silnik,prawyPanelGry);

        add(prawyPanelGry, BorderLayout.EAST);
        add(glownyPanelGry, BorderLayout.WEST);
    }

    public PrawyPanelGry getPrawyPanelGry() {
        return prawyPanelGry;
    }

    public GlownyPanelGry getGlownyPanelGry() {
        return glownyPanelGry;
    }


}