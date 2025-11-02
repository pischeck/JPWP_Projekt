import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIFactory {

    // Przycisk z ikonka -----------------------------------
    public static JButton stworzPrzyciskMenu(String iconPath, String opisPrzycisku, int wysokosc, int szerokosc) {
        ImageIcon originalIcon = new ImageIcon(iconPath);
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(szerokosc,wysokosc, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        JButton przycisk = new JButton(scaledIcon);
        przycisk.setToolTipText(opisPrzycisku);
        przycisk.setBorderPainted(false);
        przycisk.setFocusPainted(false);
        przycisk.setContentAreaFilled(false);

        // Kolory tła do przycisku
        Color normalBackground = new Color(0, 0,0 ,0); // transparentne
        Color hoverBackround = new Color(50,50,50,50); // przyciemnione polprzezroczyste
        Color pressedBackround = new Color(30,30,30,150); // przyciemnione polprzezroczyste

        przycisk.setOpaque(false);
        przycisk.setBackground(normalBackground);

        // Obsluga zmiany tla przycisku dla najechania i klikniecia
        przycisk.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                przycisk.setBackground(hoverBackround);
                przycisk.setContentAreaFilled(true);
                przycisk.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                przycisk.setBackground(normalBackground);
                przycisk.setContentAreaFilled(false);
                przycisk.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                przycisk.setBackground(pressedBackround);
                przycisk.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(przycisk.getMousePosition() != null) {
                    przycisk.setBackground(hoverBackround);
                    przycisk.repaint();
                } else {
                    przycisk.setBackground(normalBackground);
                    przycisk.setContentAreaFilled(false);
                    przycisk.repaint();
                }
            }
        });


        return przycisk;
    }






}


