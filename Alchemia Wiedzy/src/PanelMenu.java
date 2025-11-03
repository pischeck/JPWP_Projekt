import javax.swing.*;
import java.awt.*;

public class PanelMenu extends JPanel {
    private Image tloImage;
    private OknoGry okno;

    public PanelMenu(OknoGry okno) {
        this.okno = okno;

        tloImage = new ImageIcon(Config.SCIEZKA_TLO).getImage();

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ImageIcon ikonaAlchemy = new ImageIcon(Config.IKONA_ALCHEMY);
        Image image = ikonaAlchemy.getImage();
        Image scaledImage = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaledIkonaAlchemy = new ImageIcon(scaledImage);
        JLabel powitanieLabel = new JLabel("Alchemia Wiedzy!",scaledIkonaAlchemy, JLabel.CENTER);
        powitanieLabel.setIconTextGap(15);
        powitanieLabel.setFont(new Font("Arial", Font.BOLD, 50));
        powitanieLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        Color buttonColor = new Color(198,141,122);
        Color buttonTextColor = new Color(0, 0, 0);
        Color buttonBorderColor = new Color(0, 0, 0);

        JButton startButton = new JButton("Rozpocznij grę");
        startButton.setFont(new Font("Arial", Font.PLAIN, 24));
        startButton.setBackground(buttonColor);
        startButton.setForeground(buttonTextColor);
        startButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        startButton.setMaximumSize(new Dimension(550, 600));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton optionsButton = new JButton("Ustawienia");
        optionsButton.setFont(new Font("Arial", Font.PLAIN, 24));
        optionsButton.setBackground(buttonColor);
        optionsButton.setForeground(buttonTextColor);
        optionsButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        optionsButton.setMaximumSize(new Dimension(550, 400));
        optionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton infoButton = new JButton("Informacje o twórcy");
        infoButton.setFont(new Font("Arial", Font.PLAIN, 24));
        infoButton.setBackground(buttonColor);
        infoButton.setForeground(buttonTextColor);
        infoButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        infoButton.setMaximumSize(new Dimension(550, 400));
        infoButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton exitButton = new JButton("Wyjście z gry");
        exitButton.setFont(new Font("Arial", Font.PLAIN, 24));
        exitButton.setBackground(buttonColor);
        exitButton.setForeground(buttonTextColor);
        exitButton.setBorder(BorderFactory.createLineBorder(buttonBorderColor, 3));
        exitButton.setMaximumSize(new Dimension(550, 400));
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        //add(Box.createVerticalGlue());
        add(Box.createRigidArea(new Dimension(0, 160)));
        add(powitanieLabel);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(startButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(optionsButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(infoButton);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(exitButton);
        add(Box.createVerticalGlue());




        startButton.addActionListener(e -> {
            okno.pokazPanel("gra");
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(tloImage, 0, 0, getWidth(), getHeight(),this);
    }
}