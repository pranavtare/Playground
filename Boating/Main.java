#include<iostream>
using namespace std;
int main()
{
   int bwt,cwt=30,awt=75,a,c,tcwt,tawt;
  cin >> bwt >> a >> c;
  tawt = a*awt;
  tcwt = c*cwt;
  int wt = tawt + tcwt;
  if(bwt>=wt)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}