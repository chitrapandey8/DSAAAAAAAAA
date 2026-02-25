package TWoDarray;

public class serchingintwodmatrrix {
    static boolean linear(int[][] arr, int value) {
        for (int i = 0; i<arr.length; i++){
            for(int j = 0; i<arr[0].length; i++){
                if(arr[i][j] == value){
                   return true;
                }
            }
        }
        return  false;
    }


    ///////////////////Eachrowsorted///////////////////////////
    static boolean Eachroesorted(int[][] arr, int value) {
         for(int i = 0; i<arr.length; i++){
             if(value >= arr[i][0] && value <= arr[i][arr[0].length-1]){
                 int start = 0;
                 int end = arr[0].length;
                 while(start<=end){
                     int mid = start + (end -start)/2;
                     if(arr[i][mid] == value){
                         return  true;
                     }else if(arr[i][mid] > value){
                         end = mid -1;
                     }else{
                         start = mid + 1;

                     }
                 }
             }

         }
        return  false;
    }

    static void main() {
        // /LINEAR SEARCH-------
//        int[][] arr = {{1,3,4},{3,4,6},{7,5,8}};
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int value  = 8;
        System.out.println(linear(arr,value));

    }
}
