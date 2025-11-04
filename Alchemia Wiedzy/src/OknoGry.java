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


        // Dodanie paneli do contentPanel
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        PanelMenu panelMenu = new PanelMenu(this);
        contentPanel.add(panelMenu, "menu");

        PanelGry panelGry = new PanelGry(this);
        contentPanel.add(panelGry, "gra");

        add(contentPanel);

        pokazPanel("menu");
    }

    // Przelacznie paneli
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

    // Panel wyjscia z gry
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

}


