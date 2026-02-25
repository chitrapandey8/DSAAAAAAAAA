package gfg;

public class sumofsubarray {
    static void brutensquare(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            int subarray =0;
            for(int j = i; j<n; j++){
                subarray += arr[j];
                sum += subarray;
            }
        }
        System.out.println(sum);
    }

    static void optimal(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += arr[i] * ((n-i)*(i+1));
        }
        System.out.println(sum);
    }


    static void main() {
        int[] arr = {1,4,5,3,2};
        brutensquare(arr);
        optimal(arr);
    }
}
