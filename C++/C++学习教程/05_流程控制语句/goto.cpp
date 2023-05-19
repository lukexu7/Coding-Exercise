//author: XZY
//Date: 2023/5/20
//File:goto

#include<iostream>
using namespace std;

int main(){


    int x = 0;
    cout << "程序开始" << endl;
    begin:
    do {
        cout << "x=" <<  ++x <<endl;
    } while (x < 10);

    if (x < 15){
        cout << "回到原点" << endl;
        goto begin;
    }

    cout <<"程序结束" << endl;

}