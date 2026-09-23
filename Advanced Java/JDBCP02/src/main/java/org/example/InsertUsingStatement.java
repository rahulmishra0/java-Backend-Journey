package org.example;
//pahle (P01) m mysql connector ki library alag se dawnload karke use kiya tha aisa hume barr baar karna padta jab bhi new project banta
//so now we use maven dependency of mysql connector.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/spark6";
        String username = "root";
        String password = "Rahul1512";

        String sql = """
                INSERT INTO employee
                VALUES (11, 'Aman', 'Support', 40000)
                """;

        try{
            Connection connection = DriverManager
                    .getConnection(url, username, password);

            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row + " Row inserted");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
