import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PrawyPanelGry extends JPanel {
    private OknoGry okno;
    private List<Element> elementy;
    private JPanel panelLista;

    public PrawyPanelGry(OknoGry okno, List<Element> elementy) {
        this.okno = okno;
        this.elementy = elementy;

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
        panelLista = new JPanel();
        panelLista.setLayout(new BoxLayout(panelLista,BoxLayout.Y_AXIS));
        panelLista.setBackground(new Color(153,140,254));

        JScrollPane scrollPane = new JScrollPane(panelLista);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(new Color(153,140,254));

        add(scrollPane,BorderLayout.CENTER);

        // Wypelnij liste elementami
        odswiezListeElementow();



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

    // Metoda do odswiezania listy elementow
    public void odswiezListeElementow() {
        panelLista.removeAll();

        for(Element element : elementy) {
            if(element.isCzyOdkryty()) {
                JPanel elementPanel = stworzPanelElementu(element);
                panelLista.add(elementPanel);
                panelLista.add(Box.createRigidArea(new Dimension(0,5)));
            }
        }

        panelLista.revalidate();
        panelLista.repaint();
    }

    private JPanel stworzPanelElementu(Element element) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(5,5));
        panel.setBackground(new Color(198, 141, 122));
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(83,67,192), 2),
                BorderFactory.createEmptyBorder(5,5,5,5)
        ));
        panel.setMaximumSize(new Dimension(280,60));

        // Ikona elementu
        ImageIcon ikona = new ImageIcon(element.getIkona());
        Image img = ikona.getImage();
        Image scaledImg = img.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        JLabel ikonaLabel = new JLabel(new ImageIcon(scaledImg));
        panel.add(ikonaLabel,BorderLayout.WEST);

        // Nazwa elementu
        JLabel nazwaLabel = new JLabel(element.getNazwa());
        nazwaLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nazwaLabel.setForeground(Color.BLACK);
        panel.add(nazwaLabel,BorderLayout.CENTER);

        // Tooltip z opisem naukowym
        panel.setToolTipText(element.getOpisNaukowy());

        return panel;
    }
}
