import javax.swing.*;

public class HelloSwing{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");

        JLabel label = new JLabel("Hello Swing!");
        frame.add(label);

        frame.setSize(400, 200);
        frame.setVisible(true);
    
    }
}