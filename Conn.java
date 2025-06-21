import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    Conn() {
        // Step 1: Register the driver class
        // Step 2: Create database connection
        // Step 3: Creating the statement
        // Step 4: Executing MySQL queries
        // Step 5: Closing the connectivity (optional)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Step 1
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementSystem", "root", "Vishal@54321"); // Step 2
            s = c.createStatement(); // Step 3
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
