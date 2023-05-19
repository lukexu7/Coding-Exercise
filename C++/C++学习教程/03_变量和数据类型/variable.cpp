#include<iostream>
#define PI 3.14

using namespace std;

int number = 1;//全局变量

int main() {
	int a, b = 10;
	a = 10;
	cout << "a=" << a << endl;
	cout << "b=" << b << endl;

	//局部变量

	int number = 1;
	cout << "number=1" << number << endl;
	cout << "::number" << ::number << endl;

	cout << "PI" << PI << endl;

	//常量
	const float pi = 3.14; 

	cin.get();
}