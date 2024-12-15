import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleCalc extends JFrame implements ActionListener{
	JTextField f1, f2, resultf;
	JButton btnAdd, btnSub;
	SimpleCalc(){
		setSize(500, 300);
		setTitle("Simple Calculator");
		setLayout(new FlowLayout());

		JLabel lbl = new JLabel("Simple Calculator");
		f1 = new JTextField(5);
		f2 = new JTextField(5);
		resultf = new JTextField(5);


		btnAdd = new JButton("Add");
		btnSub = new JButton("Subtract");

		btnAdd.addActionListener(this);
		btnSub.addActionListener(this);

		add(lbl);
		add(f1);
		add(f2);
		add(resultf);
		add(btnAdd);
		add(btnSub);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e){
		int x, y, result;
		x = Integer.parseInt(f1.getText());
		y = Integer.parseInt(f2.getText());
		if(e.getActionCommand() == "Add"){
			result = x + y;
		}else{
			result = x - y;
		}
		resultf.setText(String.valueOf(result));
	}
	public static void main(String args[]){
		new SimpleCalc();
	}
}
