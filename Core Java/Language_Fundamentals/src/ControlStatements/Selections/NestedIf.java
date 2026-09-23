package ControlStatements.Selections;

public class NestedIf {
    public static void main(String[] args) {
        String username = "rahul";
        String password = "123";

        if (username == "rahul"){
            if (password == "123"){
                System.out.println("Login");
            }
            else {
                System.out.println("Wrong password");
            }
        }
        else {
            System.out.println("Wrong username");
        }
    }
}
