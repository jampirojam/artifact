#include <cstdlib>
#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;

main() {
  int i = 2;
  do {
    if (i >= 100)
      break;
    cout << i << " ";
  }
  while (++i);
  getch();
}
