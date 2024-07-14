//we use JLabel for more of a static component. it can hold text and image or both
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class jlabelExample{
	public static void main(String args[]){
		MyFrame frame = new MyFrame();
		frame.setTitle("JLabel");
		
		ImageIcon image = new ImageIcon("java_logo.png");
		
		JLabel label = new JLabel();
		label.setText("This is a text");
		label.setIcon(image);
		
		frame.add(label);
	}
}