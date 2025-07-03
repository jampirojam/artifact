public class Main {
  public static void main(String[] args) {
	int x = 30, y = 3;
    do {
    	y *= 2;
        x++;
    	System.out.format("%d < %d => x: %d y: %d%n", y, x , x, y);
    } while (y < x);
  }
}
/*
OUTPUT
6 < 31 => x: 31 y: 6
12 < 32 => x: 32 y: 12
24 < 33 => x: 33 y: 24
48 < 34 => x: 34 y: 48
*/
