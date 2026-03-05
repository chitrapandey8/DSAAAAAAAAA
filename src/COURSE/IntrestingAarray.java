package COURSE;

public class IntrestingAarray {
    static void xor(int[] arr) {
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            ans = ans^arr[i];
        }
        if(ans%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    static void main() {
        int[] arr = {1};
        xor(arr);
    }
}
