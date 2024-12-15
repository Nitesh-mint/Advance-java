import java.awt.*;
import javax.swing.*;

public class DialogBoxes extends JFrame {

    DialogBoxes() {
        setSize(500, 500);
        // ----------------- To show the Message ----------------------------
        // JOptionPane.showMessageDialog(
        //     this, //parent_frame
        //     "This is a message", //message
        //     "Example", //title
        //     JOptionPane.INFORMATION_MESSAGE //int
        // );
        // ---------------- To show input Dialog -----------------------------
        // String num = JOptionPane.showInputDialog(this, "Enter any number");
        //
        // --------------- To show Yes No and Cancel option ----------------------
        // JOptionPane.showConfirmDialog(
        //     this,
        //     "Do you want to exit?",
        //     "Alter",
        //     JOptionPane.YES_NO_CANCEL_OPTION
        // );
        // --------------- To Show Custom Option Dialog Option ---------------------
        //
        Object options[] = { "Hell Yeah!", "Dang I Love them!", "No" };
        JOptionPane.showOptionDialog(
            this,
            "Do you like Boobs?",
            "For Boys",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]
        );

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new DialogBoxes();
    }
}
