package Operators;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        //post
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

        //pre
        ++a;
        --b;
        System.out.println(a);
        System.out.println(b);

        int c = 5;
        int d = ++c;  //6
        int res = c++; //6 then 7
        System.out.println(d); //6
        System.out.println(res); //6
        System.out.println(c); //7

        System.out.println();

        int k = 5;
        int r = ++k + ++k - k-- + k++ + k--;
        System.out.println(k); //6
        System.out.println(r); //19
    }
}
