package ControlStatements.Selections;

public class IfElse_If {
    public static void main(String[] args) {
        int marks = 62;

        System.out.println("............Student Grade..........");
        if (marks >= 90){
            System.out.println("Grade A+");
        }
        else if (marks >= 75){
            System.out.println("Grade A");
        }
        else if (marks >= 60){
            System.out.println("Grade B");
        }
        else if (marks >= 40){
            System.out.println("Grade C");
        }
        else{
            System.out.println("fail");
        }
    }
}
