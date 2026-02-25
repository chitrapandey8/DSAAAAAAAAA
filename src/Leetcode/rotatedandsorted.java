package Leetcode;

public class rotatedandsorted {
    static boolean brute(int[] arr) {
        int n = arr.length;
        int k = 0;
        for(int i = 0; i< n-1; i++){
            if(arr[i]>arr[i+1]){
                k = i;
                break;
            }
        }
        System.out.println(k);
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);



        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;


    }
    static void swap(int[] arr, int start, int end) {
        while(start<=end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    static boolean better(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i= 0; i<n; i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
                if(count>1){
                    return false;
            }
                
            }
        }
        return true;
    }
    
    static void main() {
        int[] arr = {3,4,5,1,2};
        System.out.println(better(arr));
    }
}
