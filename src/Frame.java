//import javax.swing.*;
//import java.awt.*;
//import java.util.List;
//import java.util.ArrayList;
//
//public class Frame {
//    public static void main(String[] args){
//        JFrame frame = new JFrame();
////        frame.setTitle("Verflixt Spiel");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.setSize(1200,800);
//        frame.setVisible(true);
//        frame.setLayout(null);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(3, 3));
//
//
//        // Adjust the x-coordinate to create a small distance from the left side
//        // Adjust the width to leave a small distance from the right side
//        panel.setBounds(50, 0, frame.getWidth() - 100, (int) (frame.getHeight() * 2.0 / 3.0));
//
//
//        //Create a default layout for the board
//        for(int i = 0; i < 9; i++ ){
//            ImageIcon img = new ImageIcon("images/snowflake.jpg");
//            Image newImg = img.getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH);
//            img = new ImageIcon(newImg);
//
//            JLabel imageLabel = new JLabel(img);
//            panel.add(imageLabel);
//        }
//
//        frame.add(panel,BorderLayout.NORTH);
//        frame.revalidate();
//        frame.repaint();
//
//        JPanel imagepanel = new JPanel();
//
//        int[] images = {1,2,3,4,5,6,7,8,9};
//
//        int panelHeight = 180; // Adjust the height as needed
//        imagepanel.setBounds(0, frame.getHeight() - panelHeight, 1190, panelHeight);
//
//        // set pieces at the bottom of the game
//        for(int i=0; i < images.length; i++){
//            ImageIcon img = new ImageIcon("images/" + images[i]+".jpg");
//            Image newImg = img.getImage().getScaledInstance(120,140,Image.SCALE_SMOOTH);
//            img = new ImageIcon(newImg);
//
//            JLabel imageLabel = new JLabel(img);
//            imagepanel.add(imageLabel);
//        }
//        frame.add(imagepanel);
//        frame.revalidate();
//        frame.repaint();
//    }
//}