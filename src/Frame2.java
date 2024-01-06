import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class Frame2 extends DefaultFrame implements ActionListener {
    public Frame2(){
        super();
        super.getContentPane().setBackground(new Color(55,159, 55));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(300, 0, super.getWidth() - 600, (int) (super.getHeight() * 2.0 / 3.0));

//Create a default layout for the board
        for(int i = 0; i < 9; i++ ){
            ImageIcon img = new ImageIcon("images/snowflake.jpg");
            Image newImg = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);
            JButton button = new JButton(img);
//            button.setBorderPainted(true);
            panel.add(button);
        }


        super.add(panel,BorderLayout.NORTH);
        super.revalidate();
        super.repaint();

        JPanel imagepanel = new JPanel();
        int[] images = {1,2,3,4,5,6,7,8,9};
        int panelHeight = 100; // Adjust the height as needed
        imagepanel.setBounds(0, 650, 1200, panelHeight);
        imagepanel.setBackground(new Color(20, 87,20));

        // set pieces at the bottom of the game
        for(int i=0; i < images.length; i++){
            ImageIcon img = new ImageIcon("images/" + images[i]+".jpg");
            Image newImg = img.getImage().getScaledInstance(100,100,Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);

            JLabel imageLabel = new JLabel(img);
            imagepanel.add(imageLabel);

            ImageIcon originalIcon = (ImageIcon) imageLabel.getIcon();
            imageLabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
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
        super.add(imagepanel);
        super.revalidate();
        super.repaint();

        // Create a new button
        JButton button = new JButton("Submit!");
        button.setBounds(400, 600, 400, 50);

        super.add(button);
        super.setLayout(null);
        super.setVisible(true);

        // Repaint the frame
        super.repaint();
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void chooseImage(){

    }
}