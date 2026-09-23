//passing object -> means hum kisi bhi existing class ka object pass karke bhi access or use kar sakte h
// ex -> Student

class StudentPrinter{

    void printer(Student student) { //passing object of Student class
        System.out.println(student.age);
        System.out.println(student.name);
    }
    //or
    Student getInstance(){
        Student student = new Student();
        student.name = "Pooja";
        student.age = 23;
        return student;
    }
}
public class PassingObject {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 20;
        student.name = "ram";

        StudentPrinter pr = new StudentPrinter();
        pr.printer(student); //student as a argument pass ho jata h

        //or
        Student s2 = pr.getInstance();
        System.out.println(s2.name);

    }
}
