package Database;

import javax.swing.plaf.TextUI;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {

    public static Connection getConnection() {

        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/biblotekonsdag?serverTimezone=CET&useSSL=false";
        String user = "root";
        String password = "pan42anb";

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}