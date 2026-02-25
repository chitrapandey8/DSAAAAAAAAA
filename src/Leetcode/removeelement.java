package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class removeelement {
    static void brute(int[] arr, int value) {
        int n = arr.length;

        ArrayList<Integer> A = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(arr[i] != value){
                A.add(arr[i]);
            }
        }

        for(int i = 0; i<A.size(); i++){
            arr[i] = A.get(i);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(A.size());

    }

    static void optimal(int[] arr,int value) {
        int n = arr.length;
        int slow = 0;
        for (int fast = 0; fast < n; fast++) {
            if(arr[fast] != value){
                arr[slow] = arr[fast];
                slow++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(slow-1);
    }

    static void main() {
        int[] arr = {3,2,2,3};
        brute(arr,3);
        optimal(arr,3);
    }
}
