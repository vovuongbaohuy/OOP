import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Frame2 extends DefaultFrame {
    private JButton selectedImagePanelButton;
    private ImageIcon[] initialImageIcons;

    public Frame2() {
        super();
        super.getContentPane().setBackground(new Color(55, 159, 55));

        // Create the main panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(375, 100, 450, 450);

        // Create default layout for main panel buttons
        for (int i = 0; i < 9; i++) {
            JButton button = createPanelButton(i + 1);
            button.addActionListener(new MainPanelButtonListener(button));
            panel.add(button);
        }

        // Add the main panel to the frame
//        super.add(panel, BorderLayout.NORTH);
        super.add(panel);


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

            JButton button = createImagePanelButton("images/" + (i + 1) + ".jpg", i + 10);
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

    public class ImagePanelButtonListener implements ActionListener {
        private final JButton imagePanelButton;
        private final int buttonIndex;

        // Array to store clicked button indexes (instance variable)
        private List<Integer> clickedButtonIndexes = new ArrayList<>();

        public ImagePanelButtonListener(JButton imagePanelButton, int buttonIndex) {
            this.imagePanelButton = imagePanelButton;
            this.buttonIndex = buttonIndex;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (selectedImagePanelButton != null) {
                // Get the icon from the clicked button in the image panel
                ImageIcon selectedImageIcon = (ImageIcon) imagePanelButton.getIcon();

                if (selectedImageIcon != null) {
                    // Get the file path of the image from the image panel button
                    String imagePath = getImagePathFromButton(imagePanelButton);

                    // Create an ImageIcon directly from the file path
                    ImageIcon originalImageIcon = new ImageIcon(imagePath);

                    // Scale the image to 200x200 pixels
                    Image scaledImage = originalImageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_REPLICATE);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);

                    // Replace the image in the main panel button with the scaled image
                    if (selectedImagePanelButton.getIcon() == null) {
                        selectedImagePanelButton.setIcon(scaledIcon);
                        // Set the icon of the clicked button in the image panel to null (remove the icon)
                        imagePanelButton.setIcon(null);

                        // Update the array with the clicked button index
                        updateClickedButtonIndexes(buttonIndex);
                    }

                } else {
                    if (selectedImagePanelButton.getIcon() != null) {
                        // If it was blank, restore the initial image of the clicked button in the image panel
                        imagePanelButton.setIcon(initialImageIcons[buttonIndex]);

                        // Reset the icon of the clicked button in the main panel to blank
                        selectedImagePanelButton.setIcon(null);

                        // Update the array with the clicked button index
                        updateClickedButtonIndexes(buttonIndex);
                    }
                }

                selectedImagePanelButton = null;
            }
        }

        // Method to update the array with the clicked button index
        private void updateClickedButtonIndexes(int buttonIndex) {
            if (!clickedButtonIndexes.contains(buttonIndex)) {
                clickedButtonIndexes.add(buttonIndex);
            }

            // Print the array for demonstration purposes
            System.out.println("Clicked Button Indexes: " + clickedButtonIndexes);
        }
    }


    private String getImagePathFromButton(JButton button) {
        // Assuming that the image path is stored as the action command of the button
        return button.getActionCommand();
    }

    private JButton createPanelButton(int number) {
        JButton button = new JButton();
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(200, 200));
        button.setName(Integer.toString(number));
        return button;
    }
    private JButton createImagePanelButton(String imagePath, int number) {
        ImageIcon img = new ImageIcon(imagePath);
        Image newImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        img = new ImageIcon(newImg);

        JButton button = new JButton(img);
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(100, 100));

        // Set the image path as the action command
        button.setActionCommand(imagePath);
        button.setName(Integer.toString(number));

        return button;
    }

    private JButton createRotatePanelButton(int number) {
        JButton button = new JButton(Integer.toString(number));
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(50, 50));

        return button;
    }


}