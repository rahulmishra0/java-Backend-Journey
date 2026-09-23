import java.util.Arrays;

public class ArrayExample01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //for each loop -> use to print data
        for (int ele : arr){
            System.out.println(ele);
        }

        int[] arr1 = {15, 25, 35, 45, 55};
        //shortcut print -> bad practice
        System.out.println(Arrays.toString(arr1));
        //or
        System.out.println("Size : "+arr1.length); //size of array

        //print data trough index
        for (int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
