import javax.swing.*;
import java.awt.*;

public class OknoGry extends JFrame {
    private CardLayout cardLayout;
    private JPanel contentPanel;

    public OknoGry() {
        setTitle("Alchemia Wiedzy");
        setSize(1280, 1024);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        PanelPoczatkowy panelPoczatkowy = new PanelPoczatkowy(this);
        contentPanel.add(panelPoczatkowy, "start");

        PanelGry panelGry = new PanelGry();
        contentPanel.add(panelGry, "gra");

        add(contentPanel);

        pokazPanel("start");
    }

    public void pokazPanel(String nazwaPanelu) {
        cardLayout.show(contentPanel, nazwaPanelu);
    }
}


