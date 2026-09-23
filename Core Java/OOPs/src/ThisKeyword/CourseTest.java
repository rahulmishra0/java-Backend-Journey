package ThisKeyword;

class CFS{
    CFS(){
        System.out.println("CFS Default Constructor...");
    }
}

class Course extends CFS{

    Course(){
        //super();
        System.out.println("Default constructor.....");
    }

    Course(String name){
        //super() -> // m chahta hu ki super ki dependency na ho
        //then use
        this();
        System.out.println("Parameterized constructor.....");
    }
}

public class CourseTest {
    public static void main(String[] args) {

        Course course = new Course("Java full Stack");

        //here, default wala call nahi hoga apne aap so we create CFS class and inherit them into Course class
        //But abb CFS default constructor chal jayega because of internal super() method
        //But m chahta hu ki super() ki dependency na ho then use this();
        //this(); -> isse CFS default, Course Default and course parameterized sare constructor chalenge
        //but jab hamne CFS wale Default ki dependency hata di fir kyu call ho gaya
        //becuse of default Course constructor ke internal super() ki wajah se
    }
}
