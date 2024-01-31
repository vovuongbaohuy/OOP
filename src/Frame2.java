import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;

public class Frame2 extends DefaultFrame {
    private JButton selectedImagePanelButton;
    public JLabel rotateButtonsLabel = new JLabel();
    public JPanel rotatePanel = new JPanel();
    private ImageIcon[] initialImageIcons;
    public JPanel mainPanel = new JPanel();
    public JPanel imagePanel = new JPanel();
    public int[] rotateTime = new int[9];
    public Card[][] getBoard() {
        return board;
    }
    public Card[][] board   = new Card[3][3];
    public int[] mainPanelButtonIndex = new int[9];
    public int[] imagePanelButtonIndex = new int[9];
    public Timer timer;
    public final int TIME_LIMIT = 5*60; // 5 minutes in seconds
    public JLabel timerLabel;

    public Frame2() {
        super();
        super.getContentPane().setBackground(new Color(55, 159, 55));
        List<Integer> clickedButtonIndexes = new ArrayList<>();

        // Create the main panel with GridLayout
        mainPanel.setLayout(new GridLayout(3, 3));
        mainPanel.setBounds(375, 100, 450, 450);
        for (int x = 0; x < 9; x++) {
            mainPanelButtonIndex[x] = x ;
            JButton button = createMainPanelButton(x + 1);
            MainPanelButtonListener mainPanelButtonListener = new MainPanelButtonListener(button, this);
            button.addActionListener(mainPanelButtonListener);
            clickedButtonIndexes.add(x);
            mainPanel.add(button);
        }

        // Add the main panel to the frame
        super.add(mainPanel);

        // Create the image panel with GridLayout
        imagePanel.setLayout(new GridLayout(1, 9));
        imagePanel.setBounds(150, 610, 900, 100);
        imagePanel.setBackground(new Color(20, 87, 20));

        // Create default layout for image panel buttons
        initialImageIcons = new ImageIcon[9];

        for (int i = 0; i < 9; i++) {
            ImageIcon img = new ImageIcon("images/" + (i + 1) + ".jpg");
            Image newImg = img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);
            initialImageIcons[i] = img;

            imagePanelButtonIndex[i] = i;
            JButton button = createImagePanelButton("images/" + (i + 1) + ".jpg", i + 10);
            ImagePanelButtonListener imagePanelButtonListener = new  ImagePanelButtonListener(button, imagePanelButtonIndex[i], getSelectedImagePanelButton(), initialImageIcons, clickedButtonIndexes, this);
            button.addActionListener(imagePanelButtonListener);
            imagePanel.add(button);
        }

        // Add the image panel to the frame
        super.add(imagePanel);

        // rotate panel
        rotatePanel.setLayout(new GridLayout(3, 3));
        rotatePanel.setBounds(50, 50, 150, 150);
        rotatePanel.setBackground(new Color(20, 200, 20));
        for (int i = 0; i < 9; i++) {
            JButton button = createRotatePanelButton(i + 1);
            button.addActionListener(new RotatePanelButtonListener(i + 1, mainPanel, this));
            rotatePanel.add(button);
        }
        super.add(rotatePanel);

        // Create a submit button
        JButton submitButton = new JButton("Submit!");
        submitButton.setBackground(Color.white);
        submitButton.addActionListener(new SubmitButtonListener(this));
        submitButton.setBounds(1200-300, 350, 200, 50);
        submitButton.addMouseListener(new HoverEffectMouseListener(submitButton));
        super.add(submitButton);

        // Create a restart button
        JButton restartButton = new JButton("Restart");
        restartButton.setBackground(Color.WHITE);
        restartButton.addActionListener(new RestartButtonListener());
        restartButton.setBounds(1200-300, 250, 200, 50);
        restartButton.addMouseListener(new HoverEffectMouseListener(restartButton));
        super.add(restartButton);

        // Create rotate buttons label
        rotateButtonsLabel.setText("Rotate Buttons");
        rotateButtonsLabel.setFont(new Font("Arial", Font.BOLD, 18));
        rotateButtonsLabel.setBounds(50, 0, 150, 50);
        rotateButtonsLabel.setBackground(Color.RED);
        rotateButtonsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rotateButtonsLabel.setVerticalAlignment(SwingConstants.CENTER);
        super.add(rotateButtonsLabel);

        // Create timer for frame2
        timerLabel = new JLabel();
        timerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timerLabel.setVerticalAlignment(SwingConstants.CENTER);
        timerLabel.setBounds(1000, 0, 200, 50);
        getContentPane().add(timerLabel);

        // Start the timer
        timer = new Timer(1000, new ActionListener() {
            private int timeRemaining = TIME_LIMIT;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (timeRemaining > 0) {
                    // Update the timer label
                    int minutes = timeRemaining / 60;
                    int seconds = timeRemaining % 60;
                    String timeString = String.format("%02d:%02d", minutes, seconds);
                    timerLabel.setText(timeString);
                    timeRemaining--;
                } else {
                    // Time is up, return to Frame1
                    timer.stop(); // Stop the timer
                    LooserFrame looserFrame = new LooserFrame();
                    looserFrame.setVisible(true); // Show Frame1
                    JFrame frame2 = (JFrame) SwingUtilities.getWindowAncestor(timerLabel);
                    frame2.setVisible(false); // Hide Frame2
                }
            }
        });
        timer.start();

        super.setLayout(null);
        super.setVisible(true);
    }

    public JButton getSelectedImagePanelButton() {
        return selectedImagePanelButton;
    }

    public void setSelectedImagePanelButton(JButton selectedImagePanelButton) {
        this.selectedImagePanelButton = selectedImagePanelButton;
    }

    public JButton createMainPanelButton(int number) {
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
