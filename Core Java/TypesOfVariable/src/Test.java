public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "rahul";
        s2.name = "priya";

        System.out.println(s1.name);
        System.out.println(s2.name);
        //System.out.println(s1.instName);//bad practice
        //best practice => access through class name why?
        //kyuki ye har jagah same rahega then no need to separate reference variable so you can directly access through class name
        System.out.println(Student.instName);

        System.out.println("...................");

        s1.name = "hariya"; //in instance case s1 m changes se only s1 m hi change hoga
        s1.instName = "Genie Academy"; //but in case static s1 m changes se s2 m bhi apne aap changes ho jayega

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println("..........");

        System.out.println(s1.instName);
        System.out.println(s2.instName);

    }
}
