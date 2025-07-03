// you can also use imports, for example:
// import java.util.*;
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
  public int solution(int[] A) {
    // write your code in Java SE 8
    Set<Integer> set=new TreeSet<>();
        for (int x:A) {
            if (x>0) {
                set.add(x);
            }
        }

        int y=1;
        Iterator<Integer> it=set.iterator();
        while (it.hasNext()) {
            int curr=it.next();
            if (curr!=y) {
                return y;
            }
            y++;
        }
        return y;
  }
}
