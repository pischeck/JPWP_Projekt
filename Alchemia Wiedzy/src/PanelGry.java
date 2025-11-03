import javax.swing.*;
import java.awt.*;

public class PanelGry extends JPanel {
    public PanelGry() {
        JLabel graPanel = new JLabel("Tu zaczyna sie gra", JLabel.CENTER);
        graPanel.setFont(new Font("Arial", Font.BOLD, 20));
        add(graPanel);
    }
}