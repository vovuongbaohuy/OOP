import javax.swing.*;
import java.awt.*;

public class CongratulationFrame extends DefaultFrame {

    public CongratulationFrame() {
        super();

        // Create the label
        JLabel label = new JLabel("Congratulations! You Win");
        label.setFont(new Font("Arial", Font.BOLD, 48));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setForeground(new Color(0, 128, 0)); // Set text color

        RoundedButton button = new RoundedButton("Restart");
        button.setBounds(500, 415, 200, 55);
        button.setFont(new Font("Arial", Font.BOLD, 30));
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.addActionListener(new NewFrameInitializeButtonListener());
        super.add(button);
        // Add the label to the frame's content pane
        getContentPane().add(label);

        // Set frame visible
        setVisible(true);
    }
}