package kz.aitu.oop.assignment6.singleton;

import java.sql.*;

class DBConnection {
    private static Connection conn;

    private DBConnection() {
    }

    public static Connection getConnection() {
        try {
            if (conn == null) {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/My OOP assignment 5 - company", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
