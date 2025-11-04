import javax.swing.*;
import java.awt.*;

public class PanelMisje extends JPanel {
    private DefaultListModel<String> missionsModel;
    private JList<String> missionsList;

    public PanelMisje(JDialog dialog) {
        setPreferredSize(new Dimension(780, 600));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(new Color(83,67,192),5));

        // Tytuł
        JPanel panelTytul = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelTytul.setBackground(new Color(83,67,192));
        JLabel tytul = new JLabel("Misje");
        tytul.setForeground(Color.white);
        tytul.setFont(new Font("Arial", Font.BOLD, 20));
        panelTytul.add(tytul);
        add(panelTytul,BorderLayout.NORTH);


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




        missionsModel = new DefaultListModel<>();
        missionsList = new JList<>(missionsModel);

        JScrollPane missionsScrollPane = new JScrollPane(missionsList);
        missionsScrollPane.setBorder(null);
        add(missionsScrollPane, BorderLayout.CENTER);


    }
}
