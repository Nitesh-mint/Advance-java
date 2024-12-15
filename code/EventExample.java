import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class EventExample extends JFrame implements ActionListener{
	JTextField tf;
	EventExample(){
		setSize(400, 100);
		setLayout(new FlowLayout());
		JLabel label = new JLabel("Text Label");
		tf= new JTextField(15);
		tf.setSize(80, 30);

		JButton btn = new JButton("Click me");
		btn.addActionListener(this);
		btn.setSize(80, 30);

		setVisible(true);
		add(label);
		add(tf);
		add(btn);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("Welcome");	
	}
	public static void main(String args[]){
		EventExample ex = new EventExample();
	}
}
