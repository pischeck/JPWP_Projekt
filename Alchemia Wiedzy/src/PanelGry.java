import javax.swing.*;
import java.awt.*;

public class PanelGry extends JPanel {
    private OknoGry okno;

    public PanelGry(OknoGry okno) {
        this.okno = okno;
        setLayout(new BorderLayout());

        // Dodanie przycisków ----------
        JButton menuButton = new JButton("Powrot do menu");
        menuButton.setFont(new Font("Serif", Font.PLAIN, 18));
        add(menuButton, BorderLayout.SOUTH);

        JButton missionButton = new JButton("Misje");
        missionButton.setFont(new Font("Serif", Font.PLAIN, 18));
        add(missionButton, BorderLayout.EAST);


        // Wykonanie akcji przyciskow --------
        menuButton.addActionListener(e -> {
            okno.pokazPanel("menu");
        });
        missionButton.addActionListener(e -> {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            okno.pokazOknoMisji();
        });
    }
}