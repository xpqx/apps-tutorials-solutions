//convert measurements (a measurements calculator)
//program takes an input and converts the ouput
//header file
#include <iostream>

//the namespace
using namespace std;

//named constants
const double CENTIMETERS_PER_INCH = 2.54;
const int INCES_PER_FOOT = 12;

//add other named constants and data types here
int main(){
	//declare variables
	//similar to declaring fields, references, then constructors, and methods
	int feet;
	int inches;
	int totalInches;
	double centimeters;

	cout << "Enter two integers, one for feet and "
		 << "one for inches: ";
	cin >> feet >> inches;
	cout << endl;
	cout << "You entered" << feet << " for feet " << inches  << " for inches" << endl;

	//make the conversion
	totalInches = INCES_PER_FOOT * feet + inches;
	centimeters = CENTIMETERS_PER_INCH * totalInches;

	//dispay the outpu
	cout << "Total number of inches is: " << totalInches;
	cout << " " << endl;
	cout << "Total number of centimeters is: " << centimeters 

}