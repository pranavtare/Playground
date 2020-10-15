#include<iostream>
int main()
{
int n,i,sum=0,sum2=0;
  std::cin>>n;
  while(n>0)
  {
    i=n%10;
    sum+=i;
   n=n/10;
  }
  
  while(sum>0)
  {
    i=sum%10;
    sum2+=i;
   sum=sum/10;
  }
std::cout<<sum2;
 return 0;

}