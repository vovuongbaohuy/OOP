import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanelButtonListener implements ActionListener {
    private final JButton mainPanelButton;
    private final Frame2 frame;

    public MainPanelButtonListener(JButton mainPanelButton, Frame2 frame) {
        this.mainPanelButton = mainPanelButton;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setSelectedImagePanelButton(mainPanelButton);
    }
}
