public class StringP01 {
    public static void main(String[] args) {
        String s1 = "java"; //SCP
        String s2 = "java"; //SCP

        System.out.println(s1 == s2); //true

        String s3 = new String("java"); //Heap

        System.out.println(s1 == s3); //false

        System.out.println(s1.equals(s3)); //true

    }
}
