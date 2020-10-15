#include<iostream>
#include<string.h>
using namespace std;
struct College{char name[100];
              char city[100];
               int establishmentYear;
               float passPercentage;
              }S1[20],temp;
int main(){
  
  int n,i,j,p;
   cin>>n;  
  cout<<"Enter the number of colleges\n";
  for(i=0;i<n;i++){
    p=i+1;
    cout<<"Enter the details of college "<<p;
  cin>>S1[i].name>>S1[i].city>>S1[i].establishmentYear>>S1[i].passPercentage;
    cout<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage\n";
  }
 p=0;
  cout<<"Details of colleges\n";
   for (i = 0; i < n; i++) {
     p=i+1;
     cout<<"College:"<<p;
      cout<<"\nName:"<<S1[i].name;
        cout<<"\nCity:"<<S1[i].city;
        cout<<"\nYear of establishment:"<<S1[i].establishmentYear;
        cout<<"\nPass percentage:"<<S1[i].passPercentage;        
     cout<<"\n";
   }
  return 0;
}