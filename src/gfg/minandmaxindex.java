package gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minandmaxindex {
    static void brute(int[] arr) {
        int n = arr.length;
        List<Integer> L = new ArrayList<>();

        int[] smaller = new int[n];

        int[] greater = new int[n];

        int min = 0;
        smaller[0] = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[min]) {
                min = i;
                smaller[i] = -1;
            } else {
                smaller[i] = min;
            }
        }
        System.out.println(Arrays.toString(smaller));


        int max = n - 1;
        greater[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[max]) {
                max = i;
                greater[i] = -1;
            } else {
                greater[i] = max;
            }
        }
        System.out.println(Arrays.toString(greater));

        for (int i = 0; i < n; i++) {
            if (smaller[i] != -1 && greater[i] != -1) {
                L.add(arr[smaller[i]]);
                L.add(arr[i]);
                L.add(arr[greater[i]]);
                break;
            }

        }
        System.out.println(L);


    }

    static void optimal(int[] arr) {
        int n = arr.length;

        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        int valueatlow = Integer.MAX_VALUE;

        List<Integer> L = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] <= small) {
                small = arr[i];

            } else if (arr[i] <= mid) {
                mid = arr[i];
                valueatlow = small;

            } else {
                L.add(valueatlow);
                L.add(mid);
                L.add(arr[i]);
                break;
            }

        }
        System.out.println(L);
    }


    static void main() {
        int[] arr = {12,11, 10,5,6,2,30};
//        brute(arr);
optimal(arr);

    }
}
