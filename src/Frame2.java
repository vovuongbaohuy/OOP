import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Frame2 extends DefaultFrame {
    private JButton selectedImagePanelButton;
    private ImageIcon[] initialImageIcons;

    public Frame2() {
        super();
        super.getContentPane().setBackground(new Color(55, 159, 55));
        List<Integer> clickedButtonIndexes = new ArrayList<>();
        // Create the main panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(375, 100, 450, 450);

        // Create default layout for main panel buttons
//        for (int x = 0; x < 9; x++) {
//            JButton button = createPanelButton(x + 1);
//            MainPanelButtonListener mainPanelButtonListener = new MainPanelButtonListener(button, this);
//            button.addActionListener(mainPanelButtonListener);
//            clickedButtonIndexes.add(x);
//            panel.add(button);
//        }
        for (int x = 0; x < 9; x++) {
            JButton button = createPanelButton(x + 1);
            MainPanelButtonListener mainPanelButtonListener = new MainPanelButtonListener(button, this);
            button.addActionListener(mainPanelButtonListener);
            clickedButtonIndexes.add(x);
            panel.add(button);
        }

        // Add the main panel to the frame
        super.add(panel);

        // Create the image panel with GridLayout
        JPanel imagepanel = new JPanel(new GridLayout(1, 9));
        imagepanel.setBounds(150, 650, 900, 100);
        imagepanel.setBackground(new Color(20, 87, 20));

        // Create default layout for image panel buttons
        initialImageIcons = new ImageIcon[9];

        int[] imagePanelButtonIndex = new int[9];
        for (int i = 0; i < 9; i++) {
            ImageIcon img = new ImageIcon("images/" + (i + 1) + ".jpg");
            Image newImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);
            initialImageIcons[i] = img;

            imagePanelButtonIndex[i] = i;
            JButton button = createImagePanelButton("images/" + (i + 1) + ".jpg", i + 10);
            ImagePanelButtonListener imagePanelButtonListener = new  ImagePanelButtonListener(button, imagePanelButtonIndex[i], getSelectedImagePanelButton(), initialImageIcons, clickedButtonIndexes, this);
            button.addActionListener(imagePanelButtonListener);
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
            button.addActionListener(new RotatePanelButtonListener(i + 1, panel, imagePanelButtonIndex[i]));
            rotatepanel.add(button);
        }
        super.add(rotatepanel);

        // Create a new button
        JButton submitButton = new JButton("Submit!");
        submitButton.setBackground(Color.white);
//        submitButton.addActionListener(new SubmitButtonListener(this));
        submitButton.setBounds(400, 600, 400, 50);

        super.add(submitButton);
        super.setLayout(null);
        super.setVisible(true);
    }

    public JButton getSelectedImagePanelButton() {
        return selectedImagePanelButton;
    }

    public void setSelectedImagePanelButton(JButton selectedImagePanelButton) {
        this.selectedImagePanelButton = selectedImagePanelButton;
    }

    public JButton createPanelButton(int number) {
        JButton button = new JButton();
        button.setBorderPainted(true);
        button.setContentAreaFilled(false);
        button.setPreferredSize(new Dimension(200, 200));
        button.setName(Integer.toString(number));
        button.addMouseListener(new HoverEffectMouseListener(button));
        button.setContentAreaFilled(true);
//        button.setBorder(BorderFactory.createEmptyBorder());
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
    public String getSelectedButtonName() {
        if (selectedImagePanelButton != null) {
            return selectedImagePanelButton.getName();
        } else {
            return null; // or handle the case when no button is selected
        }
    }
}
