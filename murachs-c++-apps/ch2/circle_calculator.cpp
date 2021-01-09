#include <iostream>
#include <cmath>


using std::cout;
using std::cin;
using std::endl;
using std::pow;
//using std::round;
using std::string;

int main(){

    cout << "Circle Calculator" << endl << endl;
	string choice = "y";
	string choice2 = "Y";

	while (choice == "y" || choice2 == "Y"){
	

	//get radius from user
	double radius;
	cout << "Enter radius: ";
	cin >> radius;

	//make calculations
	double pi = 3.14159;
	double diameter = 2 * radius;
	double circumference = diameter * pi;
	double area = pi * pow(radius, 2.0);

	//round to 1 decimal place
	circumference = round(circumference * 10)/10;
	area = round(area * 10)/10;

	//write output to console
	cout << "Diameter: " << diameter << endl
		 << "Circumference: " << circumference << endl
		 << "Area: " << area << endl << endl
		 << "Bye! ";

	
}
	//return value for normal program exit
		 return 0;
}