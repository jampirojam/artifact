#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <cstdlib>

using namespace std;

long int faktorial(long int a);

main() {
  long int faktor;
  long int n;

  cout << " Masukan Nilai Faktorial ";
  cin >> n;
  faktor = faktorial(n);
  cout << " " << n << "! = " << faktor << endl;
  getch();
}

long int faktorial(long int a) {
  if (a == 1 || a == 0) {
    return (1);
  } else if (a > 1) {
    return (a * faktorial(a - 1));
  } else {
    getch();
  }
}
