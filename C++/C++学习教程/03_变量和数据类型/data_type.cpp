#include<iostream>
using namespace std;

int main() {

	short a = 20;
	cout << "a=" << a << endl;

	cout << "a length =" << sizeof a << endl;

	int a2 = 20;
	cout << "a2=" <<  a2 << endl;
	cout << "a2 length=" << sizeof a2 << endl;

	long a3 = 30;
	cout << "a3=" << a3 << endl;
	cout << "a3 length=" << sizeof a3 << endl;


	long long a4=30;
	cout << "a4=" << a4 << endl;
	cout << "a4 length=" << sizeof a4 << endl;


	//无符号整形

	short s1 = 32767;
	cout << s1 << endl;

	unsigned short s2 = 40000;
	cout << "s2 = " << s2 << endl;

	//字符类型
	char c = 65;
	cout << "c=" << c << endl;

	bool b1 = true;
	cout << "b1=" << b1 << endl;

	//浮点类型
	float f = 2.5;
	double d = 3.78e-23;

	cout << d << endl;

	//字面值常量
	3.14f;

	bool trans = 25;
	cout << "brtans=" << trans << endl;

	short strans = false;
	cout << "strans = " << trans << endl;

	//浮点数值赋值给整数类型
	int itrans = 3.493



	cin.get();


}