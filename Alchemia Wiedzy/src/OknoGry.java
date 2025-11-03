import javax.swing.*;
import java.awt.*;

public class OknoGry extends JFrame {
    private CardLayout cardLayout;
    private JPanel contentPanel;

    public OknoGry() {
        setTitle("Alchemia Wiedzy");
        setSize(1280, 1024);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        PanelMenu panelMenu = new PanelMenu(this);
        contentPanel.add(panelMenu, "menu");

        PanelGry panelGry = new PanelGry(this);
        contentPanel.add(panelGry, "gra");

        add(contentPanel);

        pokazPanel("menu");
    }

    public void pokazPanel(String nazwaPanelu) {
        cardLayout.show(contentPanel, nazwaPanelu);
    }
}


