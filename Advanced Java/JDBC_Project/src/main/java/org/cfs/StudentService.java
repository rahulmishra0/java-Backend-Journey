package org.cfs;

import org.cfs.config.DBConfig;

import java.sql.*;

public class StudentService {

    public void addStudent(Student student) {

        String sql = """
                INSERT INTO students (name, email, course, marks) VALUES(?,?,?,?)
                """;

        try{
            Connection connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getEmail());
            preparedStatement.setString(3,student.getCourse());
            preparedStatement.setDouble(4,student.getMarks());

            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected>0){
                System.out.println("Student added successfully");
            }
            preparedStatement.close();
            connection.close();

        }catch (SQLException e){
            System.out.println("Error.."+e.getMessage());
        }
    }

    public void viewAll(){
        String sql = "select * from students";

        try {
            Connection connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println();
            System.out.println("Student recorded ");
            System.out.println("..........................");

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("gmail");
                String course = resultSet.getString("course");
                double marks = resultSet.getDouble("marks");

                System.out.println("Id : "+id);
                System.out.println("Name : "+name);
                System.out.println("Email : "+email);
                System.out.println("Course : "+course);
                System.out.println("Marks : "+marks);

                System.out.println("....................................");

                resultSet.close();
                preparedStatement.close();
                connection.close();
            }
        }
        catch (SQLException e){
            System.out.println("Error.. "+e.getMessage());
        }
    }

    public void searchStudent(int id){
        String sql = """
                SELECT * FROM students where id = ?
                """;

        try {
            Connection connection = DBConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                System.out.println();
                System.out.println("Student Found");

                System.out.println("ID : "+resultSet.getInt("id"));
                System.out.println("NAME : "+resultSet.getString("name"));
                System.out.println("EMAIL : "+resultSet.getString("email"));
                System.out.println("COURSE : "+resultSet.getString("course"));
                System.out.println("MARKS : "+resultSet.getDouble("marks"));
            }
            else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
