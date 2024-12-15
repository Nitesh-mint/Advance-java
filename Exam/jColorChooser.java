import java.awt.*;
import javax.swing.*;

public class jColorChooser extends JFrame {

    jColorChooser() {
        setSize(500, 500);

        JColorChooser cs = new JColorChooser();
        Color c = cs.showDialog(this, "Select new color ...", Color.white);
        setBackground(c);

        JButton btn = new JButton("Click");
        btn.showDialog(this, "You Clicked Me");

        add(btn);
        // add(cs);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new jColorChooser();
    }
}
