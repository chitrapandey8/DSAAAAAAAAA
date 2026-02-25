package Binarysearch;

import java.util.ArrayList;
import java.util.HashSet;

public class commoninthreearrays {
    static void brute(int[] arr, int[] arr2, int[] arr3) {
        int n = arr.length;
        int m = arr2.length;
        int o = arr3.length;

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for(int x:arr){
            hs.add(x);
        }

        for(int i = 0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                hs2.add(arr2[i]);
            }
        }

        for(int i =0; i<arr3.length; i++){
            if(hs2.contains(arr3[i])){
                temp.add(arr3[i]);
            }
        }


        System.out.println(temp);
    }

    static void optimal(int[] arr, int[] arr2, int[] ar3) {
        int n = arr.length;
        int m = arr2.length;
        int o = ar3.length;


        int i = 0;
        int j = 0;
        int k = 0;

        ArrayList<Integer> ar = new ArrayList<>();

        while(i<n && j<m && k<o){
            if(arr[i] == arr2[j]  && arr2[j] == ar3[k]){
                ar.add(arr[i]);
                i++;
                j++;
                k++;

                while(i < n && arr[i] == arr[i-1]){
                    i++;
                }while(j < m && arr2[j] == arr2[j-1]){
                    j++;
                }while(k < o && ar3[k] == ar3[k-1]){
                    k++;
                }
            }

             else if(arr[i] < arr2[j]){
                i++;
            } else if (arr2[j] < ar3[k]) {
              j++;
            }else {
                k++;
            }

        }
        System.out.println(ar);
    }




    static void main() {
        int[] arr = {1,5,10,20,30};
        int[] arr2 = {5,13,15,20};
        int[] ar3 = {5,20};
        //brute(arr,arr2,ar3);
        optimal(arr,arr2,ar3);




    }
}
