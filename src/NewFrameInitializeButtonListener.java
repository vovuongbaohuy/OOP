import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrameInitializeButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Frame2 frame2 = new Frame2();
        frame2.setVisible(true);
        // Hide the old frame
        ((JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource())).setVisible(false);
    }
}
