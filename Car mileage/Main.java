#include<iostream>
using namespace std;
int main()
{
  int p,d,pd;
  float m;
  cin>>m>>p>>d;
  pd=m*p;
  if(pd >= d)
   cout<<"Can reach";
  else
   cout<<"Cannot reach";
return 0;
}
 