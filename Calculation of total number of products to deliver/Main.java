#include <iostream>
using namespace std;

int main() 
{
   int n,i,j,sum,t,rem;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
    t=arr[i];
   int  sum=0;
 
  while(t!=0)
  {
    rem=t%10;
    sum=sum+rem;
    t=t/10;
  }
    cout<<sum<<" ";
  }
    return 0;
}