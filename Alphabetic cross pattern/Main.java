#include <iostream>
#include <string>
using namespace std;

int main() 
{ 
   string s;
   cin>>s;
  int n,i,j;
   n=s.length();
  for(i=0;i<n;i++)
  {
    for(j=0;j<=n;j++)
    {
      if(i==j||i+j==n-1)
      {
        cout<<s[j];
      }
      else
        cout<<" ";
    }
    cout<<"\n";
  }
    return 0;
}