package Leetcode;

public class greaterthanchar {
    static char brute(char[] letters, char target) {
        int n = letters.length;

        for (int i = 0; i < n; i++) {
            if(letters[i] > target){
                return letters[i];
            }

        }
        return letters[0];

    }


    static void main() {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(brute(letters,target));
    }
}
