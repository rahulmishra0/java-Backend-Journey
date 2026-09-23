public class FlowOfTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Line 1");
            System.out.println(10/0); //in Try block jaise hi exception occur hoga uske aage ki line nahi chalegi
            System.out.println("Line 2"); //means Line 2 not print
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Exception handler");
        }
        catch (RuntimeException e){
            System.out.println("Runtime Exception handler");
        }
        catch (Exception e){
            System.out.println("Exception handler");
        }

        System.out.println("Line 3");
    }
}
