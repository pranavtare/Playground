#include<iostream>
int main()
{
  int n,i,max,j;
  std::cin>>n;
  int A[n];  
  for(i=0;i<n;i++)
  {
   std::cin>>A[i];
  }

   for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (A[i] < A[j])
            {
                max = A[i];
                A[i] = A[j];
                A[j] = max;
            }
        }
    }
  std::cout << A[0];
}