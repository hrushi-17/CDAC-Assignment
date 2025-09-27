// #include<iostream>
// using namespace std;

// int main()
// {
//     int ptr1[5];
//     int *ptr2[5];
//     cout<<"Enter the 5 Numbers: \n";
//     for(int i =0;i<5;i++){
//         cin>>ptr1[i];
//     }
    
//     for(int i=0;i<5;i++){
        
//         ptr2[i] = &ptr1[i];
//     }
//     cout<<"The Value of 5 Number is: \n";

//     for (int i = 0;i<5;i++){
//         cout<<*ptr2[i];
//     }
//     cout<<sizeof(ptr2);


// }


#include <iostream>
using namespace std;

// Function to calculate binomial coefficient C(n, k)
int binomialCoeff(int n, int k) {
    int res = 1;
    if (k > n - k) k = n - k; // Take advantage of symmetry
    for (int i = 0; i < k; ++i) {
        res *= (n - i);
        res /= (i + 1);
    }
    return res;
}

// Function to print Pascal's Triangle up to n rows
void printPascal(int n) {
    for (int line = 0; line < n; line++) {
        for (int i = n-line; i >= 0; i--)
            cout <<" ";
        for (int i = 0; i <= line; i++)
            cout << binomialCoeff(line, i) << " ";
        cout << "\n";
    }
}

int main() {
    int n = 7; // Number of rows
    printPascal(n);
    return 0;
}
