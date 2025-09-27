#include<iostream>
using namespace std;
void show();

int main(){
    show();
    show();
}

void show(){
    int x = 0;
    static int y = 0;
    cout<<"value of x: "<<x<<endl;
    cout<<"value of static y: "<<y<<endl;
    x++;
    y++;
}