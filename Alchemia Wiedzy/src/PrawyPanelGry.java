import javax.swing.*;
import java.awt.*;

public class PrawyPanelGry extends JPanel {
    private OknoGry okno;

    public PrawyPanelGry(OknoGry okno) {
        this.okno = okno;
        setPreferredSize(new Dimension(300,0));
        setLayout(new BorderLayout());
        setBackground(new Color(153,140,254));
        setBorder(BorderFactory.createLineBorder(new Color(83,67,192),4));


        // Nazwa gry z ikoną -----------------------------
        JPanel nazwaGryPanel = new JPanel();
        nazwaGryPanel.setBackground(new Color(153,140,254));
        ImageIcon ikonaAlchemy = new ImageIcon(Config.IKONA_ALCHEMY);
        Image image = ikonaAlchemy.getImage();
        Image scaledImage = image.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon scaledIkonaAlchemy = new ImageIcon(scaledImage);
        JLabel nazwaGryLabel = new JLabel("Alchemia Wiedzy!",scaledIkonaAlchemy, JLabel.CENTER);
        nazwaGryLabel.setIconTextGap(15);
        nazwaGryLabel.setFont(new Font("Arial", Font.BOLD, 20));
        nazwaGryPanel.add(nazwaGryLabel);
        add(nazwaGryPanel,BorderLayout.NORTH);



        // Lista Elementow
        JPanel panelLista = new JPanel();



        // Panel z przyciskami--------------------
        JPanel panelPrzyciski = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelPrzyciski.setBackground(new Color(153,140,254));
        panelPrzyciski.setPreferredSize(new Dimension(300,50));
        // Przycisk Menu
        JButton buttonMenu = new JButton("Menu");
        buttonMenu.setFont(new Font("Arial", Font.PLAIN, 18));
        buttonMenu.setBackground(new Color(198,141,122));
        buttonMenu.setForeground(Color.BLACK);
        buttonMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        buttonMenu.setPreferredSize(new Dimension(120,40));
        panelPrzyciski.add(buttonMenu,  BorderLayout.CENTER);
        buttonMenu.addActionListener(e -> {
            okno.pokazPanel("menu");
        });
        // Przycisk Misje
        JButton buttonMisje = new JButton("Misje");
        buttonMisje.setFont(new Font("Arial", Font.PLAIN, 18));
        buttonMisje.setBackground(new Color(198,141,122));
        buttonMisje.setForeground(Color.BLACK);
        buttonMisje.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        buttonMisje.setPreferredSize(new Dimension(120,40));
        panelPrzyciski.add(buttonMisje,BorderLayout.CENTER);
        buttonMisje.addActionListener(e -> {
            okno.pokazOknoMisji();
        });
        add(panelPrzyciski, BorderLayout.SOUTH);



    }
}
