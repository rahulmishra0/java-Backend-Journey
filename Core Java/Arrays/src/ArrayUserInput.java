import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        //take Student marks in input

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        for (int i=0; i<marks.length; i++){
            System.out.print("Enter the marks for Students "+(i+1)+" : ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Marks is....");
        for (int mark : marks){
            System.out.println(mark);
        }
        sc.close();  //scanner close
    }
}
