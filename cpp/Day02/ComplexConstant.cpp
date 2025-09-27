#include<iostream>
using namespace std;

class Complex{

    int real;
    int img;
    public:

        void accept();
        void display() const;
        void setReal(int);
        int getReal() const;
        Complex();
};

Complex::Complex(){
    real = 20;
    img = 30;
}

void Complex :: accept(){
    cout<<"Enter value for real and imaginary:";
    cin>>real>>img;
}

void Complex :: display() const{
    cout<<"Complex number is: "<<real<<"+"<<img<<"i"<<endl;
}
void Complex :: setReal(int r){
    real = r;
}

int Complex :: getReal() const{
    return real;
}
int main(){
    Complex c1;
    cout<<"Address of an obj is:"<< &c1<<endl;
    c1.accept();
    c1.display();
    c1.setReal(10);
    c1.display();
    cout<<"real part is: "<<c1.getReal()<<endl;

    const Complex c2;
    c2.display();
}