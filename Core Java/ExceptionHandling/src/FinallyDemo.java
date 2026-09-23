public class FinallyDemo {

    //Finally -> use for clean of activity
    public static void main(String[] args) {
        try {
             int res = 10/0;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println("Exception Handler");
        }
        finally {
            System.out.println("Finally block executed always");
        }
    }
}
