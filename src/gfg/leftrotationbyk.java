package gfg;

import java.util.Arrays;

public class leftrotationbyk {
    static void brute(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[k];

        for(int i = 0; i<k; i++){
            temp[i] = arr[i];
        }

        int[] ans = new int[n];
        for(int i = k; i<n; i++){
            ans[i-k] = arr[i];
        }

        for(int i = k+1; i<n; i++){
            ans[i] = temp[i-(k+1)];
        }

        System.out.println(Arrays.toString(ans));
    }

    static void betterleftrotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        swap(arr,0,k-1);
        swap(arr,k,n-1);

        swap(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr , int start, int end) {
        while (start< end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
//        brute(arr,2);
        betterleftrotate(arr,k);
    }
}
