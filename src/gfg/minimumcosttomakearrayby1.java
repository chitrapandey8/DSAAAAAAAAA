package gfg;

public class minimumcosttomakearrayby1 {
    static void brute(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            min = Math.min(min, i);

        }
        int lengthofmaxelement = n-1;
        int ans = lengthofmaxelement*min;
        System.out.println(ans);
    }
    static void main() {
        int[] arr =   {3,4};     //{4,3,2};
        brute(arr);
    }
}
