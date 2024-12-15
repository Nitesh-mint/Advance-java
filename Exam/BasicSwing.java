import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BasicSwing extends JFrame {

    BasicSwing() {
        setSize(500, 500);
        setLayout(new FlowLayout());

        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("open");

        file.setMnemonic('F');
        file.add(open);
        bar.add(file);

        JCheckBox chkBox = new JCheckBox("CheckBox");

        JInternalFrame iframe = new JInternalFrame(
            "Internal Frame",
            true,
            true,
            true,
            true
        );
        iframe.setVisible(true);
        iframe.setSize(100, 100);
        add(iframe);
        add(chkBox);
        setJMenuBar(bar);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new BasicSwing();
    }
}
