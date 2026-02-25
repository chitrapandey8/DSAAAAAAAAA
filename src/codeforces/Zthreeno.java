package codeforces;

import java.util.Scanner;

public class Zthreeno {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;


            int k = in.nextInt();
            int s = in.nextInt();

            for(int i = 0; i<=k; i++){
                for(int j = 0; j<=k; j++){
                    int z  = s-(i+j);
                    if(z>=0 && z<=k){
                        count++;
                    }
            }
        }
        System.out.println(count);
    }
}
