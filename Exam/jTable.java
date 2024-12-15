import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.tree.*;

public class jTable extends JFrame {

    jTable() {
        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        //ceating a list
        String[] items = { "Apple", "Mango", "Orange", "Banana" };
        JList list = new JList(items);
        list.setBorder(BorderFactory.createLineBorder(Color.blue));

        //creating trees
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode(
            "Vegetable"
        );
        DefaultMutableTreeNode fruitsNode = new DefaultMutableTreeNode("Fruit");
        DefaultMutableTreeNode papayaNode = new DefaultMutableTreeNode(
            "Papaya"
        );
        fruitsNode.add(papayaNode);
        root.add(vegetableNode);
        root.add(fruitsNode);
        JTree tree = new JTree(root);

        //creating a table
        String[] cn = { "Title", "Artist", "Album" };
        String[][] data = { { "a1", "Aani", "x1" }, { "a2", "Suren", "x2" } };
        JTable table = new JTable(data, cn);
        JScrollPane sp = new JScrollPane(table);
        add(sp);

        add(tree);
        add(list);
        JLabel title = new JLabel("Advance Swing Components");
        add(title);
        setVisible(true);
    }

    public static void main(String args[]) {
        new jTable();
    }
}
