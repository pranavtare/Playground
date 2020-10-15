#include<iostream>
using namespace std;
int main()
{
   int i,j,r,c,r_sum=0;
  std::cin>>r>>c;
  int A[r][c];
  int sum[r];
  int sum_c[c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>A[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
      r_sum+=A[i][j];
    }
    sum[i] = r_sum;
    r_sum=0;
  }
  
  for (i=0;i<r;i++)
  {
   std::cout<<sum[i]<<"\n";
  }
   
}