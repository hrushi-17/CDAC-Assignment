#include<iostream>
using namespace std;

class Complex
{
    int real;
    int img;
    public:
        void accept();
        void display();
        void setReal(int);
        int getReal();
    
};
void Complex ::accept()
{
    cout<<"Enter value for real and img\n";
    cin>>real>>img;
}
void Complex ::display()
{
    cout<<"Complex Number is"<<real<<"t"<<img<<"i"<<endl;
}
void Complex :: setReal(int r)
{
    real=r;

}
int Complex :: getReal()
{
    return real;

}
int main()
{
    Complex c1;
    cout<<"adderess of an obj is"<<&c1;
    c1.accept();
    c1.display();
    c1.setReal(10);
    c1.display();
    cout<<"real part is "<<c1.getReal();
}