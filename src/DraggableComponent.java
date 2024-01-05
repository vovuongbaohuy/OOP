import javax.swing.*;
import java.awt.event.*;

public class DraggableComponent extends JComponent {
    private int x, y;

    public DraggableComponent() {
        super();
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                setLocation(getLocation().x + e.getX() - x, getLocation().y + e.getY() - y);
            }
        });
    }
}
