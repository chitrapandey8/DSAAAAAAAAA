package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagram {
    static void brute(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();

        for (String x : strs){
            String s  = x;
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String t = new String(c);

            hm.putIfAbsent(t,new ArrayList<>());
            hm.get(t).add(s);

        }


    }

    static void hashmmap(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String x: strs){
            String s = x;


            int[] freq = new int[26];

            for (int i = 0; i< s.length(); i++){
                freq[s.charAt(i) - 'a']++;
            }

            String t = Arrays.toString(freq);


            hm.putIfAbsent(t,new ArrayList<>());
            hm.get(t).add(s);

        }
        System.out.println(hm);

    }
    static void main() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        brute(strs);
        hashmmap(strs);
    }
}
