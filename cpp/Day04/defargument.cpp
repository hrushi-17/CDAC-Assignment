#include <iostream> 
using namespace std; 
void add(int,int,int=3,int=4);
int main() 
{ 

    // add();
    // add(5);
    add(2,2);
    add(0,2,0);
    add(10,2,30,4);
}
void add(int a,int b,int c,int d)
{
	cout<<a+b+c+d<<endl;
	
}