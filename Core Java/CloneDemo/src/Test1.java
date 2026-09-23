public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student(101,"Rahul");

        Student s2 = (Student) s1.clone();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);

        System.out.println(s1 == s2);  //False because s1 and s2 different-2 object but exact same copy

    }
}
