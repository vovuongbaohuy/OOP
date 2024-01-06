import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends DefaultFrame {
    private JButton selectedImagePanelButton;

    public Frame2() {
        super();
        super.getContentPane().setBackground(new Color(55, 159, 55));

        // Create the main panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(300, 0, super.getWidth() - 600, (int) (super.getHeight() * 2.0 / 3.0));

        // Create default layout for main panel buttons
        for (int i = 0; i < 9; i++) {
            ImageIcon img = new ImageIcon("images/snowflake.jpg");
            Image newImg = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);
            JButton button = new JButton(img);
            button.addActionListener(new MainPanelButtonListener(button));
            panel.add(button);
        }

        // Add the main panel to the frame
        super.add(panel, BorderLayout.NORTH);

        // Create the image panel with GridLayout
        JPanel imagepanel = new JPanel(new GridLayout(1, 9));
        imagepanel.setBounds(150, 650, 900, 100);
        imagepanel.setBackground(new Color(20, 87, 20));

        // Create default layout for image panel buttons
        for (int i = 0; i < 9; i++) {
            ImageIcon img = new ImageIcon("images/" + (i + 1) + ".jpg");
            Image newImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);

            JButton button = new JButton(img);
            button.setBorderPainted(true);
            button.setContentAreaFilled(false);
            button.setPreferredSize(new Dimension(100, 100));
            button.addActionListener(new ImagePanelButtonListener(button));
            imagepanel.add(button);
        }

        // Add the image panel to the frame
        super.add(imagepanel);

        // Create a new button
        JButton submitButton = new JButton("Submit!");
        submitButton.setBounds(400, 600, 400, 50);

        super.add(submitButton);
        super.setLayout(null);
        super.setVisible(true);

        // Repaint the frame
        super.repaint();
    }

    private class MainPanelButtonListener implements ActionListener {
        private final JButton mainPanelButton;

        public MainPanelButtonListener(JButton mainPanelButton) {
            this.mainPanelButton = mainPanelButton;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            selectedImagePanelButton = mainPanelButton;
        }
    }

    private class ImagePanelButtonListener implements ActionListener {
        private final JButton imagePanelButton;

        public ImagePanelButtonListener(JButton imagePanelButton) {
            this.imagePanelButton = imagePanelButton;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (selectedImagePanelButton != null) {
                // Get the image from the clicked button
                ImageIcon selectedImage = (ImageIcon) imagePanelButton.getIcon();

                // Scale the image to 200x200 pixels
                Image scaledImage = selectedImage.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);

                // Replace the image in the main panel button with the scaled image
                selectedImagePanelButton.setIcon(scaledIcon);

                // Set the icon of the clicked button in the image panel to null (remove the icon)
                imagePanelButton.setIcon(null);

                selectedImagePanelButton = null;
            }
        }
    }
}
