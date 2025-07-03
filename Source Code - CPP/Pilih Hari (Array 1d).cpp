#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <cstdlib>
#include <iomanip>

using namespace std;

int main() {

  string hari[7] = {
    "Senin",
    "Selasa",
    "Rabu",
    "Kamis",
    "jumat",
    "Sabtu",
    "Minggu"
  };
  int pil;
  for (int i = 0; i < 7; i++) {
    cout << i + 1 << " : " << hari[1] << endl;
  }
  cout << "Pilih No.Berapa ? ";
  cin >> pil;
  switch (pil) {
  case 1:
    cout << hari[0];
    break;
  case 2:
    cout << hari[1];
    break;
  case 3:
    cout << hari[2];
    break;
  case 4:
    cout << hari[3];
    break;
  case 5:
    cout << hari[4];
    break;
  case 6:
    cout << hari[5];
    break;
  case 7:
    cout << hari[6];
    break;
  }
}

	
