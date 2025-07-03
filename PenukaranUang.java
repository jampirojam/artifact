import java.util.Scanner;

/**
PENUKARAN UANG

Kode penukaran uang yang di-input menjadi pecahan lebih kecil.
*/

public class PenukaranUang {

    int Uang, Akhir = 0, A = 100000, B = 50000, C = 20000, D = 10000, E = 5000, F = 2000, G = 1000, H = 500, I = 200, J = 100;

    public void Awal() {
        Scanner Masukan = new Scanner(System.in);
        System.out.print(" Masukan Uang Penukaran : Rp. ");
        Uang = Masukan.nextInt();
        Proses();
    }

    public void Proses() {
        if (Uang >= A) { //100000
            Akhir = Uang / A;
            System.out.println(" " + Akhir + " " + A);
            Uang = Uang - (A * Akhir);
        }
        if (Uang >= B) { //50000
            Akhir = Uang / B;
            System.out.println(" " + Akhir + " " + B);
            Uang = Uang - (B * Akhir);
        }
        if (Uang >= C) { //20000
            Akhir = Uang / C;
            System.out.println(" " + Akhir + " " + C);
            Uang = Uang - (C * Akhir);
        }
        if (Uang >= D) { //10000
            Akhir = Uang / D;
            System.out.println(" " + Akhir + " " + D);
            Uang = Uang - (D * Akhir);
        }
        if (Uang >= E) { //5000
            Akhir = Uang / E;
            System.out.println(" " + Akhir + " " + E);
            Uang = Uang - (E * Akhir);
        }
        if (Uang >= F) { //2000
            Akhir = Uang / F;
            System.out.println(" " + Akhir + " " + F);
            Uang = Uang - (F * Akhir);
        }
        if (Uang >= G) { //1000
            Akhir = Uang / G;
            System.out.println(" " + Akhir + " " + G);
            Uang = Uang - (G * Akhir);
        }
        if (Uang >= H) { //500
            Akhir = Uang / H;
            System.out.println(" " + Akhir + " " + H);
            Uang = Uang - (H * Akhir);
        }
        if (Uang >= I) { //200
            Akhir = Uang / I;
            System.out.println(" " + Akhir + " " + I);
            Uang = Uang - (I * Akhir);
        }
        if (Uang >= J) { //100
            Akhir = Uang / J;
            System.out.println(" " + Akhir + " " + J);
            Uang = Uang - (J * Akhir);
        }
        System.out.println(" Yang Tidak Bisa Di Tukar : Rp. " + Uang);
    }
    public static void main(String[] args) {
        PenukaranUang Tampil = new PenukaranUang();
        Tampil.Awal();
    }
}
