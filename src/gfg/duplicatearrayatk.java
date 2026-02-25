package gfg;

import java.util.HashSet;

public class duplicatearrayatk {
    static void brute(int[] arr,int k) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<=k && i+j<n; j++){
                if(arr[i] == arr[i+j]){
                    System.out.println("true");
                }
            }
        }
        System.out.println("false");

    }

    static boolean  sidingwindow(int[] arr,int k) {
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;

        int j = 0;
        for(int i  =0 ; i<n; i++){
            int length = j-i;

            if(length>k){
                hs.remove(arr[j]);
                j++;
            }
            if(hs.contains(arr[i])){
                return true;
            }
            hs.add(arr[i]);
        }
        return  false;
    }

    static void main() {
        int[] arr = {1,2,3,4,1,2,3,4};
        int[] nums = {1,2,3,1,4,5};

        //brute(nums);
        //brute(arr);
    }
}
