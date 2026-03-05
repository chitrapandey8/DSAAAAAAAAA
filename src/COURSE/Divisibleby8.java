package COURSE;

public class Divisibleby8 {
    static void main() {
        String s = "49";
        int n = s.length();
        String nums =  ""+ s.charAt(n-2) + s.charAt(n-1);
        int val = Integer.parseInt(nums);
        if(val%8 == 0){
            System.out.println("yas");
        }else{
            System.out.println("no");
        }
    }
}
