package TWoDarray;

import java.util.Arrays;

public class Anticlockwise {

    static void main() {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};

        for(int i  = 0; i<matrix.length; i++){
            for(int j= i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<matrix.length; i++){
            int start = 0;
            int end  = matrix.length -1;
            while (start < end){
                int temp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = temp;
                start++;
                end--;
            }
        }

        for(int i = 0; i<matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }




    }
}
