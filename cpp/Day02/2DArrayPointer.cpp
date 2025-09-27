#include <iostream>
using namespace std;

int main(){
    int a[3][3], i, j;
    cout<<"Accept element of an array: "<<endl;
    for(i = 0 ; i<=2; i++){
        for(j = 0 ; j<=2; j++){
            cin>>a[i][j];
        }  
    }  
    cout<<"Element of an array is: "<<endl;
    for(i = 0 ; i<=2; i++){
        for(j = 0 ; j<=2; j++){
            cout<<*(*(a+i)+j)<<"\t";
        }
        cout<<endl;  
    }  
}