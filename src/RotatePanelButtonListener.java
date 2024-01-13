import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class RotatePanelButtonListener implements ActionListener {
    private final int buttonNumber;
    private final JPanel mainPanel;
    private final Frame2 frame2;
    public int[] x = new int[9];

    public RotatePanelButtonListener(int buttonNumber, JPanel mainPanel, Frame2 frame2) {
        this.buttonNumber = buttonNumber;
        this.mainPanel = mainPanel;
        this.frame2 =  frame2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Rotate the image of the corresponding button in the main panel
        for (Component component : mainPanel.getComponents()) {
            if (component instanceof JButton) {
                JButton mainPanelButton = (JButton) component;
                if (Integer.parseInt(mainPanelButton.getName()) == buttonNumber) {
                    handleRotatePanelButtonClick(mainPanelButton);
                    break;
                }
            }
        }
    }
    private void handleRotatePanelButtonClick(JButton button) {
        // Get the icon from the button
        ImageIcon buttonIcon = (ImageIcon) button.getIcon();
        Card_1 card_1 = new Card_1();
        Card_2 card_2 = new Card_2();
        Card_3 card_3 = new Card_3();
        Card_4 card_4 = new Card_4();
        Card_5 card_5 = new Card_5();
        Card_6 card_6 = new Card_6();
        Card_7 card_7 = new Card_7();
        Card_8 card_8 = new Card_8();
        Card_9 card_9 = new Card_9();



        if (buttonIcon != null) {
            // Rotate the image
            if (buttonNumber == 1) {
                int row = 0;
                int column = 0;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 2) {
                int row = 0;
                int column = 1;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 3) {
                int row = 0;
                int column = 2;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 4) {
                int row = 1;
                int column = 0;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 5) {
                int row = 1;
                int column = 1;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 6) {
                int row = 1;
                int column = 2;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 7) {
                int row = 2;
                int column = 0;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 8) {
                int row = 2;
                int column = 1;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            if (buttonNumber == 9) {
                int row = 2;
                int column = 2;
                if (frame2.board[row][column] != null) {
                    if (frame2.rotateTime[buttonNumber - 1] == 0) {
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " first time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 1){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " second time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 2){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " rotate right" + " third time");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] += 1;
                    }
                    else if (frame2.rotateTime[buttonNumber - 1] == 3){
                        if (Objects.equals(frame2.board[row][column].cardName, "1"))
                        {
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            card_1.rotateRight();
                            frame2.board[row][column] = card_1;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "2"))
                        {
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            card_2.rotateRight();
                            frame2.board[row][column] = card_2;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "3"))
                        {
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            card_3.rotateRight();
                            frame2.board[row][column] = card_3;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "4"))
                        {
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            card_4.rotateRight();
                            frame2.board[row][column] = card_4;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "5"))
                        {
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            card_5.rotateRight();
                            frame2.board[row][column] = card_5;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "6"))
                        {
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            card_6.rotateRight();
                            frame2.board[row][column] = card_6;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "7"))
                        {
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            card_7.rotateRight();
                            frame2.board[row][column] = card_7;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "8"))
                        {
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            card_8.rotateRight();
                            frame2.board[row][column] = card_8;
                        }
                        else if (Objects.equals(frame2.board[row][column].cardName, "9"))
                        {
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            card_9.rotateRight();
                            frame2.board[row][column] = card_9;
                        }
                        System.out.println("Puzzle " + frame2.board[row][column].cardName + " in square " + "[" + row + "]" + "[" + column + "]" + " is reset default");
                        System.out.println();
                        frame2.rotateTime[buttonNumber - 1] = 0;
                    }
                }
            }
            Image rotatedImage = rotateImage(buttonIcon.getImage(), Math.toRadians(90));
            button.setIcon(new ImageIcon(rotatedImage));

        }
    }

    private Image rotateImage(Image image, double angle) {
        AffineTransform transform = new AffineTransform();
        transform.rotate(angle, image.getWidth(null) / 2.0, image.getHeight(null) / 2.0);

        BufferedImage rotatedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TRANSLUCENT);
        Graphics2D g = rotatedImage.createGraphics();
        g.setTransform(transform);
        g.drawImage(image, 0, 0, null);
        g.dispose();

        return rotatedImage;
    }
}