package Binarysearch;

import java.util.Arrays;

public class SplitLargestSum {
    static void reverse(int[] arr) {
        int start = 0;
        int end  = arr.length-1;
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};     //[[1,2,3]
                                               //[4,5,6]]

        //M=m*n matrix == n*m matrix -- ex- 01 ko 10 mai karna
//        int m = arr.length; //2
//        int n = arr[0].length; //3
//        int[][] ans = new int[n][m];
//        for(int i = 0; i< m; i++){
//            for(int j = 0; j< n; j++){
//                ans[j][i] = arr[i][j];
//            }
//        }
//        for(int i = 0; i< arr.length; i++){
//            for(int j = i; j<arr.length; j++){
//               int temp = arr[i][j];
//               arr[i][j] = arr[j][i];
//               arr[j][i] = temp;
//            }
//        }


        int[][] ans2 =  {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i< ans2.length; i++){
            for(int j = i; j< ans2.length; j++){
                int temp = ans2[i][j];
                ans2[i][j] = ans2[j][i];
                ans2[j][i] = temp;
            }

        }

        for(int i = 0; i< ans2.length; i++){
            reverse(ans2[i]);
        }




        for(int i = 0; i< ans2.length; i++){
            System.out.println(Arrays.toString(ans2[i]));
        }
    }
}
