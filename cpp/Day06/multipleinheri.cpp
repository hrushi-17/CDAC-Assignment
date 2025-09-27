#include<iostream>
using namespace std;

class grandparent
{
    int i=20,j= 23; // 43
    public:
    
    int add();
    //     return i+j;
    // }
};
int grandparent::add(){
    return i+j;
}
class parent {
    int x=23,y = 11; //34
    public:
    int add1(){
        return x+y;
    }

};

class child : public grandparent, parent
{
    int a=10,b =20; //30
    public:
    int add2()
    {
    return  a +b + add() + add1(); 
    }
};



int main()
{
    child obj;

    cout<<obj.add2();
    //cout<<"Additon of number is: "<<grandparent::add()<<endl;
}   