import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GSnumber{
	public static void main(String args[]){

		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		JLabel label = new JLabel("Enter numbers");
		
		JTextField first_number = new JTextField(10);
		JTextField second_number = new JTextField(10);
		
		JButton button = new JButton("Submit");
		button.setSize(50, 50);
		
		JLabel output = new JLabel("Output ");

		panel.add(label);
		panel.add(second_number);
		panel.add(first_number);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mousePressed(MouseEvent e){
				int num1 = Integer.parseInt(first_number.getText());
				int num2 = Integer.parseInt(second_number.getText());

				if(num1 > num2){
					output.setText(Integer.toString(num1));
				}else{
					output.setText(Integer.toString(num2));
				}
				output.setText("");
			}
			@Override
			public void mouseReleased(MouseEvent e){
				int num1 = Integer.parseInt(first_number.getText());
				int num2 = Integer.parseInt(second_number.getText());


				if(num1 > num2){
					output.setText(Integer.toString(num2));
				}else{
					output.setText(Integer.toString(num1));
				}
			}
		});

	}

}
