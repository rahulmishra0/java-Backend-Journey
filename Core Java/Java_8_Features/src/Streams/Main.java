package Streams;
//Stream kyu use karte hain? – Collection (Array, List) par functional operations (filter, map, reduce) karne ke liye. Code short, readable, aur parallel processing aasan ho jati hai.

import java.util.Arrays;

//Stream -> Kisi bhi collection like Array, List ko Stream m convert kar sakte h and uspe declarative and functional programming kar sakte h.
//Stream m covert isliye kiya h kyuki hume khelna h collection ke sath.
public class Main {

    public static void main(String[] args) {

        //This is Old approach called imperative approach (Means hum likh rahe h ki kya karna h).
        //"Pehle loop chalao, har element check karo, agar even hai toh sum mein add karo" – Kaise karna hai ye bhi bata rahe ho.
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum1 = 0;
        for (int i=0; i<arr1.length; i++){
            if (arr1[i] % 2 == 0){
                sum1 += arr1[i];
            }
        }
        System.out.println(sum1);


        //Stream -> Declarative approach (Means hum bas bolenge kya karna h kaise karenge hume matlab na h)
        //"Mujhe even numbers ka sum chahiye" – Kya karna hai bas bata rahe ho, kaise karna hai Stream khud decide karega.
        int[] arr2 = {1, 2, 3, 4, 5};
        int sum2 = Arrays.stream(arr2).filter(n -> n%2 == 0).sum();

        System.out.println(sum2);

    }
}
