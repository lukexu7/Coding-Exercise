//
// Created by XZY on 2023/5/19.
//
#include<iostream>
using namespace std;

int main(){

//    cout <<"循环开始..\n" << endl;
//
//    int i = 1;
//    while (i <= 10){
//        cout << "现在是第" << i << "次循环" << endl;
//        i++;
//    }
//
//    do {
//        cout << "现在是倒数第"<<i<<"次循环\n"<<endl;
//        i--;
//    } while (i>1);
//
//    for(int num:{1,2,3,4,5,6}){
//
//        cout << "num:" << num << endl;
//    }
//
//
//    for (int i = 0; i < 3; i++){
//        for (int j = 0; j < 5; j++){
//            cout << (i * j) <<":xxx" << endl;
//        }
//    }

    //99乘法表

    for (int i = 1; i <=9; i++){
        for (int j = 1; j <= i; j++){

            cout << i << "*" << j << "=" << i * j << "\t";
        }
        cout << endl;
    }



}