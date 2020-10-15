#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[r][c];
  int max_num[c];
  int temp=0,max=0;
  
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
           
      if(a[i][j] > max)
      {
          //temp = max;
          max = a[i][j];
         // a[i][j] = temp;
          
      }
       
     
    }
    cout<<max<<"\n"; 
    max=0;
    
  }
 
}

