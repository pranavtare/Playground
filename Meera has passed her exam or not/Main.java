#include<iostream>
int main()
{
  int n,i,mark,flag=0;
  std::cin>>n;
  int A[n];  
  for(i=0;i<n;i++)
  {
   std::cin>>A[i];
  }
  std::cin>>mark;
 while(n!=0)
 {
   if(A[n-1]==mark)
   {
    std::cout<<"She passed her exam";
     flag = 1;
     break;
   }
  n--;
 }
    if(flag == 0)
    {
      std::cout<<"She failed";
    }
}