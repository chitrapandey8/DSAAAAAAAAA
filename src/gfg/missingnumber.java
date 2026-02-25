package gfg;

public class missingnumber {
    static void brute(int[] nums) {
        int n = nums.length+1;
        for(int i = 1; i<=n; i++){
            boolean flag = false;
            for(int j = 0; j< nums.length; j++){
                if(nums[j] == i) {
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.println(i);
            }
        }
    }


    //hasharray
    static void bettter(int[] arr) {
          int n = arr.length;
          int[] Hasharr = new int[n+2];

          for(int i = 0; i< n; i++){
              Hasharr[arr[i]]++;
          }

          for(int i = 1; i < Hasharr.length; i++){
              if(Hasharr[i] == 0){
                  System.out.println(i);
              }
          }

    }

    static void xor(int[] arr) {
        int n = arr.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i  =0; i< n; i++){
            xor1 ^= arr[i];
        }

        for(int i = 1; i<=n+1; i++){
            xor2 ^= i;
        }
        int sum = xor1^xor2;
        System.out.println(sum);
    }


    static void sum(int[] arr) {
        int n = arr.length;
        int totalsum = 0;
        for(int i = 1; i<=n+1; i++){
            totalsum += i;
        }

        int arraysum = 0;
        for(int i = 0; i<n; i++){
            arraysum += arr[i];
        }
        int val = totalsum - arraysum;
        System.out.println(val);
    }

    static void main() {
        int[] arr = {8,2,4,5,3,7,1};
        //brute(arr);
        //bettter(arr);
       // xor(arr);
        sum(arr);
    }
}
