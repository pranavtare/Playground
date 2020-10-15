#include<iostream>
using namespace std;
int main()
{
   int num,i,c=0;
  std :: cin >> num;
   int x=num;
  while(num > 0)
  {
    i = num%10;
    c+=i;
    num = num / 10; 
  }
  //std::cout<<c;
  if(x % c == 0)
  {
    std :: cout <<"Harshad Number";
  }else
  {
     std :: cout <<"Not Harshad Number";
  }
    
}