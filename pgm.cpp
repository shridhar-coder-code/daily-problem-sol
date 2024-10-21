#include <iostream>
#include <string>
using namespace std;

string getGrade(int marks) {
    if (marks >= 91) return "AA"; 
    if (marks >= 81) return "AB";  
    if (marks >= 71) return "BB";  
    if (marks >= 61) return "BC";  
    if (marks >= 51) return "CD";  
    if (marks >= 41) return "DD";  
    return "Fail";                 
}

int main() {
    int marks;
    cout << "Enter marks: ";
    cin >> marks;

    if (marks >= 0 && marks <= 100) {
        cout << "Marks = " << marks << ", Grade = " << getGrade(marks) << endl;
    } else {
        cout << "Invalid input" << endl;
    }

    return 0;
}
