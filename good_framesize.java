import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;
public class good_framesize{
	public static void main(String args[]){
		MyFrame frame = new MyFrame();
		frame.setTitle("Good Frame");
		
		//toolkit
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);
		}	
}