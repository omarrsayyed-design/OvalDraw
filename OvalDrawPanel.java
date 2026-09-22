import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class OvalDrawPanel extends JPanel {

    private static final Color RECTANGLE_COLOR = new Color(0, 0, 139);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(RECTANGLE_COLOR);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.GREEN);
        g.fillOval(0, 0, getWidth(), getHeight());
    }
}