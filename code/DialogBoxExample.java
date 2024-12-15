import java.awt.*;
import javax.swing.*;
public class DialogBoxExample extends JFrame{
	
	DialogBoxExample(){
		setSize(300, 400);
		setTitle("Dialog Box Example");
	
		JOptionPane opPane = new JOptionPane();
		//opPane.showConfirmDialog(this, "Do you want to Exit?", "Alert", JOptionPane.YES_NO_CANCEL_OPTION);
		//opPane.showMessageDialog(this, "This is a info message", "info", JOptionPane.WARNING_MESSAGE);	
		//opPane.showInputDialog(this, "Enter anything", "Number");
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(this);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String args[]){
		DialogBoxExample de = new DialogBoxExample();
	}
}
