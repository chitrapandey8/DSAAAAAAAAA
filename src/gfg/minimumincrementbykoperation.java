package gfg;

public class minimumincrementbykoperation {
    static int brute(int[] arr,int k) {
      int max = 0;
      for(int x :arr){
          max = Math.max(max,x);

      }

      int operation = 0;
      for(int x :arr){
          int sub = max - x;
          if(sub%k!=0){
              return -1;
          }

          operation += sub/k;

      }
     return  operation;
    }



    static void main() {
        int[] arr = {4,2,6,8};
        int k = 3;
        int ans = brute(arr,k);
        System.out.println(ans);
    }
}
