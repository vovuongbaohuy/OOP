import javax.swing.*;
import java.awt.*;

public class Frame1 extends DefaultFrame {
    private JLabel backgroundLabel;

    public Frame1() {
        super();

        // Create a JPanel to hold the background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon imageIcon = new ImageIcon("images/background_game.jpg");
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Set the layout to null to allow absolute positioning of components
        panel.setLayout(null);

        // Create the button
        JButton button = new JButton("Play");
        button.setBounds(500, 415, 200, 55);
        button.setFont(new Font("Arial", Font.BOLD, 30));
        button.setOpaque(false);
        button.setContentAreaFilled(true);
        button.setBorderPainted(true);
        button.addActionListener(new NewFrameInitializeButtonListener());


//        JButton button = new JButton("Play");
//        button.setFont(new Font("Arial", Font.BOLD, 18));
//        button.setBounds(500, 300, 200, 200);

        // Add the components to the panel
        panel.add(button);

        // Add the panel to the frame
        super.setContentPane(panel);

        // Set the size of the frame
        super.setSize(1200, 800);

        // Set the layout to null to allow absolute positioning of components
        super.setLayout(null);

        // Set the frame to be visible
        super.setVisible(true);
    }
}