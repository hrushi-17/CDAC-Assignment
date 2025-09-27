#include<iostream>
using namespace std;
#include<string.h>
class String1
{
	int len;
	char * ptr ;
	public:
	
	String1(){
		len = 1;
		ptr = new char;
		*ptr = 'A';

	}

	String1(int len, char *ptr){
		this->len = len;
		this->ptr = ptr;
	}
	String1(char * str){
		len = strlen(str);
		ptr = new char[len+1];
		strcpy(ptr,str);
	}
	void display(){
		if(len>1){

			cout<<"The length is: "<<len<<"\n"<<"The pointer is: "<< ptr<<endl;
		}
		else{
			cout<<"The length is: "<<len<<"\n"<<"The pointer is: "<< *ptr<<endl;
		}
	}
};

int main(){
	String1 s1;
	s1.display();
	String1 s2("Chinmay");
	s2.display();
	
}