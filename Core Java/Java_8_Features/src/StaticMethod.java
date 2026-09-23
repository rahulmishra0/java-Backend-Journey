
interface A {
    static void sayHello(){
        System.out.println("Hello !");
    }

    default void sayBye(){
        System.out.println("Bye !");
    }
}

public class StaticMethod implements A {
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        //obj.sayHello(); //not possible
        //StaticMethod.sayHello(); // also not possible
        A.sayHello(); //possible (static method only call with interface name and static method ko override bhi nahi kar sakte)

        //but default method ko call kar sakte h direct Obj se
        obj.sayBye();
        //StaticMethod.sayBye();//NA
    }
}
