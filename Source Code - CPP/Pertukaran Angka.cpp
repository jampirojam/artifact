#include <iostream>
#include <conio.h>
#include <cstdlib>
#include <stdio.h>

using namespace std;

void TukarBilangan(int X, int Y) {
  int Z = Y;
  X = Y;
  Y = Z;

  cout << " Didalam fungsi : " << endl;
  cout << " Bilangan ke-1  : " << X << endl;
  cout << " Bilangan ke-2  : " << Y << endl;
  cout << endl;
}

int main() {
  int Bilangan1, Bilangan2;

  cout << " Masukan bilangan pertama : ";
  cin >> Bilangan1;
  cout << " Masukan bilangan kedua   : ";
  cin >> Bilangan2;

  cout << " Keadaan awal" << endl;
  cout << " Bilangan ke-1 : " << Bilangan1 << endl;
  cout << " Bilangan ke-2 : " << Bilangan2 << endl;
  cout << endl;

  TukarBilangan(Bilangan1, Bilangan2);

  cout << " Keadaan akhir" << endl;
  cout << " Bilangan ke-1 : " << Bilangan1 << endl;
  cout << " bilangan ke-2 : " << Bilangan2 << endl;
  cout << endl;

  getch();
}
