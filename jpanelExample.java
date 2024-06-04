import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
public class jpanelExample{
	public static void main(String args[]){
		JFrame frame = new JFrame();
		
		ImageIcon pic = new ImageIcon("emoji.png");
		
		JLabel label = new JLabel();
		label.setSize(50, 50);
		label.setText("Hi");
		label.setIcon(pic);
		
		// GUI component which functions as container for holding other components
		JPanel redpanel = new JPanel();
		redpanel.setBounds(0, 0, 250, 250);
		redpanel.setBackground(Color.RED);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBounds(250, 0, 250, 250);
		bluepanel.setBackground(Color.BLUE);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBounds(0, 250, 500, 250);
		greenpanel.setBackground(Color.GREEN);
		greenpanel.add(label);
				
		frame.setTitle("JPanel Example");
		frame.setSize(600, 600);
		frame.setLayout(null); // using the manual layout manager
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
	}
}