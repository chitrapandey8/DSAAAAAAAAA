package Binarysearch;


public class cocoeating {
    static boolean ispossible(int[] arr, int mid, int h) {
        int hours = 0;
        for(int x : arr){
            hours += (x+(mid-1))/mid;
            if(hours>h){
                return false;
            }
        }
        return true;
    }



    static void  brute(int[] arr, int h) {
      int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int x : arr){
          max = Math.max(x,max);
      }
        int start = 1;
        int end = max;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(ispossible(arr,mid,h)){
            ans = mid;
            end = mid -1;

            }else{
                start = mid+1;
            }
        }

        System.out.println(ans);


    }


    static void main() {
        int[] arr = {3,6,7,11};
        brute(arr,8);

    }
}
