package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Heapyfy {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while(a-->0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            for(int i =0; i<n-1; i++){
                if(arr[i] == arr[i+1]){

                }
            }

            if(n%2 == 0){
                System.out.println("YES");

            } else{
                int mid = arr[n/2];
                Arrays.sort(arr);
                int midd = arr[n/2];
                if(mid == midd){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }

    }
}
