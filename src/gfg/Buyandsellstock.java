package gfg;

public class Buyandsellstock {
    static void brute(int[] arr) {
        int n = arr.length;

        int min = arr[0];
        int max = arr[0];

        int res = 0;
        int i = 0;
        while(i<n-1){

            /// jab tak nusksan h tab tak bhadaoo
            while(i<n-1 && arr[i] >= arr[i+1]){
                i++;
            }
            min = arr[i];

            //jab tak fayeda h tab tak badaoo
            while(i<n-1 && arr[i] <= arr[i+1]){
                i++;
            }
            max = arr[i];

            res += max - min;
        }
        System.out.println(res);
    }

    static void optimal(int[] arr) {
        int n = arr.length;
        int res = 0;
        for(int i = 0; i<n-1; i++){
            res += arr[i];
        }
        System.out.println(res);
    }

    static void main() {
        int[] arr = {100,180,260,310,40,515,695};
        brute(arr);
    }
}
