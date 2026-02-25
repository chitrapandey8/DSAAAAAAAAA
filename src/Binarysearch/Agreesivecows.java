package Binarysearch;

import java.util.Arrays;

public class Agreesivecows {
    static boolean canplace(int[] arr, int k, int dist) {
        int cow = 1;  //pehili gay
        int  last   = arr[0];  //last baar kaha rakhi thi

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - last >= dist){
                cow++;
                last = arr[i];
            }
            if(cow == k){
                return true;
            }

        }
        return  false;
    }



    static void brute(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        int start = 1; //ye minimum distance h jaha jaha par mai cows rakh sakti hu
        int end = arr[n-1] - arr[0]; //maximum distance jaha cows rakh sakti hu

        while(start<=end){
            int dist = start + (end - start)/2;

            if(canplace(arr, k , dist)){
                ans =  dist; //yer possible ho sakta bhai but kyuki mujhr as max distance lean hai mai rigth side jaungi
                start = dist+1;

            } else {
                end = dist -1;
            }
        }
        System.out.println(ans);

        }


    static void main() {

        int[] arr = {1,2,4,8,9};
        brute(arr,3);
    }
}
