import java.util.Scanner;

/**
DERET PRIMA

Kode untuk mendapatkan deret bilangan prima dari yang terkecil hingga bilangan maksimal dari inputan.

Misal nilai input 20, maka deret bilangan prima yang didapatkan adalah: 2, 3, 5, 7, 11, 13, 17, 19
*/

public class DeretPrima {

    public static void main(String[] args) {
        Scanner Masukan = new Scanner(System.in);
        int Masuk, k;
        System.out.print(" Angka Maksimal : ");
        Masuk = Masukan.nextInt();

        System.out.print(" Hasil          : ");

        for (int i = 1; i <= Masuk; i++) {
            k = 0;
            for (int j = 2; j <= i; j++) {

                if (i % j == 0) {
                    if (i != j) {
                        k = 1;
                    }
                    if (k != 1 && i == j) {
                        System.out.print(i + ", ");
                    }
                }
            }
        }
    }
}
