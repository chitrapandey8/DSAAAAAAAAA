package gfg;

public class random {
    static void printodd(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if(Math.abs(arr[i]%2) == 1){
                System.out.println(arr[i]);
            }
        }
    }

    static void main() {
        int[] arr = {1,2,3,4,5,-1,-2,-3,-4,-5};
        printodd(arr);
    }
}
