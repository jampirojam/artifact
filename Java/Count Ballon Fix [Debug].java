/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
  // you can also use imports, for example:
  // import java.util.*;

  // you can write to stdout for debugging purposes, e.g.
  // System.out.println("this is a debug message");

  public int solution(String S) {
    // write your code in Java SE 11
    int[] count = new int[5];
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'B') {
        count[0]++;
      } else if (S.charAt(i) == 'A') {
        count[1]++;
      } else if (S.charAt(i) == 'L') {
        count[2]++;
      } else if (S.charAt(i) == 'O') {
        count[3]++;
      } else if (S.charAt(i) == 'N') {
        count[4]++;
      }
    }

    count[2] /= 2;
    count[3] /= 2;
    for (int i = 0; i < 5; i++) {
      System.out.println("Total indeks ke-" + i + " " + count[i]);
      System.out.println("------");
    }

    int result = count[0];
    for (int i = 1; i < 5; i++) {
      System.out.println("Nilai Awal: " + result + ", Nilai Akhir: " + count[i]);
      result = Math.min(result, count[i]);
      System.out.println("Nilai Terkecil: " + result);
      System.out.println("------");
    }

    return result;
  }

  public static void main(String[] args) {
    Main sol = new Main();
    System.out.println("Hasil: " + sol.solution("BALLONOBAAAAAALLLLLLLLOOOOONNNNNNNNN"));
  }
}
