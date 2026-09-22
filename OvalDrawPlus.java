import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("Starting OvalDrawPlus...");
        JFrame OvalDrawPlusWindow = new JFrame("OvalDrawPlus");

        OvalDrawPlusWindow.setSize(400, 500); // width, height
        OvalDrawPlusWindow.setLocation(250, 150);
        OvalDrawPlusWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OvalDrawPlusWindow.add(new OvalDrawPanel());
        OvalDrawPlusWindow.setVisible(true);

        OvalDrawPlusWindow.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing OvalDrawPlus...");
            }
        });
    }
}