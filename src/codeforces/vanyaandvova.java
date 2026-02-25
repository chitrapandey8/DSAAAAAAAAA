package codeforces;

import java.util.Scanner;

public class vanyaandvova {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-->0){
            int a = sc.nextInt();


            if ((a-1) % 3 == 0 || (a+1) % 3 == 0){  //bodmas
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }

    }
}
