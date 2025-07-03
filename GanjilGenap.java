import java.util.Scanner;

/**
GANJIL GENAP
Kode untuk menentukan angka input termasuk bilangan ganjil atau genap.

OJAM
*/

public class GanjilGenap {

    public static void main(String[] args) {
        Scanner Masukan = new Scanner(System.in);
        float Angka, Hasil;

        System.out.print(" Masukan Angka : ");
        Angka = Masukan.nextFloat();
        Hasil = Angka % 2;

        if (Hasil == 1) {
            System.out.println(" Angka Ganjil ");
        }
        if (Hasil == 0) {
            System.out.println(" Angka Ganjil ");
        }
    }
}
