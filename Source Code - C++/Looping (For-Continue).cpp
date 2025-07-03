#include <cstdlib>
#include <stdio.h>
#include <conio.h>
#include<iostream>

using namespace std;

main() {
  int a;
  for (a = 1; a <= 10; ++a) {
    if (a == 6 || a == 8)
      continue;
    cout << a << " ";
  }
  getch();
}
