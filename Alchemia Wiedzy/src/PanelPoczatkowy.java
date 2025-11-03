import javax.swing.*;
import java.awt.*;

public class PanelPoczatkowy extends JPanel {
    private OknoGry okno;

    public PanelPoczatkowy(OknoGry okno) {
        this.okno = okno;
        setLayout(new BorderLayout());

        JLabel powitanieLabel = new JLabel("Witamy w grze!", JLabel.CENTER);
        powitanieLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(powitanieLabel, BorderLayout.CENTER);

        JButton startButton = new JButton("Start");
        startButton.setFont(new Font("Serif", Font.PLAIN, 18));
        add(startButton, BorderLayout.SOUTH);

        startButton.addActionListener(e -> {
            okno.pokazPanel("gra");
        });
    }
}