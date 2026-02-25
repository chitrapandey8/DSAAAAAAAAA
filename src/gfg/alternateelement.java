package gfg;

import java.util.ArrayList;

public class alternateelement {
    static void recursion(int[] arr, int index, ArrayList<Integer> Arr) {
     if(index<arr.length){
         Arr.add(arr[index]);
         recursion(arr, index+2, Arr);
     }
    }
    static ArrayList<Integer> alternate(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        recursion(nums,0,ans);
        return ans;
    }


    static void main() {
        int[] nums = {10,20,30,40,50};
        ArrayList<Integer> arr = alternate(nums);
        System.out.println(arr);
    }
}
