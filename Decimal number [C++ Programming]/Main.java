#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    int octal=0,rem,i=1;
  while(n!=0)
  {
    rem=n%8;
    octal=octal+rem*i;
    n=n/8;
    i=i*10;
  }
  return octal;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
