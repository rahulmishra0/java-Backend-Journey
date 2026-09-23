package Polymorphism.MethodOverloading;

class Calculator{
    //Method Overloading -> method name same with different data type and parameter
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class Babu {
    void khanakhaya(String msg){
        System.out.println(msg);
    }
    void khanakhaya(String name, String msg){
        System.out.println(msg);
    }
    void khanakhaya(String name, String msg, String add){
        System.out.println(msg);
    }
}
