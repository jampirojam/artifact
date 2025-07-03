#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <cstdlib>

using namespace std;

int tambah(int e, int o, int f) {
  if (f == 0) {
    return 0;
  }
  if (f == 1) {
    return (e * o);
  } else
    return ((e * o) + tambah(e, o, (f - 1)));
}

int main() {
  int x, y, z;
  ulang:
    cout << "Angka 1 : ";
  cin >> x;
  cout << "Angka 2 : ";
  cin >> y;
  cout << "Angka 3 : ";
  cin >> z;

  cout << "Hasil Perkalian 3 angka tersebut: ";
  cout << tambah(x, y, z);
  cout << endl;

  goto ulang;

  getch();

}
