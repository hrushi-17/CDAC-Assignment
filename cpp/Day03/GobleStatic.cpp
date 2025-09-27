#include<iostream>
using namespace std;
void show();
int x = 0;
static int y = 0;
int main(){
    cout<<"value of x: "<<x<<endl;
    x++;
    show();
    cout<<"value of x: "<<x<<endl;
    
    cout<<"After first call:"<<endl;
    show();
    cout<<"value of x: "<<x<<endl;
}

void show(){     
    cout<<"value of x: "<<x<<endl;
    cout<<"value of static y: "<<y<<endl;
    x++;
    y++;
}