public class StudentTest {
    public static void main(String[] args) {

        //Multiple object ki field ko baar baar banane se bachne ke liye
        Student s1 = new Student(23,"Ravi", 67);
//        Student s2 = new Student(21,"krish", 67);
//        Student s3 = new Student(22,"Arjun", 67);
//        Student s4 = new Student(24,"wota", 67);
//        Student s5 = new Student(20,"ninja", 67);
//        Student s6 = new Student(25,"sohan", 67);
//        Student s7 = new Student(19,"kalu", 67);
//        Student s8 = new Student(24,"ram", 67);
          System.out.println(s1.name);

//When we have Parameterized Constructor then why we create Default one?
// ans ->  Instance variable ki default value initialize ke liye or use ke liye or print ke liye
        Student s = new Student();
        s.marks = 100;
        System.out.println(s.marks);
    }

    Student s2 = new Student(24, "ram");
    Student s3 = new Student(25);
}
