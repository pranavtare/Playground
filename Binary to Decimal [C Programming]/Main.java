#include<stdio.h>
int bin_to_dec(int n)
{
  int decimal=0,rem,i=1;
  while(n!=0)
  {
   rem=n%10;
   decimal=decimal+rem*i;
    n=n/10;
    i=i*2;
  }
 return decimal;

  
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",bin_to_dec(n));
}