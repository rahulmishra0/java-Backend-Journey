package org.cfs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentService service =new StudentService();
        int choice;

        do {
            System.out.println();
            System.out.println("=== student Management System");

            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter your choice");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter your Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter your name : ");
                    String name = sc.nextLine();

                    System.out.println("Enter your email : ");
                    String email = sc.nextLine();

                    System.out.println("Enter your course : ");
                    String course = sc.nextLine();

                    System.out.println("Enter your marks : ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, email, course, marks);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewAll();
                    break;

                case 6:
                    System.out.println("Application closed.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 6);

        sc.close();
    }
}
