import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age<18){
            //This is not Exception Handling it is manually creating object
            throw new ArithmeticException("Age is must be 18 or above");
        }
        System.out.println("Allow to pub");
    }
}
