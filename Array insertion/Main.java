#include<iostream>
using namespace std;
int* insertX(int n, int a[], 
             int x, int pos) 
{ 
    int i; 
  
    // increase the size by 1 
    n++; 
  
    // shift elements forward 
    for (i = n; i >= pos; i--) 
        a[i] = a[i - 1]; 
  
    // insert x at pos 
    a[pos - 1] = x; 
  
    return a; 
} 
int main()
{
   int l,i=0,n,new_el;
  int a[50];
 
  cin>>n;
 for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>l;
  cin>>new_el;
  cout<<"Enter the number of elements in the array"; 
  cout<<"\nEnter the elements in the array";  
  cout<<"\nEnter the location where you wish to insert an element";
  if(l>n){
    cout<<"\nInvalid Input";
  }else{
  cout<<"\nEnter the value to insert";
 insertX(50, a, new_el, l); 
  cout<<"\nArray after insertion is \n";
  for(i=0;i<n+1;i++)
  {
    cout<<a[i]<<"\n";
  }
  }
}