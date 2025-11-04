import javax.swing.*;
import java.awt.*;

public class PanelPotwierdzeniaWyjscia extends JPanel {
    public PanelPotwierdzeniaWyjscia(JDialog dialog) {
        setPreferredSize(new Dimension(400,200));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(new Color(83,67,192),5));

        // Tytuł
        JPanel panelTytul = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelTytul.setBackground(new Color(83,67,192));
        JLabel tytul = new JLabel("Potwierdzenia wyjscia");
        tytul.setForeground(Color.WHITE);
        tytul.setFont(new Font("Arial", Font.BOLD, 20));
        panelTytul.add(tytul);
        add(panelTytul, BorderLayout.NORTH);

        //Tekst pytania
        JLabel pytanie = new JLabel("Czy napewno chcesz zamknąć aplikację?");
        pytanie.setHorizontalAlignment(SwingConstants.CENTER);
        pytanie.setFont(new Font("Arial", Font.PLAIN, 18));
        add(pytanie, BorderLayout.CENTER);

        // Przyciski tak/nie
        JPanel panelPrzyciskow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton takButton = new JButton("Tak");
        takButton.setFont(new Font("Arial", Font.PLAIN, 20));
        takButton.setBackground(new Color(198,141,122));
        takButton.setForeground(new Color(0, 0, 0));
        takButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        JButton nieButton = new JButton("Nie");
        nieButton.setFont(new Font("Arial", Font.PLAIN, 20));
        nieButton.setBackground(new Color(198,141,122));
        nieButton.setForeground(new Color(0, 0, 0));
        nieButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        takButton.setPreferredSize(new Dimension(100,40));
        nieButton.setPreferredSize(new Dimension(100,40));
        panelPrzyciskow.add(takButton);
        panelPrzyciskow.add(nieButton);
        add(panelPrzyciskow, BorderLayout.SOUTH);

        takButton.addActionListener(e -> {
            System.exit(0);
        });
        nieButton.addActionListener(e -> {
            dialog.dispose();
        });
    }
}
