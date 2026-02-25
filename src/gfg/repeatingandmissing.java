package gfg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class repeatingandmissing {
    static void brute(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);

        }

        ArrayList<Integer> Arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> h : hm.entrySet()){
            if(h.getValue() == 2){
                Arr.add(h.getKey());
            }
        }

        for (int i = 1; i <= n; i++) {
           if(!hm.containsKey(i)){
               Arr.add(i);
           }
        }
        System.out.println(Arr);
    }


    static void optimalll(int[] arr) {
        int n = arr.length;
        int repeating = -1;

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i<n; i++){
            int val = Math.abs(arr[i]);


            if(arr[val-1] > 0){
                arr[val-1] = -arr[val-1];
            } else{
                repeating = arr[i];
            }
        }

        a.add(repeating);

        int missing = -1;
        for (int i = 0; i<n; i++){
            if(arr[i] > 0){
                missing = arr[i];
            }
        }
        a.add(missing);

        System.out.println(a);


    }


    static void main() {
        int[] arr = {4,3,6,2,1,1};
        brute(arr);
    }
}
