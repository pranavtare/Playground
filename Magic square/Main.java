#include<iostream>
#include <bits/stdc++.h>

using namespace std;
int main()
{
  //Type your code here.
  int row, sum_front = 0, sum_back = 0, i, arr[100][100], j, flag;
  cin >> row;
  for(i = 0; i < row; i++) {
    for(j = 0; j < row; j++) {
      cin >> arr[i][j];
    }
  }
  i = 0;
  for(j = 0; j < row; j++) {
    sum_front = sum_front + arr[i][j];
    i++;
  }
  
  // sum back
  i = 0;
  for(j = row - 1; j >= 0; j--) {
    sum_back = sum_back + arr[i][j];
  }
  if(sum_front == sum_back) {
    cout << "Yes" << endl;
  }
  else if(sum_front != sum_back) {
	cout << "No" << endl;
  }
  return 0;
  
  
}