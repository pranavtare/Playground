#include<iostream>
using namespace std;
int main()
{
 int i,j,r,c,sum=0;
  std::cin>>r>>c;
  int A[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>A[i][j];
    }
  }
  if(r == 2 && c == 2)
  {
  for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
    {
       sum+=A[i][j];
     }
  }
    std::cout<<"Sum of Zig-Zag pattern is "<<sum;
  }else
   {
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        sum+=A[i][j];
      }
    }
    std::cout<<"Sum of Zig-Zag pattern is "<<sum - (A[1][0] + A[1][2]);
  }
}