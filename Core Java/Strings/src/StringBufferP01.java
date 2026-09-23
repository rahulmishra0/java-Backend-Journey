public class StringBufferP01 {
    //It is also mutable like StringBuilder but is Thread safe (Synchronised)
    //Thread safe mean -> Multiple thread can use same object without corrupting internal data. That mean String Buffer methods are synchronised internally.

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Backend");
        sb.append(" Course");
        System.out.println(sb);
    }
}
