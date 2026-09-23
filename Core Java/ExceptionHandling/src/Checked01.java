import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked01 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("data.text");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
