public class Main {
  public static void main(String[] args) {
    int n = 5;
    System.out.format("Soal 4.A %n");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.format("%d\t", i);
      }
      System.out.println(" ");
    }
    System.out.format("%n%nSoal 4.B %n");
    for (int i = 1; i <= n; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.format("%d\t", j);
      }
      System.out.println(" ");
    }
    System.out.format("%n%nSoal 4.C %n");
    int k = 1;
    int batas = 3;
    int p = batas;
    int q = batas;
    for (int i = 1; i <= n; i++) {
      if (i <= batas) {
        for (int j = 1; j <= i; j++) {
          if (k >= n) {
            System.out.format("%d\t", k);
            k--;
          } else {
            System.out.format("%d\t", k);;
            k++;
          }
        }
      } else if (i > batas && i != n) {
        for (int l = batas; l >= 0; l--) {
          System.out.format("%d\t", p);;
          p--;
          while (p < 1) {
            p = p + 2;
          }
        }
      } else if (i == n) {
        for (int m = batas; m <= i; m++) {
          System.out.format("%d\t", m);;
        }
        for (int o = n - 1; o >= batas; o--) {
          System.out.format("%d\t", o);;
        }
      }
      System.out.println();
    }
    System.out.format("%n%nSoal 4.D %n");
    int count = 1;
    int[][] array = new int[n][n];
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < n; j++) {
          array[i][j] = count;
          count++;
        }
      } else {
        for (int j = n - 1; j >= 0; j--) {
          array[i][j] = count;
          count++;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.format("%d\t", array[i][j]);
      }
      System.out.println();
    }
  }
}
