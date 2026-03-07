package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class sortinggcompa {
   public static void main(String[] args) {
        int[][] twoD = {{1,2},{3,7},{8,9},{4,2},{5,3}};


        //ye line 2D array ko sort krti hai comparator decide krta sorting kis basic pe hai,comparingInt(int[] a-> a[0]) ek lambda expression hai
//        Arrays.sort(twoD, Comparator.comparingInt((int[] a) -> a[0]));

        Arrays.sort(twoD,(a1,a2) -> a2[0] - a1[0]); //desending //positive aaya toh a2 pehele aayega
       // a1 - a2 == agar nergative aaya toh a1 pehele ayega toh asceing order
         System.out.println(Arrays.deepToString(twoD)); //2d array ko print krne ke liye hota hai
    }
}
