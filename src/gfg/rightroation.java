package gfg;

import java.util.Arrays;

public class rightroation {
    static void brute(int[] arr,int d) {
        int[] temp = new int[d];

        int n = arr.length;
        for(int i = n-d ; i<n; i++){
            temp[i-(n-d)] = arr[i];
        }
        int[] ans = new int[n];
        for(int i = 0; i< temp.length; i++){
            ans[i] = temp[i];
        }

        for(int i = temp.length; i< ans.length; i++){
            ans[i] = arr[i-d];
        }
        System.out.println(Arrays.toString(ans));
    }



    static void main() {
        int[] arrr = {1, 2, 3, 4, 5, 6};
        brute(arrr,2);
    }
}
