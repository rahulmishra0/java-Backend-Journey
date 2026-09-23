//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Three-way to inject Dependency.
        System.out.println("1. Constructor Injection");
        Course spark = new SparkCourse();
        Student s1 = new Student(101,"Amit", spark);  //Di through constructor
        s1.display();

        System.out.println();

        System.out.println("2. Setter Injection");
        Course backend = new Backend();
        Student s2 = new Student(102, "Meera");
        s2.setCourse(backend); //Setter Injection
        s2.display();

        System.out.println();

        System.out.println("3. Field Injection");
        Student s3 = new Student(103, "Kabir");
        FieldInjectionDemo.injectCourse(s3, new SparkCourse());
        s3.display();
    }
}