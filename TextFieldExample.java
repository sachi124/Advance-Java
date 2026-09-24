import javax.swing.*;

// main class
class TextFieldExample{
    public static void main(String args[])
    {
        // Creating a Jframe
        JFrame jf = new JFrame("This is the example of text field area.");
        // creating 2JtextField objects
        JTextField t1, t2;
        t1 = new JTextField("Sachin Bista.");
        t1.setBounds(50,100,200,30);
        t2 = new JTextField("Studying at Reliance College");
        t2.setBounds(50, 150, 200,30);
        jf.add(t1);
        jf.add(t2);
        // setting the size of the frame
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}