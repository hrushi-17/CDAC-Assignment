#include<iostream>
using namespace std;

int main(){
    int  i;
    int a[3];
    cout<<"Enter the array: "<<endl;
    for(i=0;i<=2;i++){
        //cin>>a[i];
        cin>>*(a+i);
    }
    
    // int max = a[0];
    int max = *(a+0);
    for(i=0;i<=2;i++){
        // if(max < a[i]){
        //     max = a[i];
        // }

        if(max < *(a+i)){
            max = *(a+i);
        }
    }
    // cout<<"maximum number is: "<<a[i]<<"\t";
    cout<<"maximum number is: "<<*(a+i)<<"\t";

}