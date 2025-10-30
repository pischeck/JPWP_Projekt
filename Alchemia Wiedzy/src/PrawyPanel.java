import javax.swing.*;
import java.awt.*;

public class PrawyPanel extends JPanel {

    public PrawyPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(320, 1024));

        // Lista Elementow -------------------------------------------------
        JPanel panelElementow = new JPanel();
        panelElementow.setBackground(new Color(199, 199, 199));
        add(panelElementow, BorderLayout.CENTER);


        // Przycisk menu -------------------------------------------------------
        JPanel panelPrzyciskow = new JPanel();
        panelPrzyciskow.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelPrzyciskow.setBackground(new Color(199, 199, 199));
        // Przycisk Menu
        JButton MenuSwitch = GUIFactory.stworzPrzyciskMenu(Config.IKONA_MENU, "Menu gry",32,32);

        panelPrzyciskow.add(MenuSwitch);
        add(panelPrzyciskow, BorderLayout.SOUTH);
    }

}



