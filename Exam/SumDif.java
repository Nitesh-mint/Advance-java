import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SumDif extends JFrame implements MouseListener {

    JTextField num1, num2;
    JLabel result;

    SumDif() {
        setSize(500, 500);
        setLayout(new BorderLayout());

        JLabel lbl = new JLabel("Calculator", SwingConstants.CENTER);
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Create text fields
        num1 = new JTextField(15);
        num2 = new JTextField(15);

        // Create a panel to hold the text fields
        JPanel panel = new JPanel(); // FlowLayout by default
        panel.add(num1);
        panel.add(num2);

        // Create a button
        JButton btn = new JButton("Button");
        btn.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setBorder(new EmptyBorder(10, 20, 10, 20));

        result = new JLabel("gg", SwingConstants.CENTER);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setBorder(new EmptyBorder(10, 10, 10, 10));

        panel.add(btn);
        panel.add(result);

        addMouseListener(this);

        // Add components to the frame
        add(lbl, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER); // Add the panel to the center

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new SumDif();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        int x, y, z;
        x = Integer.parseInt(num1.getText());
        y = Integer.parseInt(num2.getText());
        z = x + y;
        result.setText(String.valueOf(z));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x, y, z;
        x = Integer.parseInt(num1.getText());
        y = Integer.parseInt(num2.getText());
        z = x - y;
        result.setText(String.valueOf(z));
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
