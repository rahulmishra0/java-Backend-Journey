public class Course {

    String name = "spark 6.0";
    static String instName = "CFS";

    public static void main(String[] args) {
        //static area -> only static properties and methods are use
        System.out.println(instName);

        //if you want to use non static in static area then its possible through object
        System.out.println(new Course().name);


        //print(); //not possible
        // 1. make print static
        // 2. use object reference

    }

    void print(){
        //in nonstatic -> we can use both
        System.out.println(name);
        System.out.println(instName);
    }
    void m1(){
        print();
    }
}
