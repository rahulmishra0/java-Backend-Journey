package org.example;

import java.sql.*;

public class ReadExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/spark6";
        String username = "root";
        String password = "Rahul1512";
        String sql = "SELECT * from employee";

        try{
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("dep");
                int salary = resultSet.getInt("sal");

                System.out.println(
                        id+" | "+name+" | "+department+" | "+salary
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
