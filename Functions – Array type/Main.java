#include<iostream>
using namespace std;
int main()
{
   int n,i,e=0,o=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  
  for(i=0;i<n;i++)
  {
   if(a[i]%2 == 0)
     e++;
   else
     o++;    
  }
  cout<<"Enter the number of elements in the array";
  cout<<"\nEnter the elements in the array";
  if(e == n)
    cout<<"\nThe array is Even";
  else if(o == n)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
}