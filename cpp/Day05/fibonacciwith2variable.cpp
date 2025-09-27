#include <iostream>
using namespace std;
int main (){
 int a=0;
 int b=1;
 int num;
 cout<<"Enter Fibonacci Length: ";
 cin>>num;
 cout<<"The Fibonacci Series is: \t"<<endl;
    for(int i=0;i<num;i++){
        cout<<a<<"\t";
        b+=a;
        a = b-a;
        
    }
    
    
}