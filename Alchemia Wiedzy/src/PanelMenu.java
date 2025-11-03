import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {
    private OknoGry okno;

    public PanelMenu(OknoGry okno) {
        this.okno = okno;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel powitanieLabel = new JLabel("Alchemia Wiedzy!", JLabel.CENTER);
        powitanieLabel.setFont(new Font("Serif", Font.BOLD, 24));
        powitanieLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton startButton = new JButton("Rozpocznij grę");
        startButton.setFont(new Font("Serif", Font.PLAIN, 18));
        startButton.setMaximumSize(new Dimension(200, 40));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton optionsButton = new JButton("Ustawienia");
        optionsButton.setFont(new Font("Serif", Font.PLAIN, 18));
        optionsButton.setMaximumSize(new Dimension(200, 40));
        optionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton exitButton = new JButton("Wyjście z gry");
        exitButton.setFont(new Font("Serif", Font.PLAIN, 18));
        exitButton.setMaximumSize(new Dimension(200, 40));
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createVerticalGlue());
        add(powitanieLabel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(startButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(optionsButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(exitButton);
        add(Box.createVerticalGlue());




        startButton.addActionListener(e -> {
            okno.pokazPanel("gra");
        });
    }
}