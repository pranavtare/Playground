#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
int x, y, z;
float i, a, d, f;
cin >> x >> y >> z;
i = (x* y* z) / 100;
a = x + i;
d= (i*2)/ 100;
f = a - d;

cout << i << "\n" << a << "\n" << d << "\n" << f << endl;
return 0;
}