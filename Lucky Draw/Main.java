#include<iostream>
int main()
{
 
int num,i,c=0;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    if(num % i == 0)
      c++;
  }
  if(c == 2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
    

 return 0;

}