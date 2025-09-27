

#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    double w =  9.4;
    double x =  -9.4;
    double y =  9.8;
    double z = -9.8;
    double z1 = 9.5;

    cout << "Rounded value of w is : " << round(w)<<endl; // It Round off to the nearest greater value if less than 5
    cout << "Rounded value of x is : " << round(x)<<endl;
    cout << "Rounded value of y is : " << round(y)<<endl;
    cout << "Rounded value of z is : " << round(z)<<endl;
    cout << "Rounded value of z1 is : " << round(z1)<<endl;
    
    
    return 0;
}