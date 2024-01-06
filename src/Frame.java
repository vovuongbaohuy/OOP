import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class Frame {
    private static ImageIcon selectedImage; // Added variable to keep track of the selected image
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("Verflixt Spiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1200,800);
        frame.setVisible(true);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(300, 0, frame.getWidth() - 600, (int) (frame.getHeight() * 2.0 / 3.0));

        //Create a default layout for the board
        for(int i = 0; i < 9; i++ ){
            ImageIcon img = new ImageIcon("images/snowflake.jpg");
            Image newImg = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);

            JLabel imageLabel = new JLabel(img);
            panel.add(imageLabel);

            // Add click listener to each label in the grid layout
            imageLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    if(selectedImage != null){
                        //Get the size of the label in the grid layout
                        int labelWidth = imageLabel.getWidth();
                        int labelHeight = imageLabel.getHeight();

                        //Scale the selected image to match the size of the label
                        Image selectedImg = selectedImage.getImage().getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                        ImageIcon resizedImage = new ImageIcon(selectedImg);
                        imageLabel.setIcon(resizedImage); // Set the selected image to the clicked box
                    }
                }
            });
        }

        frame.add(panel,BorderLayout.NORTH);
        frame.revalidate();
        frame.repaint();

        JPanel imagepanel = new JPanel();
        int[] images = {1,2,3,4,5,6,7,8,9};
        int panelHeight = 100; // Adjust the height as needed
        imagepanel.setBounds(0, 650, 1200, panelHeight);

        // set pieces at the bottom of the game
        for(int i=0; i < images.length; i++){
            ImageIcon img = new ImageIcon("images/" + images[i]+".jpg");
            Image newImg = img.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);

            JLabel imageLabel = new JLabel(img);
            imagepanel.add(imageLabel);

            ImageIcon originalIcon = (ImageIcon) imageLabel.getIcon();
            ImageIcon finalImg = img;
            ImageIcon finalImg1 = img;
            imageLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    selectedImage = finalImg1; // Set the selected image
                    System.out.println("Clicked");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    BufferedImage originalImage = convertImageIconToBufferedImage(originalIcon);
                    BufferedImage blurredImage = blurImage(originalImage, 10); // Apply blur
                    ImageIcon blurredIcon = new ImageIcon(blurredImage);
                    imageLabel.setIcon(blurredIcon);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    imageLabel.setIcon(originalIcon); // Restore original image
                }
            });
        }
        frame.add(imagepanel);
        frame.revalidate();
        frame.repaint();

        // Create a new button
        JButton button = new JButton("Submit!");
        button.setBounds(400, 600, 400, 50);

        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);

        // Repaint the frame
        frame.repaint();
    }

    private static void addHoverBlurEffect(JLabel label) {
        ImageIcon originalIcon = (ImageIcon) label.getIcon();
        BufferedImage originalImage = convertImageIconToBufferedImage(originalIcon);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                BufferedImage blurredImage = blurImage(originalImage, 10); // Apply blur
                ImageIcon blurredIcon = new ImageIcon(blurredImage);
                label.setIcon(blurredIcon);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setIcon(originalIcon); // Restore original image
            }
        });
    }

    public static BufferedImage blurImage(BufferedImage originalImage, int blurRadius) {
        BufferedImage blurredImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_ARGB);

        float[] blurMatrix = new float[blurRadius * blurRadius];
        for (int i = 0; i < blurMatrix.length; i++) {
            blurMatrix[i] = 1.0f / blurMatrix.length;
        }

        Kernel kernel = new Kernel(blurRadius, blurRadius, blurMatrix);
        ConvolveOp op = new ConvolveOp(kernel);
        op.filter(originalImage, blurredImage);

        return blurredImage;
    }

    public static BufferedImage convertImageIconToBufferedImage(ImageIcon icon) {
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.createGraphics();
        icon.paintIcon(null, g, 0, 0);
        g.dispose();
        return image;
    }
}