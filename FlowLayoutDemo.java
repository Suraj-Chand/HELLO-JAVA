import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setSize(400,500);
        frame.setVisible(true);

        JLabel label = new JLabel("helloooooooooooooooooo");
        JLabel label2 = new JLabel("worlddddddddd");

        frame.add(label);
        frame.add(label2);

    }
}
