public class Student {
    String name;
    int age;
    int marks;

    //Constructor ->multiple objects banne se bachne ke liye use constructor

    //Default Constructor
    Student(){

    }

    //Parameterized Constructor
    Student(int age, String name, int marks){
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    //constructor overloading
    Student(int age, String name){
        this.age = age;
        this.name = name;

    }

    Student(int age){
        this.age = age;

    }
}
