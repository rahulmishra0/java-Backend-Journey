public class StringBuilderP02 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Backend");
        System.out.println(sb);

        sb.insert(4, " Fullstack");
        System.out.println(sb);

        sb.delete(4, 14);
        System.out.println(sb);

        sb.replace(5, 12, "Spring");
        System.out.println(sb);

        //Best use of toString in real project is If you to change the String text agen and agen then you should initialize agen and agen then
        //Instead of using String used String Builder After that convert into a String using toString to maintain immutability and Thread safety.
        String res = sb.toString(); //toString -> use to Convert sb into String
        System.out.println(res);
    }

}
