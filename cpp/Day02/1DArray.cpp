#include <iostream>
using namespace std;

int main(){
    int a[3], i;
    cout<<"Accept element of an array: "<<endl;
    for(i = 0 ; i<=2; i++){
        cin>>a[i];
    }  
    cout<<"Element of an array is: "<<endl;
    for(i = 0 ; i<=2; i++){
        cout<<a[i]<<"\t";
    }  
}