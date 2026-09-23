public class StringDemo {
    public static void main(String[] args) {

        String ageText = "21";

        //String ko integer m convert karne ke liye parseInt() method ka use karte h with wrapper Integer.
        int age = Integer.parseInt(ageText);

        System.out.println(age);


        //Creating Object (Old way -> deprecated)
        //Integer num = new Integer(10); //deprecated
        Integer num1 = Integer.valueOf(10);  //old

        //new -> use like primitive
        Integer n = 100;
        Double d  = 99.5;


    }
}
