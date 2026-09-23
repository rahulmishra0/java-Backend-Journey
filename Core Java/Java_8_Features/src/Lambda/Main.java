package Lambda;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new SoftwareEngineer();
//        System.out.println(employee.getName());

        //don't use Software Engineer class because after java 8 it is not useful.
        //so we can directly use with lambda function

        Employee e = () -> {
            return "Software Engineer"; //direct implementation of Software Engineer class. (now you can delete Software Engineer class)
        };
        System.out.println(e.getName());
    }
}
