public class TryCatch {
    public static void main(String[] args) {
        try {
            int res = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("Invalid division");
            //Ager mughe exception bhi print karna ho then
            e.printStackTrace();
            //Also for massage
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed");
    }
}
