import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JLabel;
import javax.swing.JPanel;
public class jframeExample{ 
    // static GraphicsConfiguration gc;
    public static void main(String args[]){
        JFrame frame = new JFrame("My First Java GUI Program"); //directly add the title without using 
        frame.setSize(600, 400); //setting the size of the window

        frame.setBackground(Color.blue);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
