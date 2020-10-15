#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
	string str,rev; 
cin>>str>>rev;
	 
	reverse(str.begin(), str.end());
 
    if(str!=rev)
      cout<<"It is wrong";
  else
    cout<<"It is correct";
	return 0; 
} 
