public class UnChecked03 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[-5];
            System.out.println(arr.length);
        }
        catch (NegativeArraySizeException e){
            System.out.println("Negative value Not valid for size");
        }
    }
}
