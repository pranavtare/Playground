#include<iostream>
int main()
{
int n,i=1,a=6;
  std::cin>>n;
  while(n!=0)
  {
    std::cout<<a<<" ";
    a+=i*5;  
    i++;
    n--;
  }

 return 0;

}