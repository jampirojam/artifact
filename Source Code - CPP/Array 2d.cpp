#include <conio.h>
#include <stdio.h>
#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

int main() {
  int a, b, jual[4][4];

  system("cls");

  for (a = 1; a <= 3; a++) { //nomor
    for (b = 1; b <= 3; b++) { //tahun
      cout << " Data Ke-" << a << " " << b << endl;
      cout << " Jumlah Penjualan : ";
      cin >> jual[a][b];
    }
  }
  cout << " Data Penjalan Pertahun\n";
  cout << "-----------------------\n";
  cout << " No    2001  2002  2003\n";
  cout << "-----------------------\n";

  for (a = 1; a <= 3; a++) {
    cout << " " << setiosflags(ios::left) << setw(5) << a;
    for (b = 1; b <= 3; b++) {
      cout << " " << setiosflags(ios::left) << setw(4);
      cout << jual[a][b];
      cout << " ";
    }
    cout << endl;
  }
  cout << "-----------------------\n";
  getch();
}

	
