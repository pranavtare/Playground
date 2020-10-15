#include<iostream>
using namespace std;
struct Emp 
{ char name[30];
 int id,age;
 char d[20]; 
 int sa; 
  }s;

int main()
{
 cout<<"Enter name:";
  cin>>s.name;
  cout<<"\nEnter ID:";
  cin>>s.id;
 cout<<"\nEnter age:";
  cin>>s.age;
cout<<"\nEnter designation:";
  cin>>s.d;
  cout<<"\nEnter Salary:";
  cin>>s.sa;
  
  cout<<"\nEmployee Details";
  
  cout<<"\nName of the Employee : "<<s.name;
  cout<<"\nID of the Employee : "<<s.id;
  cout<<"\nAge of the Employee : "<<s.age;
  cout<<"\nDesignation of the Employee : "<<s.d;
  cout<<"\nSalary of the Employee : "<<s.sa;
}
