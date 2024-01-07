import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Frame2 extends DefaultFrame {
    private JButton selectedImagePanelButton;
    private ImageIcon[] initialImageIcons;

    public Frame2() {
        super();
        super.getContentPane().setBackground(new Color(55, 159, 55));

        // Create the main panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(300, 0, super.getWidth() - 600, (int) (super.getHeight() * 2.0 / 3.0));

        // Create default layout for main panel buttons
        for (int i = 0; i < 9; i++) {
            JButton button = createPanelButton(i + 1);
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
        initialImageIcons = new ImageIcon[9];
        for (int i = 0; i < 9; i++) {
            ImageIcon img = new ImageIcon("images/" + (i + 1) + ".jpg");
            Image newImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);
            initialImageIcons[i] = img;

            JButton button = createImagePanelButton("images/" + (i + 1) + ".jpg");
            button.addActionListener(new ImagePanelButtonListener(button, i));
            imagepanel.add(button);
        }

        // Add the image panel to the frame
        super.add(imagepanel);

        // rotate panel
        JPanel rotatepanel = new JPanel(new GridLayout(3, 3));
        rotatepanel.setBounds(50, 50, 150, 150);
        rotatepanel.setBackground(new Color(20, 200, 20));
        for (int i = 0; i < 9; i++) {
            JButton button = createRotatePanelButton(i + 1);
            button.addActionListener(new RotatePanelButtonListener(i + 1, panel));
            rotatepanel.add(button);
        }
        super.add(rotatepanel);

        // Create a new button
        JButton submitButton = new JButton("Submit!");
        submitButton.setBackground(Color.white);
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
        private final int buttonIndex;

        public ImagePanelButtonListener(JButton imagePanelButton, int buttonIndex) {
            this.imagePanelButton = imagePanelButton;
            this.buttonIndex = buttonIndex;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (selectedImagePanelButton != null) {
                // Get the icon from the clicked button in the image panel
                ImageIcon selectedImage = (ImageIcon) imagePanelButton.getIcon();

                if (selectedImage == null) {
                    // If it was blank, restore the initial image of the clicked button in the image panel
                    imagePanelButton.setIcon(initialImageIcons[buttonIndex]);

                    // Reset the icon of the clicked button in the main panel to blank
                    selectedImagePanelButton.setIcon(null);
                } else {
                    // Scale the image to 200x200 pixels
                    Image scaledImage = selectedImage.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);

                    // Replace the image in the main panel button with the scaled image
                    selectedImagePanelButton.setIcon(scaledIcon);

                    // Set the icon of the clicked button in the image panel to null (remove the icon)
                    imagePanelButton.setIcon(null);
                }

                selectedImagePanelButton = null;
            }
        }
    }

    private JButton createPanelButton(int number) {
        JButton button = new JButton();
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(200, 200));
        button.setName(Integer.toString(number));
        return button;
    }
    private JButton createImagePanelButton(String imagePath) {
        ImageIcon img = new ImageIcon(imagePath);
        Image newImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        img = new ImageIcon(newImg);

        JButton button = new JButton(img);
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(100, 100));

        return button;
    }

    private JButton createRotatePanelButton(int number) {
        JButton button = new JButton(Integer.toString(number));
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(50, 50));

        return button;
    }

    private class RotatePanelButtonListener implements ActionListener {
        private final int buttonNumber;
        private final JPanel mainPanel;

        public RotatePanelButtonListener(int buttonNumber, JPanel mainPanel) {
            this.buttonNumber = buttonNumber;
            this.mainPanel = mainPanel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Rotate the image of the corresponding button in the main panel
            for (Component component : mainPanel.getComponents()) {
                if (component instanceof JButton) {
                    JButton mainPanelButton = (JButton) component;
                    if (Integer.parseInt(mainPanelButton.getName()) == buttonNumber) {
                        rotateButtonImage(mainPanelButton);
                        break;
                    }
                }
            }
        }

        private void rotateButtonImage(JButton button) {
            // Get the icon from the button
            ImageIcon buttonIcon = (ImageIcon) button.getIcon();

            if (buttonIcon != null) {
                // Rotate the image
                Image rotatedImage = rotateImage(buttonIcon.getImage(), Math.toRadians(90));
                button.setIcon(new ImageIcon(rotatedImage));
            }
        }

        private Image rotateImage(Image image, double angle) {
            AffineTransform transform = new AffineTransform();
            transform.rotate(angle, image.getWidth(null) / 2.0, image.getHeight(null) / 2.0);

            BufferedImage rotatedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = rotatedImage.createGraphics();
            g.setTransform(transform);
            g.drawImage(image, 0, 0, null);
            g.dispose();

            return rotatedImage;
        }
    }
}
