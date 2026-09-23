package NonAccessDemo;

public class FinalTest {
    public static void main(String[] args) {
        final int maxMarks = 100; //it can not be changed
        //final -> means ek value assign hone ke baad dubara reassign nahi hogi
        //maxMarks = 80; //not possible

        System.out.println(maxMarks);
    }
}
