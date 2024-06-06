import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
public class jpanelExample{
	public static void main(String args[]){
		JFrame frame = new JFrame();
		
		ImageIcon pic = new ImageIcon("happy_emoji.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(pic);
//		label.setVerticalAlignment(JLabel.TOP);
		
		// GUI component which functions as container for holding other components
		JPanel redpanel = new JPanel();
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setBackground(Color.RED);
		redpanel.setLayout(null); //not using any layout will not show any items even when added 
		redpanel.add(label); //will not appear even after adding because of the null 
		// the position of the label must be specified to make it visible using setBound() method.
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBounds(250, 0, 250, 250);
		bluepanel.setBackground(Color.BLUE);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBounds(0, 250, 500, 250);
		greenpanel.setBackground(Color.GREEN);
		greenpanel.setLayout(new BorderLayout());
		greenpanel.add(label); // this should be added after the border definition
		
		frame.setTitle("JPanel Example");
		frame.setSize(500, 500);
		frame.setLayout(null); // using the manual layout manager
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		
		frame.setVisible(true);
	}
}