package gfg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class leaderofarray {
    static void brute(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> Arr = new ArrayList<>();


        for(int i = 0; i<n; i++){
            int max = arr[i];
            boolean flag = false;
            for(int j = i+1; j<n; j++){
                if(arr[j]>max){
                    flag = true;
                }
            }
            if(!flag){
                Arr.add(max);
            }



        }
        System.out.println(Arr);

    }

    static void better(int[] arr) {
        int n = arr.length;

        int max = arr[n-1];
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(max);

        for(int i = n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                Arr.add(max);
            }

        }
        Collections.reverse(Arr);
        System.out.println(Arr);
    }


    static void main() {
        int[] arr = {16,17,4,3,5,2};
        better(arr);
    }
}
