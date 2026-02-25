package Binarysearch;

import java.util.Arrays;

public class firstandlastoccurnce {
    static void brute(int[] arr, int x) {
        int n = arr.length;
        int[] ar = new int[2];
        for(int i = 0; i<n; i++){
            if(arr[i] == x){
                ar[0] = i;
                break;
            }
        }
        for(int i = n-1; i>=0; i--){
            if(arr[i] == x){
                ar[1] = i;
                break;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    static void binarysearch(int[] arr, int x) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid =  start + (end - start)/2;


            if(arr[mid] == x){
                ans = mid;
                end = mid -1;
            } else if(arr[mid]> x){
                end  = mid-1;
            }else{
                start  = mid+1;
            }
        }

        start = 0;
        end = n-1;
        int anss = -1;
        while(start<=end){
            int mid =  start + (end - start)/2;


            if(arr[mid] == x){
                anss = mid;
                start = mid+1;
            } else if(arr[mid]> x){
                end  = mid-1;
            }else{
                start  = mid+1;
            }
        }
        System.out.println(anss);
    }

    static void lowerupperbound(int[] arr, int x) {
        int n = arr.length;

        int start = 0;
        int end = n;
        int ans = -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] >= x){
                ans = mid;
                end = mid;

            } else{
                start = mid+1;
            }
        }

        start = 0;
        end = n-1;
        int anss =-1;
        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > x){
                anss = mid;
                end = mid;

            } else{
                start = mid+1;
            }
        }
        System.out.println(anss);

        System.out.println(ans + " " + (anss-1));
    }

    static void main() {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
//        brute(arr,5);
//        binarysearch(arr,5);
        lowerupperbound(arr,5);
    }
}
