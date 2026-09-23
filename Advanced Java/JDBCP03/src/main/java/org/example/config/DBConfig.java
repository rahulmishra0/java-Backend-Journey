package org.example.config;

import java.sql.*;

//Hame baar baar ye karna pad raha tha isliye hamne ye method bana liya.
public class DBConfig {

    static String url = "jdbc:mysql://localhost:3306/spark6";
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
