package ControlStatements.Iterative;

public class Multipication{
    public static void main(String[] args) {
        int mul = 1;
        int num = 5;
        int i = 1;
        while (i<=10){
            mul = num * i;
            System.out.println(num+" x "+i+" = "+mul);
            i++;
        }
    }
}
