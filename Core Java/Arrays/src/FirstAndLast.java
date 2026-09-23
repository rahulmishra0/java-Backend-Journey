public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {80, 90, 12, 134, 13, 44};

        //find first and last element
        System.out.println("First element : "+arr[0]);
        System.out.println("Last element : "+arr[arr.length-1]);

        int[] nums = new int[3];     //value not initialized
        System.out.println(nums[0]); //By default zero aayega
    }
}
