package codeforces;

import java.util.Scanner;

public class swappingpermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        while(a-->0){
            int t = in.nextInt();

            int[] arr = new int[t];
            for(int i = 0; i<t; i++){
                arr[i] = in.nextInt();
            }
            if(arr[0]!=1){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
