import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Class for establishing a connection to the MySQL database
public class DatabaseConn {
    // Method to get a connection to the database
    public static Connection getConnection() throws ClassNotFoundException {
        Connection conn = null;

        // Load the MySQL JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        try {
            // Establish a connection to the MySQL database
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (SQLException e) {
            System.out.println(e);
        }

        return conn;
    }
}