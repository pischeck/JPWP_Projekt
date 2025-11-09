import javax.swing.*;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        SwingUtilities.invokeLater(() -> {
            OknoGry oknoGry = new OknoGry();
            oknoGry.setVisible(true);
        });
        
    }
}
