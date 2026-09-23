package NonAccessDemo;

public class Parent {
    final void show(){
        System.out.println("parent method");
    }
}

class Child extends Parent{

    //Final method ko override or inherit nahi kar sakte
    //not possible
    /*void show(){
        System.out.println("child method");
    }*/
}
