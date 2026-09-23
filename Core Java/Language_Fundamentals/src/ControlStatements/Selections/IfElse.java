package ControlStatements.Selections;

public class IfElse {
    public static void main(String[] args) {
        int marks = 40;

        if (marks >= 33){  //condition true
            System.out.println("pass");
        }
        else {  //condition false
            System.out.println("fail");
        }
        System.out.println("end");

        System.out.println();

        //Even odd
        int a = 12;
        if (a%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}
