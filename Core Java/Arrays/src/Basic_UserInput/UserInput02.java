package Basic_UserInput;

import java.util.Scanner;

public class UserInput02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your name....."); //for single word
//        String name = sc.next();
//
//        System.out.println("Enter full name......"); //for multiple word
//        String name1 = sc.nextLine(); //for Multiple word
//
//        System.out.println(name);
//        System.out.println(name1);


        System.out.println("Enter the age...");
        int age = sc.nextInt();

        sc.nextLine(); //left over

        System.out.println("Enter the name...");
        String name = sc.nextLine();

        System.out.println("Age = "+age);
        System.out.println("Name = "+name);
    }
}
