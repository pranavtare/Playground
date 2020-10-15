#include <iostream>
#include <string.h>
int main()
{
char str[100], rev[100];     
int count = 0, end, i; 
std::cin.getline(str,100);
  end = strlen(str);
 
  for(i=end-1;i>=0;i--)
 {
   std::cout<<str[i];
 }
std::cout<<rev;
   
}