#include<iostream>
using namespace std;
class DynamicObj
{
    int dd, mm ,yy;
    public:
    DynamicObj()
    {
        dd=mm=yy=0;
        cout<<"This is Default Contr!! \n";
    }
    DynamicObj(int d, int m, int y)
    {
        dd=d;
        mm=m;
        yy=y;

        cout<<"This is Para Contr!! \n";

    }
    void show()
    {
        cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
    }
};
int main()
{
    DynamicObj *ptr1 = new DynamicObj();
    ptr1->show();
    DynamicObj *ptr=new DynamicObj(1,04,2004);
    ptr ->show();
    delete ptr;
    
}