import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends DefaultFrame {
    public Frame2(){
        super();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        panel.setBounds(300, 0, super.getWidth() - 600, (int) (super.getHeight() * 2.0 / 3.0));

        //Create a default layout for the board
        for(int i = 0; i < 9; i++ ){
            ImageIcon img = new ImageIcon("images/snowflake.jpg");
            Image newImg = img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            img = new ImageIcon(newImg);

            JLabel imageLabel = new JLabel(img);
            panel.add(imageLabel);
        }

        super.add(panel,BorderLayout.NORTH);
        super.revalidate();
        super.repaint();

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
}