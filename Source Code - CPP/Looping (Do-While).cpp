#include <cstdlib>
#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;

main() {
  int i = 2;
  do {
    cout << i << " ";
    i += 2;
  }
  while (i <= 30);
  getch();
}
