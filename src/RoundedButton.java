import javax.swing.*;
import java.awt.*;

public class RoundedButton extends JButton {
    public RoundedButton(String text) {
        super(text);
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
    }

    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray); // this is not the color of the button
        } else {
            g.setColor(getBackground());
        }
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 40, 40);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 40, 40);
    }

    public boolean contains(int x, int y) {
        if ((getWidth() / 2 - x) * (getWidth() / 2 - x) + (getHeight() / 2 - y) * (getHeight() / 2 - y) <= getWidth() / 2 * getHeight() / 2) {
            return true;
        } else {
            return false;
        }
    }
}
