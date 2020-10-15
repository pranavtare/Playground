#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a;
  string b;
  int x;
 cin>>a>>b;
 
  if(a.compare(b)!=0)
     cout<<"It is wrong";
  else
    cout<<"It is correct";
}