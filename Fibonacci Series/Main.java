#include <iostream>
int fibo(int num)
{
    if (num == 0)
    {
        return 0;
    }
    else if (num == 1)
    {
        return 1;
    }
    else
    {
        return(fibo(num - 1) + fibo(num - 2));
    }
} 

int main()
{
    int n,r;
    std::cin >> n;
     r = fibo(n-1);
  std::cout<<"The term "<<n<<" in the fibonacci series is " <<r;
    return 0;
}