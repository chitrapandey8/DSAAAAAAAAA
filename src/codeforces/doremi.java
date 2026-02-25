package codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class doremi {
   public  static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0){
            int n = in.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
            }

            HashMap<Integer, Integer> hm = new HashMap<>();
            for(int x:arr){
                hm.put(x,hm.getOrDefault(x,0)+1);
            }

            if(hm.size()>=3){
                System.out.println("NO");
            } else if (hm.size() == 1) {
                System.out.println("YES");
            }else{
                ArrayList<Integer> a = new ArrayList<>();
                for(Map.Entry<Integer,Integer> h : hm.entrySet()){
                    a.add(h.getValue());
                }


                int first = a.get(0);
                int second = a.get(1);


                if(first == second){
                    System.out.println("YES");
                } else if (n%2 != 0  && Math.abs(first - second) == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
            }


            }

        }
    }
}
