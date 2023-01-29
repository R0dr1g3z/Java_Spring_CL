package com.example.beans3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    public static Connection connect() throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306";
        final String DB_USER = "root";
        final String DB_PASS = "coderslab123";
        final String DATABASE = "CustomerLogger";
        String connStr = String.format("%s/%s?useSSL=false&characterSet=utf8mb4&serverTimezone=UTC", DB_URL, DATABASE);
        Connection connection = DriverManager.getConnection(connStr, DB_USER, DB_PASS);
        return connection;
    }
}
