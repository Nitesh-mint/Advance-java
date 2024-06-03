import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;
public class good_framesize{
	public static void main(String args[]){
		MyFrame frame = new MyFrame();
		frame.setTitle("Good Frame");
		frame.setBackground(Color.RED);
		//toolkit
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		frame.setSize(screenWidth/2, screenHeight/2);
		frame.setLocationByPlatform(true);
	
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		frame.add(panel);
		}
}