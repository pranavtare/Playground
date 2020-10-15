#include <iostream>
#include <cstdlib>
int main(){
   int *p=NULL,a,even_count=0,odd_count=0;
  std::cin>>a;
  p = (int *)malloc(a*sizeof(int));  // Allocate n ints and save ptr in a.
for (int i=0; i<a; i++) {
    std :: cin >> *(p+i);
}
 for (int i=0; i<a; i++) {
    if(*(p+i)%2 == 0)
      even_count++;
   else
     odd_count++;
}
   std::cout<<odd_count<<"\n"<<even_count;
  return 0;
}