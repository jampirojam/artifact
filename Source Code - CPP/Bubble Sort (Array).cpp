#include <cstdlib>
#include <iostream>
#include <conio.h>
#include <cstdlib>
#include <stdio.h>

using namespace std;

int main() {
  int a[7];
  int j, k, c, temp;

  cout << "Memasukan nilai pada elemen array : " << endl;
  for (c = 0; c < 7; c++) {
    cout << "A[" << c << "] = ";
    cin >> a[c];
  }

  cout << "\nNilai elemen array sebelum diurutkan : " << endl;
  for (j = 0; j < 6; j++) {
    for (k = 7; k > 0; k--) {
      if (a[k] < a[k - 1]) {
        temp = a[k];
        a[k] = a[k - 1];
        a[k - 1] = temp;
      }
    }
  }
  cout << "\nNilai elemen array setelah diurutkan : " << endl;
  for (c = 0; c < 7; c++) {
    cout << "A[" << c << "] = " << a[c] << endl;
  }
  getch();
}
