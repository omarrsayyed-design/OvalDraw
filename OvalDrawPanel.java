import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class OvalDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);
        g.fillOval(0, 0, getWidth(), getHeight());
    }
}