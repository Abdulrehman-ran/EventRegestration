package utils;
import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/event_db";
    private static final String USER = "root"; // change if needed
    private static final String PASSWORD = "majid892045"; // change if needed

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
