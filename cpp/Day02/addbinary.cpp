#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int a, b, num, sum=0 , i=0;
    cout<<"Enter the two binary no."<<endl;
    cin>>a>>b;

    num = a + b;
    while(num>0){
        int rem = num % 10;
        sum = sum+(pow(2,i)*rem);
        num = num / 10;
        i++;
    }

    cout<<sum;
    return 0;
}