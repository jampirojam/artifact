public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 6; i++) {
    	for (int j = 0; j < i; j++) {
       	System.out.format(" %d ", i+j);
      }
      System.out.println(" ");
    }
  }
}
