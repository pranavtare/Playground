#include<iostream>
using namespace std;
int main()
{
   int a,e=0,o=0,number;
  std::cin>>a;
  while(a!=0)
  {
    std::cin>>number;
    if(number % 2 == 0)
      e+=number;
    else
      o+=number;
    a--;
  }
  std::cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<o;
}