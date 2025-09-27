#include <iostream>
using namespace std;

int main() {
    int n = 5;
    for(int i = 0; i < n; i++) {
        // spaces
        for(int space = 0; space < i; space++) {
            cout << " ";
        }
        // stars
        for(int j = 0; j < 2*(n-i)-1; j++) {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}