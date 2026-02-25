package codeforces;

import java.util.Scanner;

public class sorttheabc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int x  = A;
        int y = B;
        int z = C;

        if(A>B){
            int temp = A;
            A = B;
            B = temp;
        }
        if (B > C) {
            int temp = C;
            C = B;
            B = temp;

            if(A>B){
                int tempp = A;
                A = B;
                B = tempp;
            }
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
