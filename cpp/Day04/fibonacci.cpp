#include <iostream>
using namespace std;
int main (){
 int a=0;
 int b=1;
 int c=0;
 int num;
 cout<<"Enter Fibonacci Length: ";
 cin>>num;
 cout<<"The Fibonacci Series is: \t"<<endl;
    for(int i=1;i<=num;i++){
        cout<<a<<"\t";
        c=a+b; //c=1
        a=b; //a=1
        b=c; //b=1
        
    }
    
    
}