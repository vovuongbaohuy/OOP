import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitButtonListener implements ActionListener {
    private final Frame2 frame2;

    public SubmitButtonListener(Frame2 frame2) {
        this.frame2 = frame2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (checkAllIconsNull()) {
            // Ask for confirmation
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                // User clicked "Yes", perform your desired action (e.g., call a check function)
                Checkfunction checkfunction = new Checkfunction();
                checkfunction.printSquaredMatrix(frame2.getBoard());

                boolean checkSolution = Checkfunction.checkSolution(frame2.getBoard());
                System.out.println(checkSolution);
            }
        } else {
            // Handle the case where not all icons are null if needed
            JOptionPane.showMessageDialog(null, "Please set all images before submitting.");
        }
    }

    private boolean checkAllIconsNull() {
        for (Component component : frame2.imagePanel.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                if (button.getIcon() != null) {
                    return false; // At least one icon is not null
                }
            }
        }
        return true; // All icons are null
    }
}
