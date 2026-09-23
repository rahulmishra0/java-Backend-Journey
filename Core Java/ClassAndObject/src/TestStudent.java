class Student{
    String name;
    int age;

    void study(){
        System.out.println("student is studying....");
    }
}
public class TestStudent {
    public static void main(String[] args) {
        //System.out.println("Hello");

        //student class value access -> we need to create object
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);

        System.out.println("......................");

        s.name = "Rahul";
        s.age = 23;
        System.out.println(s.name);
        System.out.println(s.age);

        s.study();

        //multiple object
        Student s2 = new Student();
        System.out.println(s2.name); //seprate copy banegi default ki
        System.out.println(s2.age);

        //Abhi issme Student and testStudent 2 class same class m hai
        //but jo practice h wo dono ko alg alg banana chahiye
    }
}
