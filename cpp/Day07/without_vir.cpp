#include<iostream>
using namespace std;

class employee
{
    int id;
    public:
    employee();
    employee(int);
    void display();
    int findsalary()
    {
        return 0;
    }

};

employee::employee()
{
    cout<<"This is Default Contor Emp \n";
     id = 0;
}

employee::employee(int i)
{
    cout<<"This is Para Contor Emp\n";
    id = i;
}

 void employee::display()
{
   cout<<"Id of an emp is "<<id<<endl;
}

class wageemployee:public employee
{
    int hrs,rate;
    public:
    wageemployee();
    wageemployee(int,int,int);
    void display();
    int findsalary();

};

wageemployee::wageemployee()
{
    cout<<"This is Def Contor for WageEmployee \n";

    hrs = 0;
    rate = 0;
}
wageemployee::wageemployee(int i,int h,int r):employee(i)
{
    cout<<"This is Para Contor for WageEmployee \n";
    rate = r;
    hrs = h;
}
int wageemployee::findsalary()
{
    return hrs*rate;
}
void wageemployee::display()
{
    employee :: display();
    cout<<hrs<<endl;
    cout<<rate<<endl;
}

int main ()
{
    employee *  emp;
    wageemployee wep(5,10,400);
    emp= &wep;
    cout<<"Salary is: "<<emp->findsalary()<<endl;
    emp->display();
}