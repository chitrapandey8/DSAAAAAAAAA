package COURSE;

import java.util.Scanner;

public class Abmodulo {
    static void main() {
       int a  = 5;
       int b = 10;

       for(int i = Math.min(a,b); i>=1; i--){
           if((a%i) == (b%i)){
               System.out.println(i);
               break;

           }
       }
    }
}
