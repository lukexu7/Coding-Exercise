//

//
#include<iostream>

using namespace std;

int main() {

    cout << "ÊäÈë³É¼¨:" << endl;

    char score;

    cin >> score;

    switch (score) {
        case 'A':
            cout << "ÓÅÐã" << endl;


        case 'B':
            cout << "Á¼ºÃ" << endl;

        case 'C':
            cout << "À¬»ø" << endl;

        default:
            cout << "À¬»ø£¬»Ø¼Ò³ÔÊº°ÑÄã" << endl;

    }

    cin.get();
    cin.get();

}