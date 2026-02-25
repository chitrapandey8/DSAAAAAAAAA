package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class reversingarray {
    static void naive(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> Arr  = new ArrayList<>();

        for(int i = n-1; i>=0; i--){
            Arr.add(arr[i]);
        }
        System.out.println(Arr);
    }


    static void swapping(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }






    static void recursive(int[] arr, int start, int end) {
        if(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            recursive(arr, start+1,end-1);
        }

    }

    static void main() {
        int[] arr = {1,4,3,2,6,5};
//        naive(arr);
//        swapping(arr);
        int start = 0;
        int end = arr.length-1;
        recursive(arr,start,end);
        System.out.println(Arrays.toString(arr));

    }
}
