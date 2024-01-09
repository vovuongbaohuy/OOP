import javax.swing.*;
import java.awt.*;

class HoverEffectMouseListener extends java.awt.event.MouseAdapter {
    private JButton button;

    public HoverEffectMouseListener(JButton button) {
        this.button = button;
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        // Light up the button when hovered
        button.setBackground(Color.LIGHT_GRAY);
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent evt) {
        // Restore the button color when not hovered
        button.setBackground(UIManager.getColor("Button.background"));
    }
}