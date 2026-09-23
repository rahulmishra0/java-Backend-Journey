package Inheritance;

//Parent class
public class Employee {

    //Default const
    Employee(){
        //super(); -> Object class constructor call
        System.out.println("Employee constructor...........");
    }

    int id;
    String name;
    double salary;
}

//Child class
class Developer extends Employee{
    String language;
}

//Child class
class Manager extends Employee{

    //default const
    Manager(){
        //super();  -> Parent constructor call
        System.out.println("Manager constructor............");
    }
    int teamSize = 100;
}
