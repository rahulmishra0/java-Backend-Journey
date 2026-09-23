public class FinallyDemo02 {
    public static void main(String[] args) {

        //try without catch -- No
        //Try always run in pair either Catch or Finally
        try {
            System.out.println("Try block");
        }
        finally {
            System.out.println("finally");
            //use for
            //cleanup code
            //connection close
        }
    }
}
