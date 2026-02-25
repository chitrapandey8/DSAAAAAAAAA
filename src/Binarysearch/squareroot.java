package Binarysearch;

public class squareroot {
    static int brute(int n) {

        int res = 1;
        while(res*res<=n){
            res++;
        }
        return res-1;
    }

    static int  Binarysearch(int n) {
        int start = 1;
        int end = n;

        int anss = -1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid * mid == n){
                return mid;
            }

            if(mid*mid>n){
                end = mid -1;
            } else{
                anss = mid;
                start = mid+1;
            }
        }
        return anss;

    }

    static void main() {
        int n = 11;
        int ans = brute(n);
        System.out.println(ans);
        int ans1 = Binarysearch(n);
        System.out.println(ans1);
    }
}
