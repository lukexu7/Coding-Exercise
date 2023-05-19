//
// Created by XZY on 2023/5/20.
//
#include<iostream>
using namespace std;

int main(){
    // break
//    int i = 1;
//
//    while (true){
//
//        cout << "i=" << i << endl;
//
//        i++;
//
//        if(i == 10){
//            break;
//        }
//    }

for (int num = 1; num <= 100; num++){
    if (num % 2 != 0){
        continue;
    }

    cout << num << endl;
}
}



