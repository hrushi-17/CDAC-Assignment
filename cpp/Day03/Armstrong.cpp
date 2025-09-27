#include<iostream>
using namespace std;

int main(){
   
    int num, sum=0;

    cout<<"enter the number\n";
    cin>>num;

    int temp = num;

    while(num > 0){
        int rem = num % 10;
        sum +=(rem * rem * rem);
        num = num /10;
    }
    cout<<sum<<endl;

    if(temp == sum){
        cout<<"this "<<temp" number is armstrong no:"<<endl;
    }
    else{
        cout<<"this "<<temp" number is not armstrong no:"<<endl;
    }
}

