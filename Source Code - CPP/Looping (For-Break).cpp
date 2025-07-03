#include <cstdlib>
#include <stdio.h>
#include <conio.h>
#include<iostream>

using namespace std;

main() {
  int a = 3, b = 2, c = 1, d;
  cout << " Bilangan A | Bilangan B | Bilangan C" << endl;
  cout << " ===========================================" << endl;
  for (d = 1; d <= 10; ++d) {
    a += b;
    b += c;
    c += 2;
    cout << " " << a << "  | " << b << "  | " << c << endl;
    if (c == 13)
      break;
  }
  getch();
}
