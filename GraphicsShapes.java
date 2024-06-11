import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.BorderLayout;

public class GraphicsShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        
        // Create and add the custom panel
        CustomPanel panel = new CustomPanel();
        frame.add(panel);
        
        //creating a red panel
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.WHITE);
        frame.add(redpanel);
        
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class CustomPanel extends JPanel {
	CustomPanel(){
		setBackground(Color.GREEN);
		setSize(260, 250);
//		setLayout(null);
	}
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillRect(10, 10, 125, 125);
        g2d.drawString("HELLO!", 125, 200); //draws string
        
        g2d.setColor(Color.BLUE);
        g2d.fillOval(135, 10,125, 125);
    }
}
