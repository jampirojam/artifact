#include <cstdlib>
#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;

main() {
  int a, b;
  for (a = 1; a <= 10; a++) {
    for (b = a; b <= 10; b++) {
      cout << a << " ";
    }
    cout << endl;
  }
  getch();

}
