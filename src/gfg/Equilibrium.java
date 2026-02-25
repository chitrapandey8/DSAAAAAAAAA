package gfg;

public class Equilibrium {
    static void brute(int[] arr) {
         int n = arr.length;
         int index = -1;
         for(int i = 0; i<n; i++){
             int leftsum = 0;
             int rightsum = 0;

             if(i==0){
                 leftsum = 0;
                 for(int j = i+1; j<n; j++){
                     rightsum += arr[j];
                 }
             }  else if (i==n-1){
                 rightsum = 0;
                 for(int j = 0; j<i; j++){
                     leftsum += arr[j];
                 }
             } else{
                 for(int j = 0; j<i; j++){
                     leftsum += arr[j];
                 }

                 for (int j = i+1; j < n; j++) {
                     rightsum += arr[j];
                 }
             }

             if(leftsum == rightsum){
                 index = i;
                 break;
             }
         }
        System.out.println(index);
    }


    static void presum(int[] arr) {
        int n = arr.length;
        int[] presum = new int[n];
        presum[0] = arr[0];

        for(int i = 1; i<n; i++){
            presum[i] = arr[i] + presum[i-1];
        }


        int index = -1;
        for (int i = 0; i < n; i++) {
            int leftsum = 0;
            int rightsum = 0;

            if (i == 0) {
                leftsum = 0;
            } else {
              leftsum = presum[i-1];

            }
            rightsum = presum[n-1] - presum[i];

            if(leftsum == rightsum){
                index = i;
            }

        }
        System.out.println(index);

    }

    static void optimal(int[] arr) {
         int n = arr.length;
         int leftsum = 0;
         int total = 0;
         int index = -1;
         for(int i = 0; i<n; i++){
             total += arr[i];
         }


        for (int i = 0; i < n; i++) {
            total -= arr[i];
            if(leftsum == total){
                index =i;
                break;
            }
            leftsum += arr[i];

        }
        System.out.println(index);
    }


    static void main() {
        int[] arr = {-7,5,1,2,-4,3,0};
        brute(arr);
        optimal(arr);
    }
}
