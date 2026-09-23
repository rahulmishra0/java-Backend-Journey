import java.util.Scanner;

public class ThrowDemo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age<18){

            try {
                System.out.println("Inside try");
                //This is not Exception Handling it is manually creating object
                throw new ArithmeticException("Age is must be 18 or above");
            }
            catch (ArithmeticException e){
                System.out.println("Catch block");
            }
        }
    }
}
