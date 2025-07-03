import java.util.Scanner;

/**
GABUNG PRIMA

Kode untuk menggabungkan kemungkinan bilangan prima yang dapat dibuat antara inputan awal "Bilangan Prima 1" hingga inputan akhir "Bilangan Prima 2".

Contoh Hasil.
Bilangan Prima 1 : 3
Bilangan Prima 2 : 11

Bilangan prima ≥3 dan ≤11 adalah 3, 5, 7, 11.

Sehingga, gabungan yang dapat dibuat adalah 35, 37, 311, 53, 57, 511, 73, 75, 711, 113, 115, 117.
Dari hasil yang didapat, kemudian dieksekusi lagi untuk menentukan gabungan tersebut merupakan bilangan prima.

Hasil yang didapat sebagai berikut 37, 311, 53, 73, 113.
*/

public class GabungPrima {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int x, y, z;
        System.out.print("Masukan Bilangan Prima 1 : ");
        x = masukan.nextInt();
        System.out.print("Masukan Bilangan Prima 2 : ");
        y = masukan.nextInt();
        z = 0;
        for (int i = x; i <= y; i++) {

            int j = 0;
            for (int k = 2; k < i; k++) { // 
                if (i % k == 0) {
                    j = 1;
                    break;
                }
            }
            if (j == 0) {

                for (int a = x; a <= y; a++) {
                    int l = 0;
                    for (int m = 2; m < a; m++) {
                        if (a % m == 0) {
                            l = 1;
                            break;
                        }
                    }
                    if (l == 0) {
                        if (a > 100) {
                            z = i * 1000 + a;
                        } else if (a > 10) {
                            z = i * 100 + a;
                        } else {
                            z = i * 10 + a;
                        }
                        int n = 0;
                        for (int o = 2; o < z; o++) {
                            if (z % o == 0) {
                                n = 1;
                                break;
                            }
                        }
                        if (n == 0) {
                            System.out.println(z);
                        }
                    }
                }
            }
        }
    }
}
