// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 11
        int[] count = new int[5];
        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == 'B'){
                count[0]++;
            } else if (S.charAt(i) == 'A'){
                count[1]++;
            } else if (S.charAt(i) == 'L'){
                count[2]++;
            } else if (S.charAt(i) == 'O'){
                count[3]++;
            } else if (S.charAt(i) == 'N'){
                count[4]++;
            }
        }

        count[2] /= 2;
        count[3] /= 2;

        int result = count[0];
        for(int i = 1; i < 5; i++){
            result = Math.min(result, count[i]);
        }

        return result;
    }
}
