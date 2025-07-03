#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <cstdlib>

using namespace std;

float LS(float A, float T) {
  float luas;

  luas = A * T / 2;
  return (luas);
}

int main() {
  float alas, tinggi, luas;

  cout << " Masukan alas segitiga   : ";
  cin >> alas;
  cout << " Masukan tinggi segitiga : ";
  cin >> tinggi;

  luas = LS(alas, tinggi);

  cout << " Luas segitiga   : " << alas << " x " << tinggi << " / " << " 2 " << " = " << luas << endl;

  getch();
}
