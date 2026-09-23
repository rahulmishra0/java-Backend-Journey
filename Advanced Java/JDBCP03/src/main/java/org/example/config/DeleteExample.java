package org.example.config;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {
    public static void main(String[] args) {
        try {
            Statement statement = DBConfig.getInstance();
            int row = statement.executeUpdate("DELETE FROM employee where id = 11");
            System.out.println(row+ " Row deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
