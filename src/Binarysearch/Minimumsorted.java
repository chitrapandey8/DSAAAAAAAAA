package Binarysearch;

public class Minimumsorted {
    static void brute(int[] arr) {
        int n = arr.length;
        int start = 0; int end = n-1;
        int ans = -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid]<=arr[end]){
                ans = arr[mid];
                end = mid;
            } else{
                start = mid+1;
            }
        }
        System.out.println(ans);

    }


    static void main() {
        int[] arr = {5,6,1,2,3,4};
        brute(arr);
    }
}
