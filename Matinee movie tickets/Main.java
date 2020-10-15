#include<iostream>
using namespace std;
int main()
{
   int age;
  int time;
  cin>>age>>time;
  if(age>13 && time == 13)
  {
    cout<<"$5.00";
  }
  else if(age<13 && time == 13){
    cout<<"$2.00";
  }
  else if(age> 13){
    cout<<"$8.00";
  }
  else
    cout<<"$4.00";
}