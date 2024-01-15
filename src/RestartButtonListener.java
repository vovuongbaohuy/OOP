import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
                // Ask for confirmation
        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to restart?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            // User clicked "Yes", perform your desired action (e.g., call a check function)
            Frame2 frame2 = new Frame2();
            frame2.setVisible(true);
            // Hide the old frame
            ((JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource())).setVisible(false);
        }
    }
}
