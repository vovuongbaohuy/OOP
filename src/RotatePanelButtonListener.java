import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class RotatePanelButtonListener implements ActionListener {
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

        BufferedImage rotatedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TRANSLUCENT);
        Graphics2D g = rotatedImage.createGraphics();
        g.setTransform(transform);
        g.drawImage(image, 0, 0, null);
        g.dispose();

        return rotatedImage;
    }
}