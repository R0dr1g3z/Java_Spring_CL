package com.example.beans3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static String DB_URL = "jdbc:mysql://localhost:3306";
    public static String DB_USER = "root";
    public static String DB_PASS = "coderslab123";

    public static Connection connect() throws SQLException {
        String connStr = String.format("%s/CustomerLogger?useSSL=false&characterSet=utf8mb4&serverTimezone=UTC", DB_URL);
        Connection connection = DriverManager.getConnection(connStr, DB_USER, DB_PASS);
        return connection;
    }
}
