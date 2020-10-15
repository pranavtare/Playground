#include<stdio.h>
int dec_to_oct(int n)
{
    int rev, rem, pow = 1;
    while(n!=0){
      rem = n % 8;
      rev += rem*pow;
      n /= 8;
      pow *= 10;
    
    }
  return rev;

}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_oct(n));
}
