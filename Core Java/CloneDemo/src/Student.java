//Cloneable is an interface that don't have any method.
//without method, it works perfectly because JVM do it's all work

public class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    //here clone method come from object class and clone method ko cloneable interface ke pass Marker interface bhejta h
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Student2 implements Cloneable{
    int id;

    //Reference variable
    Address address;

    Student2(int id, Address address){
        this.id = id;
        this.address = address;
    }

    @Override
    protected Student2 clone() throws CloneNotSupportedException {
        //return (Student2) super.clone(); //here iske ek object m change karne par dono m changes ho raha h Aisa isliye ho raha h kyuki ye internally shallow copy ka use kar raha h.

        Student2 cloned = (Student2) super.clone(); //here ek object m change karne par dono m changes nahi hoga kyuki ye internally Deep copy ka use kar raha h
        cloned.address = new Address(this.address.city);
        return cloned;
    }
}

class Address{
    String city;

    Address(String city){
        this.city = city;
    }
}
