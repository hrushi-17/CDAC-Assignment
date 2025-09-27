#include<iostream>
using namespace std;
class Cdate{

    int dd, mm, yy;
    public:
        void accept();
        void display();
        void setDd(int);
        int getDd(); 
    };

void Cdate:: accept(){
    cout<<"Accept the date:"<<endl;
    cin>>dd>>mm>>yy;
}

void Cdate::display(){
    cout<<"Date is"<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
void Cdate:: setDd(int d){
    dd = d;
}

int Cdate:: getDd(){
    return dd;
}
int main(){

    Cdate d1;
    d1.accept();
    d1.display();
    d1.setDd(25);
    d1.display();
    cout<<"The Date is:"<<d1.getDd()<<endl;

}
