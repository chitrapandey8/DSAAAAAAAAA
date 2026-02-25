package Binarysearch;

public class coins {
    static int binary(int n) {
        int start = 1;
        int end = n;
       int ans =n;

        while(start <= end){
            int mid = start + (end - start )/2; //ye row nikhli hai toh toh mai ye check karugi ki uss row tak kitne coins bharr sakte hai

            int totalcoin = (mid*(mid+1))/2;

            if(totalcoin == n){
                return mid;
            }
            if(totalcoin <= n){
                ans = mid;
                start = mid+1;
            } else{
                end =  mid-1;
            }
        }
        return ans;

    }
    static void main() {
        int n = 5;
        System.out.println(binary(n));

    }
}
