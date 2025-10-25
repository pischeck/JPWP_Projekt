import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelGry extends JPanel {
    private Element elementPrzeciagany;
    private Point pozycjaPrzeciagania;

    // Obsluga zdarzen myszy
    private class ObslugaMyszy extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);
        }

        @Override
        protected void paintComponent(Graphics g);
    }
    )
}
