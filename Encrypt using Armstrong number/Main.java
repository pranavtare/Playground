#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int num)
{
  int temp,p,result=0,m,n=0;
  temp = num;
  while (temp != 0) {
        temp /= 10;
        ++n;
    }
    temp = num;
     while (temp != 0) {
        m = temp % 10;
        p =  power(m,n);
        result += p;
        temp /= 10;
    }

    if (result == num)
        return true;
    else
     return false;
  }
    
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}