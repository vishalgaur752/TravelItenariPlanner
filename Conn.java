import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        // step 1 : Register the driver class
        // spet 2 : create databade
        // step 3 : Creating the statement
        try {
            Class.forName("com.myaql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mqsql://localhost:3306/travelmanagementSystem", "root", "Vishal@321");//step 2
            s = c.createStatement();//step 3
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
