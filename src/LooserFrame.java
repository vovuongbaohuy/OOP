import javax.swing.*;
import java.awt.*;

public class LooserFrame extends DefaultFrame{
    public LooserFrame(){
        super();
        // Create the label
        JLabel label = new JLabel("Try Better Next Time!!!");
        label.setFont(new Font("Arial", Font.BOLD, 48));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setForeground(new Color(128, 0, 0)); // Set text color

        // Add the label to the frame
        getContentPane().add(label);

        // Set frame visible
        setVisible(true);
    }
}
