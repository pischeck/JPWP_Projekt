import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {
    private Image tloImage;
    private OknoGry okno;

    public PanelMenu(OknoGry okno) {
        this.okno = okno;

        tloImage = new ImageIcon(Config.SCIEZKA_TLO).getImage();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Nazwa gry z ikoną -----------------------------
        ImageIcon ikonaAlchemy = new ImageIcon(Config.IKONA_ALCHEMY);
        Image image = ikonaAlchemy.getImage();
        Image scaledImage = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaledIkonaAlchemy = new ImageIcon(scaledImage);
        JLabel powitanieLabel = new JLabel("Alchemia Wiedzy!",scaledIkonaAlchemy, JLabel.CENTER);
        powitanieLabel.setIconTextGap(15);
        powitanieLabel.setFont(new Font("Arial", Font.BOLD, 50));
        powitanieLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Kolory przycisków -----------------------
        Color buttonColor = new Color(198,141,122);
        Color buttonTextColor = new Color(0, 0, 0);
        Color buttonBorderColor = new Color(0, 0, 0);

        // Przycisk rozpoczynajacy gre
        JButton startButton = new JButton("Rozpocznij grę");
        startButton.setFont(new Font("Arial", Font.PLAIN, 24));
        startButton.setBackground(buttonColor);
        startButton.setForeground(buttonTextColor);
        startButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        startButton.setMaximumSize(new Dimension(550, 600));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Przycisk z misjami --------
        JButton missionButton = new JButton("Misje");
        missionButton.setFont(new Font("Arial", Font.PLAIN, 24));
        missionButton.setBackground(buttonColor);
        missionButton.setForeground(buttonTextColor);
        missionButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        missionButton.setMaximumSize(new Dimension(550, 400));
        missionButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Przycisk z info o twórcy ----------
        JButton infoButton = new JButton("Informacje o twórcy");
        infoButton.setFont(new Font("Arial", Font.PLAIN, 24));
        infoButton.setBackground(buttonColor);
        infoButton.setForeground(buttonTextColor);
        infoButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        infoButton.setMaximumSize(new Dimension(550, 400));
        infoButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Przycisk restowania postepu gry
        JButton resetButton = new JButton("Resetuj postęp gry");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 24));
        resetButton.setBackground(buttonColor);
        resetButton.setForeground(buttonTextColor);
        resetButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        resetButton.setMaximumSize(new Dimension(550, 400));
        resetButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Przycisk do wyjscia z gry ---------
        JButton exitButton = new JButton("Wyjście z gry");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 24));
        exitButton.setBackground(buttonColor);
        exitButton.setForeground(buttonTextColor);
        exitButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        exitButton.setMaximumSize(new Dimension(550, 400));
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Dodanie przycisków ----------
        add(Box.createRigidArea(new Dimension(0, 160)));
        add(powitanieLabel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(startButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(missionButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(infoButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(resetButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(exitButton);
        add(Box.createVerticalGlue());

        // Wykonanie akcji przycisków ----------
        startButton.addActionListener(e -> {
            okno.pokazPanel("gra");
        });
        exitButton.addActionListener(e -> {
              okno.pokazOknoPotwierdzeniaWyjscia();
        });
        infoButton.addActionListener(e -> {
            okno.pokazOknoInfo();
        });
        missionButton.addActionListener(e -> {
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            okno.pokazOknoMisji();
        });
        resetButton.addActionListener(e -> {
           okno.pokazOknoPotwierdzeniaResetu();
        });




    }
    // Narysuj tło ---------------------
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(tloImage, 0, 0, getWidth(), getHeight(),this);
    }




}