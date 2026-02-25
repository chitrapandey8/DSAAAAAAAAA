package gfg;

import java.util.ArrayList;
import java.util.List;

public class generatingsubarrays {
    static void brute(int[] arr) {
        ArrayList<ArrayList<Integer>>  Arr = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){

            for(int j = i; j< arr.length; j++){
                ArrayList<Integer> nums = new ArrayList<>();
                for(int k  = i; k<=j; k++){
                    nums.add(arr[k]);
                }
                Arr.add(nums);
            }

        }


        System.out.println(Arr);
    }


    static void betterbyrecursion(int[] arr)  {
        ArrayList<ArrayList> Arr = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){
                ArrayList<Integer> temp = new ArrayList<>();
                recursive(arr,i,j,temp);
                Arr.add(temp);
            }

        }
        System.out.println(Arr);
    }

    static void recursive(int[] arr, int start, int end, ArrayList<Integer> temp) {
        if(start<=end){
            temp.add(arr[start]);
            recursive(arr,start+1,end,temp);
        }
    }

    static void main() {
     int[] arr = {1,2,3};
//     brute(arr);
     betterbyrecursion(arr);

    }
}
