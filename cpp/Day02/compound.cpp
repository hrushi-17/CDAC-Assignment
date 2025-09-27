#include<iostream>
using namespace std;
int main(){
int a,b,c,d, ci;

    cout<<"Enter Numbers: "<<"\n";
    cin>>a>>b>>c>>d;
    ci = a*(1+ b/c)^c*d;
    cout<<"Compound interest is: "<<ci<<endl;
}