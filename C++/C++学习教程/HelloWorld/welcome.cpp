#include<iostream> 
using namespace std;

void welcome() {
	//提示输入姓名
	cout << "输入名字" << endl;

	//保存信息
	string name;
	cin >> name;
	cout << "hello," << name << endl;

}