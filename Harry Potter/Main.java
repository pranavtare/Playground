#include<iostream>
using namespace std;
int main()
{
 int a ,i,count=0,sum=0,x;
  cin>>a;
  int lastDigit = a % 10;
   int firstDigit = a;
    
    while(a >= 10)
    {
        a = a / 10;
      count++;
    }
   if(count == 3){
 	firstDigit = a;  
   }else
     firstDigit = 0;
 
   sum = firstDigit + lastDigit; 
  cout<<sum;
}