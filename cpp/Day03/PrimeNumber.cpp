#include<iostream>
using namespace std;

int main(){
   
    int num, count=0;
    cout<<"enter the number: "<<endl;
    cin>>num;
    for(int i=2; i <num;i++){
        if(num%i==0){
            count++;
            break; 
        } 
    }
    if(count == 0){
        cout<<"the number is prime"<<endl;
    }
    else{
        cout<<"the number is not prime\n"<<"factors are: "<<count<<endl;
    }
}

