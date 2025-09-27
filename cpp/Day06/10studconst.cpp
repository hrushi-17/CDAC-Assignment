#include <iostream>
#include <string.h>
using namespace std;
class Student
{
    int roll;
    int dd, mm, yyyy;
    float totalmarks;
    char name[50];
    int p, c, m;

public:
    Student(int, int, int, int, char[], int, int, int);
    void display();
};

Student::Student(int roll, int dd, int mm, int yyyy, char name[], int P, int C, int M)
{
    this->roll = roll;
    this->dd = dd;
    this->mm = mm;
    this->yyyy = yyyy;
    strcpy(this->name, name);
    p = P;
    c = C;
    m = M;
}
void Student::display()
{
    cout << "Roll No. " << roll << endl<<"Name: " << name <<endl<< "DOB: " << dd << "/" << mm << "/" << yyyy <<endl<< "Total Marks: " <<p+c+m<<endl;
    
}
int main()
{
    Student s1(1,22,04,2001,"Devansh",23,45,27);
    s1.display();
    Student s2(2,21,05,2002,"Ayush",73,85,27);
    s2.display();
    Student s3(3,22,04,2007,"Vinayak",25,85,47);
    s3.display();
    Student s4(4,22,04,2001,"Kapil",23,55,37);
    s4.display();
    Student s5(5,22,04,2003,"Mohan",22,45,27);
    s5.display();
    Student s6(6,22,04,2002,"Aditya",28,25,47);
    s6.display();
    Student s7(7,22,04,2004,"viren",27,15,67);
    s7.display();
    Student s8(8,22,04,2000,"Rupa",21,95,37);
    s8.display();
    Student s9(9,22,04,2004,"Deepa",20,35,27);
    s9.display();
    Student s10(10,22,04,2000,"Nisha",21,15,17);
    s10.display();


}
