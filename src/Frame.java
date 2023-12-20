import javax.swing.*;
import java.awt.*;

public class Frame {
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
}
