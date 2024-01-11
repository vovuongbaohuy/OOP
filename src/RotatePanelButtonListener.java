import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class RotatePanelButtonListener implements ActionListener {
    private final int buttonNumber;
    private final JPanel mainPanel;
    private final int buttonIndex;

    public RotatePanelButtonListener(int buttonNumber, JPanel mainPanel, int buttonIndex) {
        this.buttonNumber = buttonNumber;
        this.mainPanel = mainPanel;
        this.buttonIndex = buttonIndex + 1;
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

        if (buttonIcon != null) {
            // Rotate the image
            Image rotatedImage = rotateImage(buttonIcon.getImage(), Math.toRadians(90));
            button.setIcon(new ImageIcon(rotatedImage));
            if (buttonNumber == 1) {
                int row = 0;
                int column = 0;
                Card_1 card_1 = new Card_1();
                card_1.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 2) {
                int row = 0;
                int column = 1;
                Card_2 card_2 = new Card_2();
                card_2.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 3) {
                int row = 0;
                int column = 2;
                Card_3 card_3 = new Card_3();
                card_3.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 4) {
                int row = 1;
                int column = 0;
                Card_4 card_4 = new Card_4();
                card_4.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 5) {
                int row = 1;
                int column = 1;
                Card_5 card_5 = new Card_5();
                card_5.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 6) {
                int row = 1;
                int column = 2;
                Card_6 card_6 = new Card_6();
                card_6.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 7) {
                int row = 2;
                int column = 0;
                Card_7 card_7 = new Card_7();
                card_7.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 8) {
                int row = 2;
                int column = 1;
                Card_8 card_8 = new Card_8();
                card_8.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
            if (buttonNumber == 9) {
                int row = 2;
                int column = 2;
                Card_9 card_9 = new Card_9();
                card_9.rotateRight();
                System.out.println("Puzzle " + buttonIndex + " in square " + "[" + row + "]" + "[" + column +"]" + " rotate right");
            }
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