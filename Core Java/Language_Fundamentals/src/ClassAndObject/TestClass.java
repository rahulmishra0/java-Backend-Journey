package ClassAndObject;

class Student {
    int age;
    String name;
    String course;

    void study(){
        System.out.println("Student is studying");
    }
}

public class TestClass {   //main class
    public static void main(String[] args) {
        Student s = new Student(); //object creation using new keyword

        //how to use class -> action and field
        System.out.println(s.age); //0 -> default value by jvm
        System.out.println(s.name);//null -> default by jvm

        System.out.println("...................................");

        // replace the default value
        s.age = 20;
        s.name = "Rahul";
        System.out.println(s.age);
        System.out.println(s.name);


    }
}
