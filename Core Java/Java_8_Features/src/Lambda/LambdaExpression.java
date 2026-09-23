package Lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        //Method
        sayHello();

        //Lambda Expression -> removes Modifier, return type, Method name
        //in sabki jagah place arrow (->)
        //Java mein lambda expression akela statement ke roop mein nahi likh sakte. Lambda ko kisi functional interface ke saath associate karna padta hai.
        Runnable r = () -> {    //Runnable ek functional interface hai, jisme ek hi abstract method run() hota hai.
            System.out.println("Hello !");
        };
        r.run(); //lambda ko run karne ke liye
    }
    //normal Method
    public static void sayHello(){
        System.out.println("Hello !");
    }


}
