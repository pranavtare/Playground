#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	int num, check;
  	cin >> num;
  	check = num % 2;
  	(check == 0) ? cout << "Possible" << endl : cout << "Not possible" << endl;
  	return 0;
  
}