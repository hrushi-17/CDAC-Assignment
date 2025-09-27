#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter Numer of Elements in array: \n";
    cin>>n;
    
    int arr[n];
    cout<<"Enter "<<n<<" Elements.\n";
    for(int i=0 ;i<n ;i++)
    {
        cin>>arr[i]; 
    }
    int max = arr[0];
    int max1;
    for(int i=1;i<n;i++)
    {
        if(arr[i]>max)
        {
            max = arr[i];
        }  
    }
    cout<<"The largest No. of Array is: "<<max<<endl;

    int max2 = arr[0];
    for(int i=0;i<n;i++)
    {
        if(max2<arr[i] && arr[i]<max)
        {
            max2 = arr[i];
            cout<<max2<<endl;
        }  
    }
    cout<<"The 2nd largest No. of Array is: "<<max2<<endl;
     return 0;
}
