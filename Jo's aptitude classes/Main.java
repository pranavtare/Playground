#include<iostream>
int main()
{
 int a,b,c,gcd,small=0,result;
  std :: cin>>a>>b>>c>>gcd;
  if(a<=b && a<=c )
  {
   small = a;
  }else if(b<=a && b<=c)
  {
   small = b;
  }else
    small = c;
  while(small >= 1)
  {
   if(a%small == 0 && b%small == 0 && c%small == 0)
   {
     result = small;
     break;
   }
   small--;
  }
  
  if(gcd == result)
  {
   std :: cout<<"Answer is correct.";
  }else
    std :: cout<<"Answer is wrong.";


  

}