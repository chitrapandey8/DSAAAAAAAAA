package gfg;

import java.util.Arrays;

public class Closestsumtozero {
    static void brute(int[]  arr) {
        int n = arr.length;

        int res = arr[0] + arr[1];

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n; j++){
                int sum = arr[i] + arr[j];
                if(Math.abs(sum) < Math.abs(res)){
                    res = sum;
                } else if (Math.abs(sum) == Math.abs(res)){
                    res = Math.max(res, sum);
                }
            }

        }
        System.out.println(res);
    }

    static void binarysearch(int[] arr) {
         int n = arr.length;
         int res = Integer.MAX_VALUE;

        Arrays.sort(arr);
         for (int i = 0; i<n; i++){
             int x = arr[i];

             int left = i+1;
             int right = n-1;

             while(left<=right){
                 int mid = left + (right - left)/2;

                 int curr = arr[mid] + x;

                 if(Math.abs(curr) < Math.abs(res)){
                     res = curr;
                 } else if(Math.abs(curr) == Math.abs(res)){
                     res = Math.max(curr, res);
                 }

                 if(curr<0){
                     left = mid+1;
                 }else{
                     right = mid-1;
                 }
             }
         }
        System.out.println(res);
    }

    static void Twopointer(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;

        int sum = arr[left] + arr[right];

        while (left<right){

            int curr = arr[left] + arr[right];
            if(Math.abs(curr) < Math.abs(sum)){
             sum = curr;
            } else if (Math.abs(curr) == Math.abs(sum)) {
                sum = Math.max(sum, curr);
            }

            if(curr<0){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(sum);

    }

    static void main() {
        int[] arr = {29, 13, -6, -32, -12};
        brute(arr);
        binarysearch(arr);
        Twopointer(arr);
    }
}
