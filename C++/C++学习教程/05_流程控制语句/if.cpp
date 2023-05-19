#include<iostream>

using namespace std;

int main() {
	int age;
	cout << "年龄" << endl;
	cin >> age;

	if (age >= 19) {
		cout << "成年人" << endl;
	}

	cin.get();
	cin.get();
}