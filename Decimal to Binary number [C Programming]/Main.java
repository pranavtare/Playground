#include<stdio.h>
int dec_to_bin(int n)
{
   int binary=0,rem,i=1;
  while(n!=0)
  {
    rem=n%2;
    binary =binary+rem*i;
    n=n/2;
    i=i*10;
  }
  return binary;
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
