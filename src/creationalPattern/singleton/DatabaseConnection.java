package creationalPattern.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    // Singleton instance
    private static volatile DatabaseConnection instance;

    // Database connection object
    private Connection connection;
    
    // Private constructor 
    private DatabaseConnection() {
        try {
            // JDBC connection string (replace with your actual database URL, username, and password)
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "password";
            
            // Create a connection to the database
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Public method to provide global access to the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    
    // Method to return the current database connection
    public Connection getConnection() {
        return connection;
    }
    
    // Optional: Close the connection if needed
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
