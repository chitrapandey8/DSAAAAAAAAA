package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dividearrayintoequalsum {
    static int  findsum(int[] arr, int start, int end) {
        int sum = 0;
         for(int i = start; i<=end; i++){
             sum += arr[i];
         }
         return sum;
    }

    static void brute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){

                int sum1 = findsum(arr, 0, i);
                int sum2 = findsum(arr, i+1, j);
                int sum3 = findsum(arr, j+1, n-1);

                if(sum1 == sum2 && sum2 == sum3){
                    System.out.println(i + " " + j);
                }
            }
        }

    }

    static List<Integer> optimal(int[] arr) {
        int total = Arrays.stream(arr).sum();
        int target = total/3;
        int n = arr.length;

        ArrayList<Integer> L = new ArrayList<>(Arrays.asList(-1,-1));
        if(total%3 != 0){
            return L;
        }


        int sum = 0;
        int count = 0;
        for(int i = 0; i< n; i++){
            sum += arr[i];

            if(sum == target){
                L.set(count++, i);                // ye index h pehle 0 hoga phir 1 hoga toh jaise hi 2 ke barabar ho  toh break kardoo;
                sum = 0;

            }
            if(count == 2){
                break;
            }
        }


    return L;
    }

    static void main() {
        int[] arr = {2,3,4};
        System.out.println(optimal(arr));
    }
}
