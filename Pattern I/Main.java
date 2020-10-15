#include<iostream>
using namespace std;
 int main()
{
 
  int n,i,j,p=0,k=0;
 int a[4][4],b[4][4];
  cin>>n;
  p=n+4;
   for(i=0;i<=3;i++)
  {
  	for(j=0;j<=3;j++)
  	{
  		  a[i][j] = n;
  		  b[i][j] = n;
  				
	  }
	  n++;
  }
	  
   for(i=0;i<=3;i++)
  {
  
  	for(j=0;j<=3;j++)
  	
  	{	if(j<=k)
  	  {
  	  	 cout<< a[i][j];
  	  	 
	    }else
	    cout<<"";
  		
  				
	  }
	  k++;
	  cout<<"\n";
   }
  k--;
   	 
  for(i=3;i>=0;i--)
  {
  	  for(j=3;j>=0;j--)
  {
  	if(j<=k)
  	  {
  	    cout<< b[i][j];
  	    
	}else
	    cout<<"";
  }
	  k--;
	  cout<<"\n";
  }
  
}   
 
