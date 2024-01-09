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

    private void handleImagePanelButtonClick() {
        if (frame.getSelectedImagePanelButton() != null) {
            ImageIcon selectedImageIcon = (ImageIcon) imagePanelButton.getIcon();

            if (selectedImageIcon != null) {
                String imagePath = getImagePathFromButton(imagePanelButton);
                ImageIcon originalImageIcon = new ImageIcon(imagePath);
                Image scaledImage = originalImageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_REPLICATE);
                ImageIcon scaledIcon = new ImageIcon(scaledImage);

                if (frame.getSelectedImagePanelButton().getIcon() == null) {
                    frame.getSelectedImagePanelButton().setIcon(scaledIcon);
                    imagePanelButton.setIcon(null);
                    updateClickedButtonIndexes(buttonIndex);
                }
            } else {
                if (frame.getSelectedImagePanelButton().getIcon() != null) {
                    imagePanelButton.setIcon(initialImageIcons[buttonIndex]);
                    frame.getSelectedImagePanelButton().setIcon(null);
                    updateClickedButtonIndexes(buttonIndex);
                }
            }

            frame.setSelectedImagePanelButton(null);
        }
    }

    private void updateClickedButtonIndexes(int buttonIndex) {
        if (!clickedButtonIndexes.contains(buttonIndex)) {
            clickedButtonIndexes.add(buttonIndex);
        }
        buttonIndex = buttonIndex + 1;
        if (imagePanelButton.getIcon() == null) {
            System.out.println("Puzzle " + buttonIndex + " is picked " );
        }
        else{
            System.out.println("Puzzle " + buttonIndex + " is removed");
        }
    }

    private String getImagePathFromButton(JButton button) {
        // Assuming that the image path is stored as the action command of the button
        return button.getActionCommand();
    }
}
