#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter size of Array: \n";
    cin>>n;

    if(n<2){
        cout<<"Array must've atleast 2 elements!|n";
        return 0;
    }

    int arr[n];
    cout<<"Enter "<<n<<" Elements: ";
    for(int i = 0;i<n;i++){
        cin>>arr[i];
    }
    int largest = arr[0];       //Largest Element in array
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            largest=arr[i];
            
        }
    }
    cout<<"largest Element is: \n"<<largest<<endl;

    int Secondlargest = arr[0];
    bool found = false; 

    for(int i=0;i<n;i++){
        if(arr[i]!= largest){
            if(!found || arr[i] > Secondlargest)
            {
                Secondlargest = arr[i];
                found =true;
            }
        }
    }
    if(found)
    {
        cout<<"Second Largest Element is: "<<Secondlargest<<endl;
    }
    else{
        cout<<"No Second Largest Element Exists!"<<endl;
    }
    return 0;
}