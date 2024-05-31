import java.awt.Color; // for the color of the background
import java.awt.BorderLayout; //for the layout of the panel 
import javax.swing.JFrame; //for the creation of the parent frame
import javax.swing.JPanel; //for the creation of the child panel
import javax.swing.JButton; //for the button
import java.awt.Dimension; // to create dimension of the panel
import javax.swing.BorderFactory; // to create border 
import java.awt.BorderLayout;

public class multiple_panels {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple JPanels");
        frame.setSize(320,600);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(new JButton("Button"));

        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.setBackground(Color.RED);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        panel1.setPreferredSize(new Dimension(320, 300)); // this works not setSize()
        panel1.add(new JButton("Button 1"), BorderLayout.SOUTH);
        panel1.add(new JButton("Button 1.1"));
        panel1.add(new JButton("Button 1.2"), BorderLayout.EAST);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.NORTH);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
