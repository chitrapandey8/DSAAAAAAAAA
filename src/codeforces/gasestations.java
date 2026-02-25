package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class gasestations {
    public static void main() {
        Scanner in = new Scanner(System.in);
        int testcaes = in.nextInt();


        while(testcaes-->0){
            int nogasstations = in.nextInt();
            int tillx = in.nextInt();

            int[] arr = new int[nogasstations+2];
            arr[0] = 0;
            arr[arr.length-1] = tillx;
            for(int i = 1; i<nogasstations+1; i++){
                arr[i] = in.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int i = 0; i< arr.length-1 ; i++){
                if(i == arr.length-2){
                    max  = Math.max(max,(arr[arr.length-1] - arr[i])*2);
                }
                max =  Math.max(max,arr[i+1] - arr[i]);

            }
            System.out.println(max);
        }

    }
}
