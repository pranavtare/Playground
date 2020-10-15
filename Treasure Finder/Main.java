#include <iostream>
int main()
{
    int a,b,c,hcf,st,max=0,i;
    std::cin>>a>>b>>c;
    int pro =a*b*c;
  if(a >= b && a >= c)
    {
        if(b >= c)
        {
            
            max = b;
        }
        else
        {
          max=c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            max=a;
        }
        else
        {
            max=c;
        }
    }
 
    else if(a >= b)
    {
        max=a;
    }
    else
    {
        max=b;
    }
for(i=2;i<=pro;i++)
 {
  if(a%i==0 && b%i==0 && c%i==0)
  {
   hcf=i;
   break;
  }
 } if(hcf == 0)
 hcf = 1;         
    std::cout<<"The treasure is in box which has number "<<max<<"\n";
    std::cout<<"The code to open the box is "<<hcf;
    return 0;
}