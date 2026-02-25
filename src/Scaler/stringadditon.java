package Scaler;

public class stringadditon {
    static void main() {
        String s1 = "100";
        String s2  = "11";
//        int i = s1.length()-1;
//        int j = s2.length()-1;
//        StringBuilder S = new StringBuilder();
//        while(i>=0 && j>=0){
//            char c1 = s1.charAt(i);
//            char c2 = s2.charAt(j);
//            int a = c1 - '0';
//            int b = c2 - '0';
//            int c = a+b;
//            S.append(c);
//            i--;j--;
//
//
//        }
//
//
//        while(i>=0){
//            S.append(s1.charAt(i));
//            i--;
//        }
//        while(j>=0){
//            S.append(s1.charAt(j));
//            j--;
//        }
//        S.reverse();
//        System.out.println(S);

        int i = s1.length() -1;
        int j = s2.length()-1;
        int carry = 0;
        String ans = "";
        while(i >= 0 && j>=0){
            int a  = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int b = Integer.parseInt(String.valueOf(s2.charAt(j)));
            int total = a + b + carry;
            if(total == 2){
                carry = 1;
            } else if(total > 2){
                carry = 1;
                ans = "1" + ans;
            } else if(total == 0){
                carry = 0;
                ans = "0" + ans;
            } else{
                carry = 0;
                ans = "1" + ans;
            }
            i--;
            j--;
        }

        while(i>0){
            int a  = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int total = a  + carry;
            if(total == 2){
                carry = 1;
            } else if(total > 2){
                carry = 1;
                ans = "1" + ans;
            } else if(total == 0){
                carry = 0;
                ans = "0" + ans;
            } else{
                carry = 0;
                ans = "1" + ans;
            }
            i--;
        }
        while(j>=0){
            int b  = Integer.parseInt(String.valueOf(s2.charAt(i)));
            int total = b  + carry;
            if(total == 2){
                carry = 1;
            } else if(total > 2){
                carry = 1;
                ans = "1" + ans;
            } else if(total == 0){
                carry = 0;
                ans = "0" + ans;
            } else{
                carry = 0;
                ans = "1" + ans;
            }
            j--;
        }
        if(carry == i){
            ans = "1" + ans;
        }
        System.out.println(ans);

    }
}
