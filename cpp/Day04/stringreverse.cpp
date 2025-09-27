#include<iostream>
#include<string.h> 
using namespace std;

void user_strrev(char*);

int main(){
    
    char str[50];

    cout << "Enter String Data: \t" << endl;
    cin>>str;
    
    user_strrev(str);

    cout << "Reversed String is: \t" << str << endl;

    return 0;
}


void user_strrev(char* s){
   
    char* end = s;
    while (*end != '\0') {
        end++;
    }
    
    end--;

    char temp;
    char* start = s;

    while (start < end) {
    
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}