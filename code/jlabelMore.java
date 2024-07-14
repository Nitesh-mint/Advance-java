import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
public class jlabelMore{
	public static void main(String args[]){
		//creating a frame
		JFrame frame = new JFrame("JLabel in detail");
		
		//image icon
		ImageIcon image = new ImageIcon("java_logo.png");
		
		//Border
		Border border = BorderFactory.createLineBorder(Color.RED, 3);
		
		//JLabel codes
		JLabel label = new JLabel();
		label.setIcon(image);
		label.setText("Hello");
		label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); //set text TOP BOTTOM, CENTER of 
		label.setForeground(Color.GREEN); //set the font color
		label.setFont(new Font("Arial", Font.BOLD, 20)); //set font of the text
		label.setIconTextGap(10); //set gap between image and text
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); // set the border of the Label
		label.setVerticalAlignment(JLabel.CENTER); //set the vertical position of both image and text
		label.setHorizontalAlignment(JLabel.CENTER); //set the horizontal position of both imgae and text
		label.setSize(250, 250);
		
		//frame code for label
		frame.setSize(500, 400);
		frame.add(label);
		frame.setLayout(null); //by default java uses border layout.
		//frame.pack(); //this will make the frame size the size of the components(i.e: responsive)
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}