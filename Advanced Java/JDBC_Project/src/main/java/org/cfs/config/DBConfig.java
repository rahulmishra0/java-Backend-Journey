package org.cfs.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConfig {
    static String url = "jdbc:mysql://localhost:3306/jdbc_project01";
    static String username = "root";
    static String password = "Rahul1512";

    public static Statement getInstance(){
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            return statement;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
