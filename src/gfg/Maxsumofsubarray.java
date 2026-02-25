package gfg;

public class Maxsumofsubarray {
    static void brute(int[] arr) {
        int n = arr.length;

        int largestsum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
               sum += arr[j];
                if(sum > largestsum){
                    largestsum = sum;
                }
            }

        }
        System.out.println(largestsum);
    }


    static void main() {
        int[] arr = {2,3,-8,7,-1,2,3};
        brute(arr);
    }
}
