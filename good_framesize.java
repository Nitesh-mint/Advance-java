import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Dimension;
public class good_framesize{
	public static void main(String args[]){
		MyFrame frame = new MyFrame();
		frame.setTitle("Good Frame");
		
		JPanel panel = new JPanel();
		panel
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		
		JPanel panel = new JPanel();
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}