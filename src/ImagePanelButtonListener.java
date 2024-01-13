import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ImagePanelButtonListener implements ActionListener {
    private final JButton imagePanelButton;
    private int imagePanelButtonIndex;
    private final ImageIcon[] initialImageIcons;
    private final Frame2 frame2;
    public ImagePanelButtonListener(JButton imagePanelButton, int imagePanelButtonIndex,
                                    JButton selectedImagePanelButton, ImageIcon[] initialImageIcons,
                                    List<Integer> clickedButtonIndexes, Frame2 frame2) {
        this.imagePanelButton = imagePanelButton;
        this.imagePanelButtonIndex = imagePanelButtonIndex;
        this.initialImageIcons = initialImageIcons;
        this.frame2 = frame2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        handleImagePanelButtonClick();
    }

    public void handleImagePanelButtonClick() {
        if (frame2.getSelectedImagePanelButton() != null) {
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
                if (frame2.getSelectedImagePanelButton().getIcon() == null) {
                    frame2.getSelectedImagePanelButton().setIcon(scaledIcon);
                    updateImagePathForButton(frame2.getSelectedImagePanelButton(), imagePath);
                    // Set the icon of the clicked button in the image panel to null (remove the icon)
                    imagePanelButton.setIcon(null);
                    // updateClickedButtonIndexes(buttonIndex);
                    if (Integer.parseInt(frame2.getSelectedButtonName()) == 1){
                        int row = 0;
                        int column = 0;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[0] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 2) {
                        int row = 0;
                        int column = 1;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[1] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 3){
                        int row = 0;
                        int column = 2;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[2] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 4){
                        int row = 1;
                        int column = 0;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[3] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 5){
                        int row = 1;
                        int column = 1;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[4] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 6){
                        int row = 1;
                        int column = 2;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[5] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 7){
                        int row = 2;
                        int column = 0;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[6] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 8){
                        int row = 2;
                        int column = 1;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[7] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 9){
                        int row = 2;
                        int column = 2;
                        int cardnumber = imagePanelButtonIndex + 1;
                        if(cardnumber == 1){
                            Card_1 card_1 = new Card_1();
                            frame2.board[row][column] = card_1;
                        }
                        else if(cardnumber == 2){
                            Card_2 card_2 = new Card_2();
                            frame2.board[row][column] = card_2;
                        }
                        else if(cardnumber == 3){
                            Card_3 card_3 = new Card_3();
                            frame2.board[row][column] = card_3;
                        }
                        else if(cardnumber == 4){
                            Card_4 card_4 = new Card_4();
                            frame2.board[row][column] = card_4;
                        }
                        else if(cardnumber == 5){
                            Card_5 card_5 = new Card_5();
                            frame2.board[row][column] = card_5;
                        }
                        else if(cardnumber == 6){
                            Card_6 card_6 = new Card_6();
                            frame2.board[row][column] = card_6;
                        }
                        else if(cardnumber == 7){
                            Card_7 card_7 = new Card_7();
                            frame2.board[row][column] = card_7;
                        }
                        else if(cardnumber == 8){
                            Card_8 card_8 = new Card_8();
                            frame2.board[row][column] = card_8;
                        }
                        else if(cardnumber == 9){
                            Card_9 card_9 = new Card_9();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println(frame2.mainPanelButtonIndex[8] + " " + frame2.imagePanelButtonIndex[imagePanelButtonIndex]);
                        System.out.println("Puzzle " + cardnumber + " is placed into square " + "[" + row + "]" + "[" + column + "]");
                        System.out.println();
                    }
                }
            }
            else {
                if (frame2.getSelectedImagePanelButton().getIcon() != null) {
                    // If it was blank, restore the initial image of the clicked button in the image panel
//                    Image scaledImage = originalImageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_REPLICATE);
//                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
                    // Get the file path of the image from the image panel button
                    String imagePath = getImagePathFromButton(frame2.getSelectedImagePanelButton());

                    // Create an ImageIcon directly from the file path
                    ImageIcon originalImageIcon = new ImageIcon(imagePath);

                    // Get the original image from the ImageIcon
                    Image originalImage = originalImageIcon.getImage();

                    // Scale the image to 150x150 pixels
                    Image scaledImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                    // Create a new ImageIcon from the scaled image
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);

                    // Set the scaled ImageIcon to the imagePanelButton
                    imagePanelButton.setIcon(scaledIcon);

                    // update image path for buttons in image panel
                    updateImagePathForButton(imagePanelButton, imagePath);
                    // Reset the icon of the clicked button in the main panel to blank
                    frame2.getSelectedImagePanelButton().setIcon(null);
                    if (Integer.parseInt(frame2.getSelectedButtonName()) == 1){
                        int row = 0;
                        int column = 0;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 2){
                        int row = 0;
                        int column = 1;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 3){
                        int row = 0;
                        int column = 2;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 4){
                        int row = 1;
                        int column = 0;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 5){
                        int row = 1;
                        int column = 1;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 6){
                        int row = 1;
                        int column = 2;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 7){
                        int row = 2;
                        int column = 0;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 8){
                        int row = 2;
                        int column = 1;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                    else if (Integer.parseInt(frame2.getSelectedButtonName()) == 9){
                        int row = 2;
                        int column = 2;
                        int cardnumber = imagePanelButtonIndex + 1;
                        imagePanelButtonIndex = Integer.parseInt(frame2.board[row][column].cardName) - 1;
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " is removed from square " + "[" + row + "]" + "[" + column + "]");

                        // set the rotateTime[frame2.getSelectedButtonName] = 0 when puzzle piece is remove
                        System.out.println("rotateTime[" + imagePanelButtonIndex + "] " + "before being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1] = 0;
                        System.out.println("rotateTime[" + Integer.parseInt(frame2.getSelectedButtonName()) + "] " + "after being remove: " + frame2.rotateTime[Integer.parseInt(frame2.getSelectedButtonName()) - 1]);
                        System.out.println();

                        if(cardnumber == 1){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 2){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 3){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 4){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 5){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 6){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 7){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 8){
                            frame2.board[row][column] = null;
                        }
                        else if(cardnumber == 9){
                            frame2.board[row][column] = null;
                        }
                    }
                }
            }
            frame2.setSelectedImagePanelButton(null);
        }

    }

    private String getImagePathFromButton(JButton button) {
        // Assuming that the image path is stored as the action command of the button
        return button.getActionCommand();
    }
    private void updateImagePathForButton(JButton button, String newImagePath) {
        // Set the new image path as the action command of the button
        button.setActionCommand(newImagePath);
    }
}