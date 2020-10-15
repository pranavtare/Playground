#include<iostream>
using namespace std;
 int main()
{
 
  int r,c,i,j;
 
  cin>>r>>c;
  int n =2*(r*c);
   int a[n/2],b[n/2],re[n/2];
  for(i=0;i<n/2;i++)
  {
  	cin>>a[i];
  }
  for(i=0;i<n/2;i++)
  {
  	cin>>b[i];
  }
  for(i=0;i<n/2;i++)
  {
  	re[i]=a[i]+b[i];
  }
  
  for(i=0;i<n/2;i++)
  {
  	j=i+1;
  	cout<<re[i]<<" ";
  	if(j%r == 0)
  	 	cout<<"\n";
  	
  }
  
  
 
}