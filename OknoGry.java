import javax.swing.*;
import java.awt.*;

public class OknoGry extends JFrame {

    public OknoGry() {
        super("Alchemia Wiedzy");
        setResizable(false); // stala wielkosc okna graficznego
        setSize(1280,1024);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        PanelGry panelGry = new PanelGry();
        PrawyPanel panelPrawy = new PrawyPanel();


        add(panelGry, BorderLayout.CENTER);
        add(panelPrawy, BorderLayout.EAST);

        setVisible(true);
    }

}