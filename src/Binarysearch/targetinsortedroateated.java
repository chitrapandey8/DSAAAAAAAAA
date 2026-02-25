package Binarysearch;

public class targetinsortedroateated {
    static int  brute(int[] arr, int target) {
        int n = arr.length;

        int start = 0;
        int end = n-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }


            if(arr[start] <= arr[mid]){

                if(target >= arr[start] && target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > arr[mid] && target <= arr[end]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }




    static void main() {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int ans = brute(arr,3);
        System.out.println(ans);
    }
}
