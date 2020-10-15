#include<iostream>
using namespace std;
int main()
{
   int by,cy,age=0,temp;
  std::cin>>by>>cy;
  if(cy == 00)
    std::cout<<100-by;
  else if(by<cy)
     std::cout<<cy-by;
   else
     std::cout<<(100-by)+cy;
}