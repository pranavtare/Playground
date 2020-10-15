#include<iostream>
using namespace std;
int main()
{ int a1,a2,a3,d1,d2,d3,s2,s1,s3,amt1,amt2,amt3;
 std::cin>>a1>>d1>>s1 >> a2>>d2>>s2 >> a3>>d3>>s3;
 amt1=  a1-(a1*d1)/100 + s1;
 amt2= a2-(a2*d2)/100 + s2;
 amt3= a3-(a3*d3)/100 + s3;
 
  std::cout<<"In Flipkart Rs."<<amt1<<"\n";
 std::cout<<"In Snapdeal Rs."<<amt2<<"\n";
 std::cout<<"In Amazon Rs."<<amt3<<"\n";
 if(amt1 <= amt2 && amt1 <= amt3)
   std::cout<<"He will prefer Flipkart";
 else if(amt2 < amt1 && amt2 < amt3)
	std::cout<<"He will prefer Snapdeal";
 else
   std::cout<<"He will prefer Amazon";
}