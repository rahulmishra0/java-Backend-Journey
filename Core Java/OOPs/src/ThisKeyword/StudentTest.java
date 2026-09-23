package ThisKeyword;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName("Rahul");
        s2.setName("Pooja");

        s1.showName();
        s2.showName();
    }
}
