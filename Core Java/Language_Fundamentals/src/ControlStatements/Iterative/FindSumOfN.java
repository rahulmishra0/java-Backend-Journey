package ControlStatements.Iterative;

public class FindSumOfN {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int i = 0;
        while (i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum is: "+sum);
    }
}
