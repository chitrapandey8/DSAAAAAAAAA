package gfg;

import java.util.Arrays;

public class rearrangevenoddpositioned {
    static void swap(int[] arr,int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }



    static void brute(int[] arr) {
        int n = arr.length;
        for(int i = 1; i<n; i++){
            if(arr[i] < arr[i-1] && i%2!=0 ) {
                swap(arr,i,i-1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void main() {
        int[] arr = {1,2,2,1};
        int[] nums = {1,3,2};
        brute(nums);
    }
}
