#include<iostream>
#include <bits/stdc++.h>

using namespace std;
int main()
{
  //Type your code here.
  	float pos_odd = 0, num, total_result = 0, i;
  	while(pos_odd != 3) {
      cin >> num;
      if(fmod(num, 2) == 1 && (num > 0)) {
        total_result = total_result + 1;
        pos_odd++;
      }
      else if(fmod(num, 2) == 0 && (num > 0)) {
		total_result = total_result - 0.5;
      }
      else if(num < 0) {
        total_result = total_result - 1;
        break;
      }
    }
  
  	cout << fixed << setprecision(1) << total_result << endl;
  	return 0;
  
  
}