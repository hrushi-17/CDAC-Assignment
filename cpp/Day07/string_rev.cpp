#include<iostream>
#include <string.h>
using namespace std;
int main()
{
    char str1[20];
    char str2[20];
    int x=0;
    cout<<"Enter ths String: \n";
    cin>>str1;
    x=strlen(str1)-1;
    int y=0;
    while(x>=0)
    {
        str2[y] = str1[x];
        x--;
        y++;
    }
    str2[y]='\0';
    cout<<"The Reversed String: "<<str2;
    
}