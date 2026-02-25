package Binarysearch;

public class HARDDDDDDDDDDDDD {
    static int medianoftwosortedarray(int[] nums1, int[] nums2) {


        if(nums1.length > nums2.length){
            medianoftwosortedarray(nums2, nums1);
        }
        int n = nums1.length; //isko chota manke chlre hai, sare movement chore array pe lagege
        int m = nums2.length;

        int start = 0;
        int end = n;

        while(start <= end){

            int cut1 = (start + end)/2;
            int cut2 = (m+n+1)/2 - cut1;

            int maxleft1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1-1];
            int minright1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];
            int maxleft2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2-1];
            int minright2 = (cut2 == m) ? Integer.MAX_VALUE : nums2[cut2];



            if(maxleft1 <= minright2 && maxleft2 <= minright1){

                if((m+n)%2 == 0){
                    return Math.max(maxleft1,maxleft2) + Math.min(minright1,minright2)/2;
                }else{
                    return  Math.max(maxleft1,maxleft2);
                }
            }else if(maxleft1 > minright2){
                end = cut1 -1;
            }else{
                start = cut1 + 1;
            }

        }
        throw  new IllegalArgumentException();
    }



    static void main() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        int ans = medianoftwosortedarray(nums1,nums2);
        System.out.println(ans);
    }
}
