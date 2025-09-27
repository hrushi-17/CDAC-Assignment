#include<iostream>
using namespace std;

int main(){
   
    int a[3][3];
    int b[3][3];
    int c[3][3];

    cout<<"The the value of Matrix A: "<<endl;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
           cin>>a[i][j];
        }
    }

    cout<<"The the value of Matrix B: "<<endl;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
           cin>>b[i][j];
        }
    }

    
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            c[i][j]=0;

            for(int k=0; k<3; k++){
                c[i][j] += a[i][k] * b[k] [j];
            }
        }
    }

    cout<<"The multiplication of Matrix A and B is: "<<endl;
     for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            cout<<c[i][j]<<"\t";  
        }
        cout<<endl;
    }
}

