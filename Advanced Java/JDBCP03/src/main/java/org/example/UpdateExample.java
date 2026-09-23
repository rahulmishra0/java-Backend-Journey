package org.example;

import org.example.config.DBConfig;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {
    public static void main(String[] args) {

        String sql = """
               UPDATE employee SET sal = 90000 where id = 1;
                """;

        Statement statement = DBConfig.getInstance();

        try {
            int row = statement.executeUpdate(sql);
            if (row > 0){
                System.out.println("Employee Updated");
            }else {
                System.out.println("Employee Not Found..");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
