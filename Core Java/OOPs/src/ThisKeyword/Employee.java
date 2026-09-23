package ThisKeyword;

public class Employee {
    String name;
    int age;
    double salary;

    //Constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
        //OR
        this(name, age); //Another use of this keyword -> isse uper wala constructor call hua
        //this(name, age) -> iska matlab h current class ke constructor ko call kar dena jo 2 parameter le raha h
        this.salary = salary;
    }

    void showDetails(){
        System.out.println(name+" "+age+" "+salary);
    }
}
