package Scaler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


//ye implemenrt krta hai merge sort using multithreading, callable retruen karta hai
public class Sorter implements Callable<List<Integer>> {

    private List<Integer> arrToSort;

    public Sorter(List<Integer> arrToSort){
        this.arrToSort = arrToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrToSort.size() <= 1 ){
            return arrToSort;
        }

       int mid = arrToSort.size()/2;

       List<Integer> leftToSort = new ArrayList<>();
       for(int i = 0; i<mid; i++){
           leftToSort.add(arrToSort.get(i));
       }

        List<Integer> rightToSort = new ArrayList<>();
        for(int i = mid; i<arrToSort.size(); i++){
            rightToSort.add(arrToSort.get(i));
        }

        ExecutorService executor  = Executors.newFixedThreadPool(2);

       Future<List<Integer>> sortedleftArray = executor.submit(new Sorter(leftToSort)); //as soon i have done my work i will put the soted array in this variable
        Future<List<Integer>> sortedRigthArray = executor.submit(new Sorter(rightToSort)); //futite mai get i nhi hota
        List<Integer> sortedArray = new ArrayList<>();

        List<Integer> SortedLeftArray = sortedleftArray.get(); //wait karega pure left ka sort hone tak ka
        List<Integer> SortedRigthArray = sortedRigthArray.get(); //ye sortedarray leta hai, thread complete hone ka wait lrta hai


        /// code to merge two soreted array
        int i = 0;
        int j = 0;

        while(i< SortedLeftArray.size() && j < SortedRigthArray.size()){
            if(SortedLeftArray.get(i) < SortedRigthArray.get(j)){
                sortedArray.add(SortedLeftArray.get(i));
                i++;
            } else{
                sortedArray.add(SortedRigthArray.get(j));
                j++;
            }
        }

        while(i< SortedLeftArray.size()){
            sortedArray.add(SortedLeftArray.get(i));
            i++;
        }
        while(j< SortedRigthArray.size()){
            sortedArray.add(SortedRigthArray.get(j));
            j++;
        }
 return  sortedArray;

    }
}
