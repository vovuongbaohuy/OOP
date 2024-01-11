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
//                    updateClickedButtonIndexes(buttonIndex);
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 1){
                        int row = 0;
                        int column = 0;
                        Card_1 card_1 = new Card_1();
                        board[row][column] = card_1;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");

                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 2){
                        int row = 0;
                        int column = 1;
                        Card_2 card_2 = new Card_2();
                        board[row][column] = card_2;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 3){
                        int row = 0;
                        int column = 1;
                        Card_3 card_3 = new Card_3();
                        board[row][column] = card_3;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 4){
                        int row = 1;
                        int column = 0;
                        Card_4 card_4 = new Card_4();
                        board[row][column] = card_4;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 5){
                        int row = 1;
                        int column = 1;
                        Card_5 card_5 = new Card_5();
                        board[row][column] = card_5;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 6){
                        int row = 1;
                        int column = 2;
                        Card_6 card_6 = new Card_6();
                        board[row][column] = card_6;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 7){
                        int row = 2;
                        int column = 0;
                        Card_7 card_7 = new Card_7();
                        board[row][column] = card_7;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 8){
                        int row = 2;
                        int column = 1;
                        Card_8 card_8 = new Card_8();
                        board[row][column] = card_8;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 9){
                        int row = 2;
                        int column = 2;
                        Card_9 card_9 = new Card_9();
                        board[row][column] = card_9;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
                    }
                }
            } else {
                if (frame.getSelectedImagePanelButton().getIcon() != null) {
                    // If it was blank, restore the initial image of the clicked button in the image panel
                    imagePanelButton.setIcon(initialImageIcons[buttonIndex]);

                    // Reset the icon of the clicked button in the main panel to blank
                    frame.getSelectedImagePanelButton().setIcon(null);
//                    updateClickedButtonIndexes(buttonIndex);
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 1){
                        int row = 0;
                        int column = 0;
                        board[row][column] = null;
                        int cardnumber = buttonIndex;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 2){
                        int row = 0;
                        int column = 1;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 3){
                        int row = 0;
                        int column = 1;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 4){
                        int row = 1;
                        int column = 0;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 5){
                        int row = 1;
                        int column = 1;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 6){
                        int row = 1;
                        int column = 2;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 7){
                        int row = 2;
                        int column = 0;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 8){
                        int row = 2;
                        int column = 1;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                    if (Integer.parseInt(frame.getSelectedButtonName()) == 9){
                        int row = 2;
                        int column = 2;
                        board[row][column] = null;
                        int cardnumber = buttonIndex + 1;
                        System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
                    }
                }
            }

            frame.setSelectedImagePanelButton(null);
        }
        return board;
    }

//    private void updateClickedButtonIndexes(int buttonIndex) {
//        if (!clickedButtonIndexes.contains(buttonIndex)) {
//            clickedButtonIndexes.add(buttonIndex);
//        }
//        int cardnumber = buttonIndex + 1;
//        if (imagePanelButton.getIcon() == null) {
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 1){
//                int row = 0;
//                int column = 0;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 2){
//                int row = 0;
//                int column = 1;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 3){
//                int row = 0;
//                int column = 2;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 4){
//                int row = 1;
//                int column = 0;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 5){
//                int row = 1;
//                int column = 1;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 6){
//                int row = 1;
//                int column = 2;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 7){
//                int row = 2;
//                int column = 0;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 8){
//                int row = 2;
//                int column = 1;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 9){
//                int row = 2;
//                int column = 2;
//                System.out.println("Puzzle " + cardnumber + " is place into square " + "[" + row + "]" + "[" + column + "]");
//            }
//        }
//        else{
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 1){
//                int row = 0;
//                int column = 0;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 2){
//                int row = 0;
//                int column = 1;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 3){
//                int row = 0;
//                int column = 2;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 4){
//                int row = 1;
//                int column = 0;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 5){
//                int row = 1;
//                int column = 1;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 6){
//                int row = 1;
//                int column = 2;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 7){
//                int row = 2;
//                int column = 0;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 8){
//                int row = 2;
//                int column = 1;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//            if (Integer.parseInt(frame.getSelectedButtonName()) == 9){
//                int row = 2;
//                int column = 2;
//                System.out.println("Puzzle " + cardnumber + " is removed from square " + "[" + row + "]" + "[" + column + "]");
//            }
//        }
//    }

    private String getImagePathFromButton(JButton button) {
        // Assuming that the image path is stored as the action command of the button
        return button.getActionCommand();
    }
}