package Sorting;

import java.util.Arrays;

public class Bubblesort {
    static void main() {
        int[] arr = {3,1,5,4,2};

        int n = arr.length;

        for(int i =1; i<n; i++){
            for(int j = 0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
