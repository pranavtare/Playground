#include<iostream>
int main()
{
     int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c];
  int b[r][c];
  int add[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
     std::cin>>a[i][j];
    }
  }
  
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
     std::cin>>b[i][j];
    }
  }
  
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      add[i][j] = a[i][j] + b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
     std::cout<<add[i][j]<<" ";
    }
    std::cout<<"\n";
  }
  
}