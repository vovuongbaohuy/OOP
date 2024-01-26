import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DefaultFrame extends JFrame {
    public DefaultFrame() {
        setTitle("Verflixt Spiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(1200, 800);
        ImageIcon icon = new ImageIcon("images/ui_icon.png");
        setIconImage(icon.getImage());
        setVisible(true);
    }

    // Rest of your code...
}