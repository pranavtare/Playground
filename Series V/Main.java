#include<iostream>
using namespace std;
int main()
{
 int n,i,a=11;
  cin>>n;
  while(n!=0)
  {
    std::cout<<(a*a)<<" ";
    a+=4;
    n--;
  }
}