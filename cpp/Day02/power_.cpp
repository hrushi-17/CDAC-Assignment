#include<iostream>


using namespace std;
int main(){
    int a,b,num=1,i=1;
    cout<<"Enter the Number: \n";
    cin>>a>>b;
    while( i<=b)
{
    num= num*a;
    i++;


}    cout<<"The power of the number is: \n";
    cout<<num;
    
}