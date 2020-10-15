#include<iostream>
using namespace std;
int main()
{
   int r,l,re;
  std::cin>>r>>l;
  if(r == l/2)
    std::cout<<"circle can be inside a square";
  else
    std::cout<<"circle cannot be inside a square";
}