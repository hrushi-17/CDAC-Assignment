#include <iostream>
using namespace std;

int main() {
    int n = 5;
    for(int i = 0; i < n; i++) //rows
    {
        for(int space = 5; space >i; space--) // spaces
        {
            cout << " ";
        }
        for(int j = 0; j < 2*i+1; j++) // stars
        {
            cout << "*";
        }
        cout << endl;
    }
    return 0;
}