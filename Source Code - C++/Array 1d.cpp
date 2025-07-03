#include <conio.h>
#include <stdio.h>
#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
  int nilai[5] = {
    56,
    67,
    99,
    72,
    67
  };
  int a;

  for (a = 0; a < 5; a++) {
    cout << " Nilai Array Index Ke-" << a << " = ";
    cout << nilai[a] << endl;
  }
  getch();
}

	
