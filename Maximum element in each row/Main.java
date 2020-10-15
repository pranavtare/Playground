#include<iostream>
using namespace std;
int main()
{
   int i,j,r,c,max,cmax;
  std::cin>>r>>c;
  int A[r][c];
  
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>A[i][j];
    }
  }
  max=A[0][0];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
      if(A[i][j] >= max)
      {
       max = A[i][j];
      }
      
    }
    std :: cout <<max<<"\n";
    max=0;
  }
   
}