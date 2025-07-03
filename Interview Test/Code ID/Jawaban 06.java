public class Main {
  public static void main(String[] args) {
	int x = 30000, y = 100000, total = 0;
    while (x < y) {
    	x = x + (x*3/100);
        x++;
        total += 1;
    	System.out.format("Tahun ke-%d: jumlah penduduk: %d%n", total, x);

    }
    System.out.format("%n%nUntuk mencapai penduduk 100000, dibutuhkan waktu %d tahun jika pertumbuhan pertahunnya 3 persen.", total);
  }
}
