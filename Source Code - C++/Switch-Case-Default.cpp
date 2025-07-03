#include <cstdlib>
#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;

main() {
  char Kode;

  cout << " Masukan Kode Barang [A..D] : ";
  cin >> Kode;
  switch (Kode) {
  case 'a':
  case 'A':
    cout << " Kode " << Kode << " Adalah Kode Untuk Barang Elektronik ";
    break;
  case 'b':
  case 'B':
    cout << " Kode " << Kode << " Adalah Kode Untuk Barang Kosmetik ";
    break;
  case 'c':
  case 'C':
    cout << " Kode " << Kode << " Adalah Untuk Barang Alat Tulis Kantor ";
    break;
  case 'd':
  case 'D':
    cout << " Kode " << Kode << " Adalah Untuk Barang Alat-Alat Dapur ";
    break;
  default:
    cout << " Kode " << Kode << " Tidak Ada Dalam Daftar ";
    break;
  }
  getch();

}
