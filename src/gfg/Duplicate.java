package gfg;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate  {
    static void brute(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if(arr[j] == arr[i]){
                    System.out.println(arr[i]);
                }
            }
        }
    }


    static void bysorting(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0; i< arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }


    //hashset
    static void better(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i< arr.length; i++){
              if(hs.contains(arr[i])){
                  System.out.println(arr[i]);
              }else{
                  hs.add(arr[i]);
              }
        }
    }

    static void optimal(int[] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int val  = Math.abs(arr[i]);

            if(arr[val] > 0){
                arr[val] = -arr[val];
            } else{
                System.out.println(val);
            }
        }
    }

    //xor
    //sum
    static void main() {
        int[] arr = {1,3,2,3,4};
        brute(arr);
        better(arr);
        bysorting(arr);
        optimal(arr);
    }
}
