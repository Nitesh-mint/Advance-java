import javax.swing.*;
import java.awt.event.*;

public class adaptorcls extends MouseAdapter{
	static JLabel label;
	
	public static void main(String args[]){
		
		label = new JLabel();
		
		JFrame frame = new JFrame("Adapter class");
		frame.setSize(500, 500);
		
		
		frame.addMouseListener(new adaptorcls());
		
		
		frame.setVisible(true);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void mouseClicked(MouseEvent e){
		label.setText("Mouse Clicked");
		System.out.println("M");
	}
	public void mouseExited(MouseEvent e){
		label.setText("Mose Exited");
	}
}
