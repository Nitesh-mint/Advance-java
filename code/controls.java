import java.awt.*;
import javax.swing.*;

public class controls extends JFrame {

    JLabel username, password, sex, hobbies, country, comments;
    JTextField txtusername;
    JPasswordField txtpassword;
    JPanel p1, p2, p3, sp1, sp2;
    JRadioButton rbMale, rbFemale;
    JComboBox cmbcountry;

    controls() {
        setSize(600, 600);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        sp1 = new JPanel();
        sp2 = new JPanel();

        p1.setPreferredSize(new Dimension(600, 50));
        p2.setPreferredSize(new Dimension(50, 400));

        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);
        p3.setLayout(new GridLayout());

        //adding panels in p3
        p3.add(sp1);
        p3.add(sp2);

        //borders of panel
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        p3.setBorder(BorderFactory.createLineBorder(Color.black));

        //No layout manager
        sp1.setLayout(null);
        sp2.setLayout(null);

        //setting background color of panels
        sp1.setBackground(Color.ORANGE);
        sp2.setBackground(Color.ORANGE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //ADDING label and text field
        username = new JLabel("User Name");
        txtusername = new JTextField(20);
        username.setBounds(80, 20, 100, 25);
        txtusername.setBounds(20, 20, 200, 25);
        sp1.add(username);
        sp2.add(txtusername);

        //Adding password
        password = new JLabel("Password");
        txtpassword = new JPasswordField(20);
        password.setBounds(80, 50, 100, 25);
        txtpassword.setBounds(20, 50, 200, 25);
        sp1.add(password);
        sp2.add(txtpassword);

        //Adding sex radio button
        sex = new JLabel("Sex");
        sex.setBounds(80, 80, 100, 25);
        rbMale = new JRadioButton("Male", true);
        rbFemale = new JRadioButton("Female");
        rbMale.setBounds(50, 80, 50, 25);
        rbFemale.setBounds(130, 80, 50, 25);
        sp1.add(sex);
        sp2.add(rbMale);
        sp2.add(rbFemale);

        //Adding combo box
        country = new JLabel("Country");
        cmbcountry = new JComboBox();
        cmbcountry.addItem("Nepal");
        cmbcountry.addItem("India");
        cmbcountry.addItem("China");
        country.setBounds(80, 110, 100, 25);
        cmbcountry.setBounds(80, 110, 100, 25);
        sp1.add(country);
        sp2.add(cmbcountry);
    }

    public static void main(String args[]) {
        controls c = new controls();
    }
}
