import javax.swing.*;
import java.awt.*;

public class PanelGry extends JPanel {
    private OknoGry okno;

    public PanelGry(OknoGry okno) {
        this.okno = okno;
        setLayout(new BorderLayout());

        JButton menuButton = new JButton("Powrot do menu");
        menuButton.setFont(new Font("Serif", Font.PLAIN, 18));
        add(menuButton, BorderLayout.SOUTH);

        menuButton.addActionListener(e -> {
            okno.pokazPanel("menu");
        });
    }
}