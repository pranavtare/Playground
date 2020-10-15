#include<iostream>
using namespace std;
int main()
{
   int n,esum=0,osum=0,i;
  std :: cin>>n;
  while(n > 0)
  {
   i=n%10;
    if(i%2 == 0)
    {
      esum+=i;
    }else{
      osum+=i; 
    }
    n=n/10;
  }
  if(esum == osum)
  {
    std::cout<<"Yes";
  }else{
    std::cout<<"No";
  }
}