#include<iostream>
using namespace std;
 class A{
    int a;
    public:
    A(){
      cout<<"This is default constructor of A"<<endl;
    }
    A(int p){
      cout<<"This is para construtor of A"<<endl;
    }

 };

 class B{
    int a;
    public:
    B(){
      cout<<"This is default constructor of B"<<endl;
    }
    B(int q){
      cout<<"This is para construtor of B"<<endl;
    }

 };

 class C: public B,public A{
    public:
    C(){
      cout<<"This is default constructor of C"<<endl;
    }
    C(int p, int q):A(p), B(){
      cout<<"This is para construtor of C"<<endl;
    }

 };

 
int main()
{
  C c(10,20);
  C c1;
  return 0;
    
}
