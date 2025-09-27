#include <iostream>
using namespace std;
#include<cmath>
int main(){

    double ans1, ans2;
    ans1 = sqrt(10);
    ans2 = sqrt(-10);//if we pass a negative value in the argument domain error occurs and the output will be the Square root of -a, which is -nan.
    cout<<"The square root is: "<<ans1<<endl;
    cout<<"The square root is: "<<ans2<<endl;
}