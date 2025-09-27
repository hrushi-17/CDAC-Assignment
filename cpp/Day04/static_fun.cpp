
#include<iostream>
using namespace std;
class Complex
{
    public:
        static int cmt;

};
int Complex ::cmt=10;
int main (){
    cout<<Complex::cmt;
}