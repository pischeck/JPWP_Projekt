import javax.swing.*;
import java.awt.*;

public class PanelInfoAutor  extends JPanel {
    public PanelInfoAutor(JDialog dialog) {
        setPreferredSize(new Dimension(780, 600));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(new Color(83,67,192),5));

        // Tytuł
        JPanel panelTytul = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelTytul.setBackground(new Color(83,67,192));
        JLabel tytul = new JLabel("Informacje");
        tytul.setForeground(Color.white);
        tytul.setFont(new Font("Arial", Font.BOLD, 20));
        panelTytul.add(tytul);
        add(panelTytul, BorderLayout.NORTH);

        // Informacje
        JPanel panelInformacje = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelInformacje.setBackground(Color.white);
        JTextArea informacje = new JTextArea();
        informacje.setPreferredSize(new Dimension(750, 550));
        informacje.setEditable(false);
        informacje.setFont(new Font("Arial", Font.PLAIN, 18));
        informacje.setBackground(Color.white);
        informacje.setLineWrap(true);
        informacje.setWrapStyleWord(true);
        informacje.setText("Jakub Piszczek\n" +
                "Nr indeksu: 197625\n" +
                "Kierunek: Elektronika\n" +
                "Grupa: E1A\n\n" +
                "Projekt: Alchemia Wiedzy\n" +
                "Projekt gry na potrzeby przedmiotu Języki programowania wysokiego poziomu " +
                "na uczelni Politechnika Gdańska.");
        add(new JScrollPane(informacje), BorderLayout.CENTER);
        panelInformacje.add(informacje);


        add(panelInformacje, BorderLayout.CENTER);

        // Panel przycisku powrotu
        JPanel panelPowrot = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelPowrot.setBackground(Color.white);
        JButton powrotButton = new JButton("Powrót do gry");
        powrotButton.setPreferredSize(new Dimension(120, 30));
        powrotButton.setFont(new Font("Arial", Font.PLAIN, 20));
        powrotButton.setBackground(new Color(198,141,122));
        powrotButton.setForeground(new Color(0, 0, 0));
        powrotButton.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        powrotButton.setPreferredSize(new Dimension(300, 40));
        powrotButton.addActionListener(e -> dialog.dispose());
        panelPowrot.add(powrotButton);
        add(panelPowrot, BorderLayout.SOUTH);
    }
}
