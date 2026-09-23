public class StringBuilderP01 {
    //String Builder is mutable means not thread safe. It is internally used a character Array for storage
    //No concept of SCP

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Backend"); //don't need to hold like string
        sb.append(" Course");

        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //It have default capacity -> 16 that is increase by 16+Length of String (Formula = old capacity *2 +2)
    }
}
