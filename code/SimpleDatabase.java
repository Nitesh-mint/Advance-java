import java.sql.*;

public class SimpleDatabase {

    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/jsp_project",
                "root",
                ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
