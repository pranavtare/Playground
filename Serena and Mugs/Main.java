#include<iostream>
using namespace std;
int main()
{
  int a,b,i,sum=0;
  std::cin >>a>>b;
  int A[a];
  for(i=0;i<a;i++)
  {
   std::cin>>A[i];
  }
  for(i=0;i<a;i++)
  {
    sum+=A[i];
  }
  if(sum > b)
    std::cout<<"NO";
  else
    std::cout<<"YES";
  
  
}