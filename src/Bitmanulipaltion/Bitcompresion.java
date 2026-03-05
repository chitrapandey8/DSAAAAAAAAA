package Bitmanulipaltion;

public class Bitcompresion {
    static void main() {
        int[] nums = {1,3,5};
        for(int i = 0; i< nums.length-1; i++){
            for (int j = i+1; j< nums.length; j++){
                int val1 = nums[i] & nums[j];
                int val2 = nums[i] | nums[j];
               nums[i] = val1;
               nums[j] = val2;
            }
        }

        int zor = 0;
        for(int  i = 0; i< nums.length; i++){
            zor = zor^nums[i];
        }
        System.out.println(zor);
    }
}
