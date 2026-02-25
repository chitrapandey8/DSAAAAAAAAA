//package TWoDarray;
//
//import javax.imageio.ImageTranscoder;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class main {
//    static void main() {
////        int[][] arr = new int[3][3];
//        Scanner in= new Scanner(System.in);
//
////        for(int i = 0; i<arr.length; i++){ //row ki length arr.length
////            for(int j = 0; j<arr[i].length; j++){ //column ki length arr[i].lenfght
////                arr[i][j] = in.nextInt();
////            }
////        }
////
////        for(int i = 0; i< arr.length; i++){
////            for(int j = 0; j<arr[i].length; j++){
////                System.out.print(arr[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//        //direct input
////        int[][] mat = {{1,2,3},{1,2,3},{1,2,3}};
////        for(int i = 0; i<mat.length; i++){
////            for(int j = 0; j<mat[i].length; j++){
////                System.out.print(mat[i][j] + " ");
////            }
////            System.out.println();
////        }
//        /// dynamic twod array
//
////        ArrayList<Integer> arrr = new ArrayList<>(Arrays.asList(1,2,3));
//
////        List<List<Integer>> mat = Arrays.asList(
////                Arrays.asList(1,2,3),
////                Arrays.asList(1,2,3)
////        );
////
////        if(mat == null && mat.isEmpty()){
////            return;
////        }
////
////        for(int i = 0; i<mat.size(); i++){
////            for(int j = 0; j<mat.get(i).size(); j++){
////                System.out.print(mat.get(i).get(j) + " ");
////            }
////            System.out.println();
////        }
//
//        //dynamic twod array
////        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
////
////        System.out.println("enter the rows");
////        int rows = in.nextInt();
////
////
////        for(int i = 0; i<rows; i++){
////            System.out.println("enter the column");
////            int cols = in.nextInt();
////            ArrayList<Integer> col = new ArrayList<>();
////            for(int j = 0; j<cols; j++){
////                int value = in.nextInt();
////                col.add(value);
////            }
////            mat.add(col);
////        }
////
////        for(int i = 0; i< mat.size(); i++){
////            for(int j = 0; j< mat.get(i).size(); j++ ){
////                System.out.print(mat.get(i).get(j) + " ");
////            }
////            System.out.println();
////        }
//
//
//
////
//
//
////        for(int i = 0; i< mat[0].length; i++){
////            for(int j = 0; j<mat.length; j++){
////                System.out.print(mat[j][i] + " ");
////            }
////            System.out.println();
////        }
//
//        //col piche se
////        for(int i = mat[0].length-1; i>=0; i--){
////            for(int j = 0; j<mat.length; j++){
////                System.out.print(mat[j][i] + " ");
////            }
////            System.out.println();
////        }
////        for(int i = mat.length-1; i>=0; i--){
////            for(int j = 0; j<mat[0].length; j++){
////                System.out.print(mat[i][j] + " ");
////            }
////            System.out.println();
////        }
//
//        //diagonal printing
//
////        for(int i = 0; i< mat.length; i++){
////            System.out.println(mat[i][i]);
////        }
//        //anti diagnoal
////        length = 3
////        i + j = length -1
////        j= n-i-1
////
////        for(int i = 0; i<mat.length; i++){
////            System.out.println(mat[i][mat.length-i-1]);
////        }
//        //asssignment col wise
//        //toatal sum diagonal or antidional ka sum
//
////        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
////        for(int i = 0; i<mat[0].length; i++){
////            int sum = 0;
////            for(int j =0; j<mat.length; j++){
////                sum += mat[j][i];
////            }
////            System.out.println(sum);
////        }
//
//
////        int sum = 0;
////        for(int i = 0; i<mat.length; i++){
////            sum += mat[i][i];
////            sum += mat[i][mat.length-i-1];
////        }
////        if(mat.length%2 == 1){
////            sum -= mat[mat.length/2][mat.length/2];
////        }
////        System.out.println(sum);
//
//        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//        int target  = 9;
//
//        /// //////////////////////LINEAR SEARCH//////////////////////////////////
////        for(int i = 0; i<mat.length; i++){
////            for (int j = 0; j<mat[0].length; j++){
////                if(mat[i][j] == value){
////                    System.out.println("true");
////                }
////            }
////        }
//
//         ////////////////////////////BINARY SEARCH/////////////////////////
//       //har roe sorted ho
//
////        for(int i = 0; i< mat.length; i++){
////            if(mat[i][0] >= target && target  <= mat[i][cols-1]){
////                int start = 0;
////                int end = cols - 1;
////                while(start<=end){
////                    int mid  = start + (end-start)/2;
////                    if(mat[i][mid] == target){
////                        System.out.println("true");
////                    }else if(mat[i][mid] > target){
////                        end = mid -1;
////
////                    }else{
////                        start = mid+1;
////                    }
////                }
////            }
////
////
////        }
//        int roww = mat.length;
//        int colss = mat[0].length;
//        int start = 0;
//         int end = roww*colss-1;
//
//         throw new IllegalArgumentException();
//         while(start <= end){
//             int mid = start+(end-start)/2;
//             int cols  = mid/colss;
//             int rows = mid%cols;
//             if(mat[rows][cols] == target){
//                 System.out.println("true");
//             } else if (mat[rows][cols] > target) {
//                 end = mid-1;
//
//             }else{
//                 start = mid+1;
//             }
//
//         }
//
//
//
//    }
//}
//
//
