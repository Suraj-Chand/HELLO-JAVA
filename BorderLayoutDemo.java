import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(300,300);
        frame.setVisible(true);


        JButton b1 = new JButton("east");
        JButton b2 = new JButton("west");
        JButton b3 = new JButton("north");
        JButton b4 = new JButton("south");
        JButton b5 = new JButton("center");

        frame.add(b1,BorderLayout.EAST);
        frame.add(b2,BorderLayout.WEST);
        frame.add(b3,BorderLayout.NORTH);
        frame.add(b4,BorderLayout.SOUTH);
        frame.add(b5,BorderLayout.CENTER);
    }
}
