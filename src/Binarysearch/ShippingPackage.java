package Binarysearch;

import java.util.Arrays;

public class ShippingPackage {
    public static boolean isPossible(int[] nums,int cap,int D) {
        int curr = 0;
        int days = 1;
        for (int x:nums){
            if (curr+x<=cap){
                curr+=x;
            }else {
                days++;
                curr = x;
                if (days>D){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        int start = 0;
        for (int x:weights){
            start = Math.max(start,x);
        }
        int end = Arrays.stream(weights).sum();

        int ans = 0;
        while (start<=end){
            int cap = start+(end-start)/2;
            if (isPossible(weights,cap,D)){
                ans = cap;
                end = cap-1;
            }else {
                start = cap+1;
            }
        }

        System.out.println(ans);
    }
}
