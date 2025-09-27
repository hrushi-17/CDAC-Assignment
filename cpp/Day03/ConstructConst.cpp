#include<iostream>
using namespace std;
class ConstructConst{
    int rollNo;
    string name;
    public:
        ConstructConst(){
            rollNo = 101;
            name = "hrushi";
        }

        void display(){
            cout<<"roll no is: "<<rollNo<<endl;
            cout<<"name is: "<<name<<endl;
        }
    
};

int main(){

    ConstructConst c1;
    c1.display();

}