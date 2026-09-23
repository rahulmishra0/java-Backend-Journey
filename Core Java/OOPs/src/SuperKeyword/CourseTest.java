package SuperKeyword;

//isme CFS ek parent class h jiske pass variable h -> name
//and Course Child class h CFS ka Jiske pass bhi variable h -> name
//It is also a Ambiguity problem
//then ager parent(CFS) ka variable ko use karna h then use -> super
//and current class ka variable use karna h then use -> this
//also this ki tarah super ka use karke parent ke constructor ko call kar sakte h

class CFS{
    String name = "CodeForSuccess";
    CFS(){
        System.out.println("CFS Default Constructor...");
    }
}

class Course extends CFS{

    String name = "Spark 6.0";
    Course(){
        //super();
        System.out.println("Default constructor.....");
    }

    Course(String name){
        //super() -> // m chahta hu ki super ki dependency na ho
        //then use this to call default constructor
        this();
        System.out.println("Parameterized constructor.....");
    }

//use of this and super
    void showName(){
        System.out.println(name); //current class
        System.out.println(this.name); //current class
        System.out.println(super.name); //parent class
    }
}

public class CourseTest {
    public static void main(String[] args) {

        Course course = new Course("Java full Stack");

        System.out.println("....................");

        course.showName();
    }
}
