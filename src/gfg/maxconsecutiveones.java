package gfg;

public class maxconsecutiveones {
    static void brute(int[] arr, int k) {

        int n = arr.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = i; j<n; j++){
                if(arr[j] == 1){
                  count++;
                }
                if((j-i+1) - count == k){
                    max = Math.max(max, j-i+1);
                }
            }

        }
        System.out.println(max);

    }

    static void optimal(int[] arr, int k) {
        int n = arr.length;

        int max = 0;

        int left = 0;
        int rigth = 0;

        int count = 0;
        while(rigth< arr.length){
            if(arr[rigth] == 0){
                count++;
            }

            if(count>k){
                if(arr[left] == 0){
                    count--;
                }
                left++;
            }
            max = Math.max(max, rigth-left+1);
            rigth++;
        }
        System.out.println(max);
    }

    static void main() {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        brute(arr, 2);
        optimal(arr, 2);
    }
}
