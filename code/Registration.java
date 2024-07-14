import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class Registration{
	Registration(){
		// Creting a border

		JFrame frame = new JFrame();

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		
		JLabel title = new JLabel("Registration Form");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(title, BorderLayout.NORTH);

		JLabel name_label = new JLabel("Name");
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(2, 0, 0, 2);
		panel.add(name_label, gc);
	
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(2, 0, 0 ,2);
		gc.anchor = GridBagConstraints.NORTHEAST;
		gc.weightx = 1;
		gc.weighty = 0;
		gc.gridwidth = 2;
		JTextField name_field = new JTextField(10);
		panel.add(name_field, gc);

		gc.gridx = 0;
		gc.gridy = 1;
		gc.insets = new Insets(2, 0, 0, 2);
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.weightx = 1;
		gc.weighty =1;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		JLabel mobile_label = new JLabel("Mobile");
		panel.add(mobile_label,gc); 		
		

		mainPanel.add(panel, BorderLayout.WEST);
		frame.add(mainPanel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Registration r = new Registration();
	}
}
