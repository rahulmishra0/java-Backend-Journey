public class Babu {

    void sorry(){  //ager m isko static nahi banata hu then isko main method m call karne ke liye object banana padega
        System.out.println("sorry bolo");
    }

    void add(int a, int b){
        System.out.println("sum of two number is "+(a+b));
    }

    public static void main(String[] args) {
        Babu b = new Babu();
        b.sorry();
        b.add(10,15);
    }
}
