package slidingwindow;

import java.util.HashMap;

public class reapeating424 {
    static int brute(String s, int k) {
          int n = s.length();
          int maxlen = 0;     //sabse pehele har possible pair of string banega phir har ek string ke characters ka count rakha jayega hashmap mai phir ye check karege ki jo length h or jo abhi charcher ki max freq h agare us differance k ke barabar ya chota aata hai toh len ko maxlen mai daal denge ese har string ke liye dekhege.
          for(int i = 0; i<n; i++){
              HashMap<Character,Integer> hm = new HashMap<>();
              int maxfreq = 0;
              for(int j = i; j<n; j++){
                  hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
                  maxfreq = Math.max(maxfreq,hm.get(s.charAt(j)));
                  if((j-i+1)-maxfreq <=k){
                      maxlen = Math.max(maxlen,j-i+1);
                  }
              }
              return maxlen;
          }
        return -1;

    }


    static void better(String s, int k) {

    }


    static void main() {
        String s  = "AABABBA" ; //""ABAB";
        int k = 1;  //2;
        int ans = brute(s,k);
        System.out.println(ans);
    }
}
