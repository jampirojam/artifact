// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 11
        int B = 0, A = 0, L = 0, O = 0, N = 0;
        char c;
        for (int i = 0; i < S.length(); i++){       
            c = S.charAt(i);
            switch(c){
                case 'B' : B++;
                case 'A' : A++;
                case 'L' : L++;
                case 'O' : O++;
                case 'N' : N++;
                default: ;
            }     
        }

        return Math.min(B, Math.min(A, Math.min((L/2), Math.min((O/2), N))));
    }
}
