package Binarysearch;

public class coutnnoof1 {
    static void brutete(int[] arr) {
        int lower = 0;
        int n = arr.length-1;

        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == 1){
                ans = mid;
                start = mid+1;
            } else if (arr[mid] < 1) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        System.out.println(ans+1);

    }


    static void main() {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0};
        brutete(arr);
    }
}
