package Operators;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int res = a+b;
        System.out.println(res);

        //subject total marks
        int math = 96;
        int science = 80;
        int eng = 60;

        int totalMarks = math+science+eng;
        System.out.println("Total "+totalMarks);

        //substraction
        int a1 = 50;
        int b1 = 40;
        System.out.println(a1-b1);

        //ex : shopping
        int walletAmount = 1000;
        int shoppingAmt = 500;
        int remBal = walletAmount - shoppingAmt;
        System.out.println(remBal);

        //Multiply
        int c1 = 10;
        int c2 = 5;
        System.out.println(c1*c2);

        //ex : electricity bill
        int unitPrice = 8;
        int unitInMonth = 300;
        int totalBill = unitPrice * unitInMonth;
        System.out.println(totalBill);

        //Division
        int d1 = 10;
        int d2 = 5;
        System.out.println(d1/d2);

        //Modulo
        int a2 = 50;
        int a3 = 4;
        System.out.println(a2%a3); // remender -> 2

        System.out.println();

        //concatenation
        String firstName = "Rahul";
        String lastName = "Mishra";
        System.out.println(firstName+" "+lastName);

        System.out.println(10+20);          //30
        System.out.println("10"+20);        //1020
        System.out.println(10+20+"java");   //30java
        System.out.println("java"+10+20);   //java1020
        System.out.println(10+20+"java"+30);//30java30

        //Assignment operator
        int r = 30; //put 30 inside r
        //or create memory in java for 30 and assign r to it.
    }
}
