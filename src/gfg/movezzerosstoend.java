package gfg;

import java.util.ArrayList;
import java.util.Arrays;

public class movezzerosstoend {
    static void brute(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                a[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));

    }

    static void twopointer(int[] arr) {
        int n = arr.length;
        int slow = 0;
        for(int fast = 0; fast <n; fast++){
            if(arr[fast] != 0){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        for(int i = slow; i<n; i++){
            arr[i] = 0;
        }

    }
    static void main() {
        int[] arr = {1,2,0,4,3,0,5,0};
        //brute(arr);
        twopointer(arr);
    }
}
