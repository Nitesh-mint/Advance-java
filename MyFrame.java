import javax.swing.JFrame;
import javax.swing.ImageIcon;
public class MyFrame extends JFrame{
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,550);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("java_logo.png");
		this.setIconImage(image.getImage());
	}
}