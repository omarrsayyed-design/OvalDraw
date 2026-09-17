import javax.swing.JFrame;


public class OvalDrawPlus {
    public static void main(String[] args) {
        System.out.println("Starting OvalDrawPlus...");
        JFrame OvalDrawPlusWindow = new JFrame("OvalDrawPlus");

        OvalDrawPlusWindow.setSize(400, 500); // width, height
        OvalDrawPlusWindow.setLocation(250, 150);
        OvalDrawPlusWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         OvalDrawPlusWindow.add(new OvalDrawPanel());
        OvalDrawPlusWindow.setVisible(true);
    }
}
   
