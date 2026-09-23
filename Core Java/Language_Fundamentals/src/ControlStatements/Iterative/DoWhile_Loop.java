package ControlStatements.Iterative;

//do while loop execute the code first then check condition
public class DoWhile_Loop {
    public static void main(String[] args) {
        int i = 10; //condition false fir bhi one time print hoga
        do {
            System.out.println("Hello !");
            i++;
        }while (i<=5);


        System.out.println("...........Car parking..........");
        int choice = 2;
        do {
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Exit");

            System.out.println("Selected choice : "+choice);
        }while (choice<1 || choice>3); //false condition
    }
}
