package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class duplicatesremove {
    static void better(int[] arr) {
        ArrayList<Integer> brr = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(!brr.contains(arr[i])){  // or // brr.get(brr.size()-1)
                brr.add(arr[i]);
            }

        }

        for(int i = 0; i<brr.size(); i++){
            arr[i] = brr.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }

    static void brute(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for(int x:arr){
            hs.add(x);
        }

        ArrayList<Integer> Arr = new ArrayList<>(hs);
        System.out.println(Arr);

        for (int i = 0; i < hs.size(); i++) {
            arr[i] = Arr.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }


    static void optimal(int[] arr) {

    }

    static void main() {
        int[] arr = {1,2,2,3,4,4,4,5,5};
        brute(arr);

    }
}
