package Bitmanulipaltion;

public class subaraywithbitwise {
    static void main() {
        int A = 3;
        int[] B = {1,0,1};
        int total = (A*(A+1))/2;
        int zeros = 0;
        int count = 0;
        for(int i = 0; i<A; i++) {

//            int ans = 0;
//            for(int j = i; j<A; j++){
//                ans = ans | B[j];
//
//                if(ans == 1){
//                    count++;
//                }
//            }

            if(B[i] == 0){
                zeros++;
            }else{
                count += (zeros*(zeros+1))/2;
                zeros  = 0;
            }
        }

      count += (zeros*(zeros+1))/2;

        System.out.println(total - count);
    }
}
