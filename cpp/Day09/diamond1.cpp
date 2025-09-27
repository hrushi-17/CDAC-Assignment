#include <iostream>
using namespace std;

class Base {
    public:
    
    void show(){
        cout<<"This is Base class "<<endl;
    }
    
};
class Parent1:virtual public Base {
    public:
    void show(){
        cout<<"This is Base class "<<endl;
    }
    
};
class Parent2:virtual public Base {
    public:
    void show(){
        cout<<"This is Base class "<<endl;
    }
    
};
class Child:public Parent1, public Parent2 {
    public:
     void show(){
        cout<<"This is Base class "<<endl;
    }
    
};

int main(){
    Child *obj = new Child();
   
    obj->show();
    return 0;
}





// #include <iostream>
// using namespace std;

// class Base {
//     public:
//     // Base (){
//     //     cout<<"This is default constructor of A"<<endl;
        
//     // }
//     void show(){
//         cout<<"This is Base class "<<endl;
//     }
    
// };
// class Parent1:virtual public Base {
//     public:
//     // B (): A(){
//     //     cout<<"This is default constructor of B"<<endl;
        
//     // }
//     // void show(){
//     //     cout<<"This is Parent1 class "<<endl;
//     // }
    
// };
// class Parent2:virtual public Base {
//     public:
//     // C (): A(){
//     //     cout<<"This is default constructor of C"<<endl;
        
//     // }

//     // void show(){
//     //     cout<<"This is Parent2 class "<<endl;
//     // }  
 
    
// };
// class Child:public Parent1, public Parent2 {
//     public:
//     // D (): B(), C(){
//     //     cout<<"This is default constructor of C"<<endl;
        
//     // }

//     // void show(){
//     //     cout<<"This is Child class "<<endl;
//     // }  

    
// };

// int main(){
//     Child *obj = new Child();
//     // obj->Base::show();// Abiguity arises, as Child now has two copies of fun()
//     // obj->Parent1::show();
//     // obj->Parent2::show();
//     // obj->Child::show();

//     obj->show();
//     return 0;
// }