package codeforces;

import java.util.Scanner;

public class flipcellboxes {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n-->0){
            int a = in.nextInt();
            String s = in.next();

            boolean flag = false;
            for(int i = 0; i<s.length()-2; i++){
                if(s.charAt(i) == '.' && s.charAt(i+1) == '.' && s.charAt(i+2) == '.'){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println('2');
            }else {
                int count = 0;
                for (int i = 0; i<s.length(); i++){
                    if(s.charAt(i) == '.'){
                        count++;
                    }
                }
                System.out.println(count);
            }

        }
    }
}
