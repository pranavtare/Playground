#include<iostream>
using namespace std;
int main()
{
  int n,i,a=1;
  cin>>n;
  while(n!=0)
  {
     if(a%2 != 0)
       cout<<(a*a)-1<<" ";
    else
      cout<<(a*a)-2<<" ";
    a++;
    n--;
  
  }
}