#include <iostream> 
using namespace std; 
#define MaximumNum(a, b) (a>b) ? a:b  
int main() 
{ 
    int x, y;
    cout<<"Enter the x and y "<<endl;
    cin>>x>>y;
    int ans = MaximumNum(100, 1000);
    int ans1 = MaximumNum(x, y);

    cout<<"The maximum number is: "<<ans<<endl;
    cout<<"The maximum number of x and y is: "<<ans1<<endl;
    
    return 0; 
} 