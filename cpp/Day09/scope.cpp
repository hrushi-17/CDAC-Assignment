#include<iostream>
int x =100;
class scope{

    int x = 5;
    public:
    void func() {
    int x = 10;
    std::cout << ::x;  // Refers to global x
}
};

int main(){
    scope s;
    s.func();
}
