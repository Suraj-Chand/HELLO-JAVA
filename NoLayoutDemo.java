import javax.swing.*;

public class NoLayoutDemo {
    public static void main(String[] argsStrings) {
        JFrame frame = new JFrame();


        JLabel label1 = new JLabel("hello");
        label1.setBounds(0, 0,100,100);

        JLabel label2 = new JLabel("world");
        label2.setBounds(40, 0,100,100);

        frame.add(label2);
        frame.add(label1);
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.setVisible(true);



    }
}
