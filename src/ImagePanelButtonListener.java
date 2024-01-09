import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ImagePanelButtonListener implements ActionListener {
    private final JButton imagePanelButton;
    private final int buttonIndex;
    private final JButton selectedImagePanelButton;
    private final ImageIcon[] initialImageIcons;
    private final List<Integer> clickedButtonIndexes;
    private final Frame2 frame;
    public Card[][] board = new Card[3][3];

    public ImagePanelButtonListener(JButton imagePanelButton, int buttonIndex,
                                    JButton selectedImagePanelButton, ImageIcon[] initialImageIcons,
                                    List<Integer> clickedButtonIndexes, Frame2 frame) {
        this.imagePanelButton = imagePanelButton;
        this.buttonIndex = buttonIndex;
        this.selectedImagePanelButton = selectedImagePanelButton;
        this.initialImageIcons = initialImageIcons;
        this.clickedButtonIndexes = clickedButtonIndexes;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handleImagePanelButtonClick();
    }

    public Card[][] handleImagePanelButtonClick() {
        if (frame.getSelectedImagePanelButton() != null) {
            // Get the icon from the clicked button in the image panel
            ImageIcon selectedImageIcon = (ImageIcon) imagePanelButton.getIcon();

            if (selectedImageIcon != null) {
                // Get the file path of the image from the image panel button
                String imagePath = getImagePathFromButton(imagePanelButton);

                // Create an ImageIcon directly from the file path
                ImageIcon originalImageIcon = new ImageIcon(imagePath);

                // Scale the image to 150x150 pixels
                Image scaledImage = originalImageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_REPLICATE);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);

                // Replace the image in the main panel button with the scaled image
                if (frame.getSelectedImagePanelButton().getIcon() == null) {
                    frame.getSelectedImagePanelButton().setIcon(scaledIcon);
                    // Set the icon of the clicked button in the image panel to null (remove the icon)
                    imagePanelButton.setIcon(null);
//                    if(buttonIndex == 1){
//                        Card_1 card1 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card1;
//                    }
//                    else if (buttonIndex == 2) {
//                        Card_2 card2 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card2;
//                    }
//                    else if (buttonIndex == 3) {
//                        Card_3 card3 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card3;
//                    }
//                    else if (buttonIndex == 4) {
//                        Card_4 card4 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card4;
//                    }
//                    else if (buttonIndex == 5) {
//                        Card_5 card5 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card5;
//                    }
//                    else if (buttonIndex == 6) {
//                        Card_6 card6 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card6;
//                    }
//                    else if (buttonIndex == 7) {
//                        Card_7 card7 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card7;
//                    }
//                    else if (buttonIndex == 8) {
//                        Card_8 card8 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card8;
//                    }
//                    else if (buttonIndex == 9) {
//                        Card_9 card9 = null;
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = card9;
//                    }
                    updateClickedButtonIndexes(buttonIndex);
                }
            } else {
                if (frame.getSelectedImagePanelButton().getIcon() != null) {
                    // If it was blank, restore the initial image of the clicked button in the image panel
                    imagePanelButton.setIcon(initialImageIcons[buttonIndex]);

                    // Reset the icon of the clicked button in the main panel to blank
                    frame.getSelectedImagePanelButton().setIcon(null);
//                    if (buttonIndex == 1){
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 2) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 3) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 4) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 5) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 6) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 7) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 8) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
//                    else if (buttonIndex == 9) {
//                        board[buttonIndex - 1][Integer.parseInt(frame.getSelectedButtonName())] = null;
//                    }
                    updateClickedButtonIndexes(buttonIndex);
                }
            }

            frame.setSelectedImagePanelButton(null);
        }
        return board;
    }

    private void updateClickedButtonIndexes(int buttonIndex) {
        if (!clickedButtonIndexes.contains(buttonIndex)) {
            clickedButtonIndexes.add(buttonIndex);
        }
        buttonIndex = buttonIndex + 1;
        if (imagePanelButton.getIcon() == null) {
            System.out.println("Puzzle " + buttonIndex + " is place into square " + frame.getSelectedButtonName());
        }
        else{
            System.out.println("Puzzle " + buttonIndex + " is removed from square " + frame.getSelectedButtonName());
        }
    }

    private String getImagePathFromButton(JButton button) {
        // Assuming that the image path is stored as the action command of the button
        return button.getActionCommand();
    }
}
