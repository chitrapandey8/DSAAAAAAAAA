package slidingwindow;

public class buyandsellstocks {
    static int brute(int[] arr) {
        int n = arr.length;
        int maxpro = 0;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                maxpro = Math.max(arr[j] - arr[i], maxpro);
            }
        }
        return maxpro;
    }


    static int better(int[] arr) {
        int n = arr.length;
        int res = 0;
        int minsofar = arr[0];
        for(int i = 0; i<n; i++){
            minsofar = Math.min(minsofar, arr[i]);

            res = Math.max(res,arr[i]-minsofar);
        }
      return res;
    }

    static void main() {
    int[] arr =    {1, 3, 6, 9, 11}; //  {7, 6, 4, 3, 1};    //{7, 10, 1, 3, 6, 9, 2};
        int ans =    better(arr);         // brute(arr);
        System.out.println(ans);
    }
}
