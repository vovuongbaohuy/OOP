import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class DefaultFrame extends JFrame{
    public DefaultFrame() {
        setTitle("Verflixt Spiel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(true);
        setSize(1200, 800);
        setLayout(null);
        ImageIcon icon = new ImageIcon("images/ui_icon.png");
        setIconImage(icon.getImage());
        setVisible(true);
    }

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}
