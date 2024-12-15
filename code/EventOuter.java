import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class EventOuter extends JFrame{
	JTextField tf;
	EventOuter(){
		setSize(500, 200);
		setTitle("Event Handling by outer class");
		setLayout(new FlowLayout());

		JLabel lb = new JLabel("Event Handling by Outer class");
		tf = new JTextField(15);

		JButton btn = new JButton("Click Me");
		btn.addActionListener(new Handler(this));

		add(lb);
		add(tf);
		add(btn);

		setVisible(true);
	}
	public static void main(String args[]){
		EventOuter ev = new EventOuter();	
	}
}
class Handler implements ActionListener{
	EventOuter ed;
	Handler(EventOuter e){
		ed = e;
	}

	public void actionPerformed(ActionEvent e){
		ed.tf.setText("This is set by the outer class");
	}
}
