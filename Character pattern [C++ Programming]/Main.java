#include<iostream>
using namespace std;

void printpattern(int n)
{
	int i,j;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j%2==1)
        cout<<"*";
      else
        cout<<"#";
    }
    cout<<"\n";
  }
}


int main()
{
    int a;
    cin>>a;
    printpattern(a);
    return 0;
}
