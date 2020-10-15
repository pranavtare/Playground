#include <iostream>
using namespace std;

void showChoices();
int add(int a, int b)
{
	return a + b;
}

int subtract(int a, int b)
{
	return a - b;
}

int multiply(int a, int b)
{
	return a * b;
}

int divide(int a, int b)
{
	return a / b;
}
int rem(int a, int b)
{
	return a % b;
}

int main()
{
	int x, y;
	int choice;
  cin>>x>>y>>choice;
  cout<<"Enter first number : Enter second number :";
	 	showChoices();
		cin >> choice;
		switch (choice)
		{
		case 1:
			cout <<add(x,y) <<endl;
			break;
		case 2:			 
			cout <<  subtract(x,y) <<endl;
			break;
		case 3:
			cout <<   multiply(x,y) <<endl;
			break;
		case 4: 
            cout  << divide(x,y) <<endl;
			break;
		case 5:
            cout  << rem(x,y) <<endl;
			break;
          default:
            cout<<"Invalid operation";
	 		}
 	return 0;
}
void showChoices()
{
	cout << " Menu" << endl;
	cout << "1.Addition" << endl;
	cout << "2.Subtraction" << endl;
	cout << "3.Multiplication" << endl;
	cout << "4.Division" << endl;
	cout << "5.Remainder" << endl;
}

