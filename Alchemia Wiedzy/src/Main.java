import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Gra gra = new Gra();
            OknoGry okno = new OknoGry(gra);
            okno.setVisible(true);
        });
    }
}
