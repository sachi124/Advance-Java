import javax.swing.*;

public class ButtonExample {
public static void main(String[] args) {
    JFrame f = new JFrame("Button Example");
    JButton b = new JButton("Click here");
    b.setBounds(50,100,93,30);
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}
}