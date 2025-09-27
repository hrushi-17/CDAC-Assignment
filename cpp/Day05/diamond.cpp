#include <iostream>
using namespace std;

int main() {
    int n = 5;
    int m = 4;
    for(int i = 0; i < m; i++) //rows
    {
        for(int space = 4; space >i; space--) // spaces
        {
            cout << " ";
        }
        for(int j = 0; j < 2*i+1; j++) // stars
        {
            cout << "*";
        }
        cout << endl;
    }
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