import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame1 extends DefaultFrame{
    public Frame1(){
        super();
        JButton button = new JButton("Play");
        button.setBounds(400, 600, 400, 50);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
                Frame2 frame2 = new Frame2();
                frame2.setVisible(true);
            }
        });

        super.add(button);
        super.setLayout(null);
        super.setVisible(true);
    }
}
