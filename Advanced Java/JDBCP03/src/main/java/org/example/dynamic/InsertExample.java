package org.example.dynamic;

import org.example.config.DBConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter Department : ");
        String dep = sc.nextLine();

        System.out.println("Enter Salary : ");
        double sal = sc.nextDouble();

        //String sql = "INSERT into employee VALUES("+id+", '"+name+"', '"+dep+"', "+sal+")";

        String sql = """
                INSERT INTO employee (id, name, dep, sal) VALUES(?,?,?,?)
                """;

        try {
            //Statement statement = DBConfig.getInstance();
            //int row = statement.executeUpdate(sql);

            Connection connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,dep);
            preparedStatement.setDouble(4,sal);

            int row = preparedStatement.executeUpdate();

            System.out.println(row+" Employee inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
