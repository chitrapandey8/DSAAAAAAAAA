package gfg;

import java.util.Arrays;

public class isarrayrotated {
    static boolean brute(int[] arr) {
        int[] brr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr);

        for(int i  = 0; i<arr.length;i++){
            if(arr[i] != brr[i]){
                return false;
            }
        }
        return true;
    }


    static boolean better(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return false;
    }

    static void main() {
        int[] arr = {90,80,100,70,40,30};
        System.out.println(better(arr));
    }

}
