#include<iostream>
using namespace std;
class Cdate{

    int dd, mm, yy;
    public:
        void accept();
        void display() const;
        void setDd(int);
        int getDd() const; 
        Cdate();
};

Cdate:: Cdate(){
    dd = 13;
    mm = 12;
    yy = 30;
}
    

void Cdate:: accept(){
    cout<<"Accept the date:"<<endl;
    cin>>dd>>mm>>yy;
}


void Cdate::display() const{
    cout<<"Date is"<<dd<<"/"<<mm<<"/"<<yy<<endl;
}
void Cdate:: setDd(int d){
    dd = d;
}

int Cdate:: getDd() const{
    return dd;
}
int main(){

    Cdate d1 ;
    d1.accept();
    d1.display();
    d1.setDd(25);
    d1.display();
    cout<<"The Date is:"<<d1.getDd()<<endl;

    const Cdate d2;
    d2.display();

}
