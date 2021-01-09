#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
#include <limits>
#include <vector> 

using namespace std;

const string filename = "temps.txt";

//general purpose function
char get_char(string prompt);

//functions for file I/O
void load_temps(vector<double>& low, vector<double>& high);
void save_temps(const vector<double>& low, const vector<double>& high);

//functions for console i/o
void display_menu();
void view_temps(const vector<double>& low, const vector<double>& high);
void add_temps(vector<double>& low, vector<double>& high);
void remove_temps(vector<double>& low, vector<double>& high);

int main(){
	cout << "The Temperature Manager Program\n\n";

	display_menu();

	//get temps from file
	vector<double> low_temps, high_temps;
	load_temps(low_temps, high_temps);

	char command = 'v';
	while (command != 'x'){
		command = get_char("Command: ");

		//execute appropriate command
		switch(tolower(command)){
			case 'v':
				view_temps(low_temps, high_temps);
				break;
			case 'a':
				add_temps(low_temps, high_temps);
				break;
			case 'r':
				remove_temps(low_temps, high_temps);
				break;
			case 'x':
				cout << "Bye!\n\n";
				break;
			default:
				cout << "Invalid command. Try again.\n\n";
				display_menu();
				break;

		}
	}
}

char get_char(string prompt){
	char choice;
	cout << prompt;
	cin >> choice;

	cin.ignore(10000, '\n');
	return choice;
}

void load_temps(vector<double>& low_temps, vector<double>& high_temps){
	double low, high;
	ifstream input_file(filename);
	if (input_file){
		while (input_file >> low >> high){
			low_temps.push_back(low);
			high_temps.push_back(high);
		}
		input_file.close();
	}
}

void save_temps(const vector<double>& low_temps, const vector<double>& high_temps){
	ofstream output_file(filename);
	for (int i = 0; i < low_temps.size(); ++i){
		output_file << low_temps[i] << '\t' << high_temps[i] << '\n';
	}
	output_file.close();
}

void display_menu(){
	cout << "COMMANDS\n"
		 << "v - Viwe temperatures\n"
		 << "a - Add temperatures\n"
		 << "r - Remove temperatures\n"
		 << "x - Exit\n\n";
}

void view_temps(const vector<double>& low_temps, const vector<double>& high_temps) {
	cout << "TEMPERATURES\n"
		 << left << setw(4) << "Day"
		 << right << setw(8) << "Low" <<setw(8) << "High" << endl
		 << "---- ------- -------" << endl;

	cout << fixed << setprecision(1);
	int day_num = 1;
	double low, high;
	for (int i = 0; i < low_temps.size(); ++i){
		low = low_temps[i];
		high = high_temps[i];
		cout << left << setw(4) << day_num
			 << right << setw(8) << low << setw(8) << high << '\n';
			 ++day_num;
	}
	cout << endl;
}

void add_temps(vector<double>& low_temps, vector<double>& high_temps) {
	double low, high;

	cout << "Enter low temp: ";
	cin >> low;

	cout << "Enter high temp: ";
	cin >> high;

	low_temps.push_back(low);
	high_temps.push_back(high);
	save_temps(low_temps, high_temps);
	cout << "Your temperatures have been added.\n\n";

}


void remove_temps(vector<double>& low_temps, vector<double>& high_temps) {
	int day;
	cout << "Enter day to remove: ";
	cin >> day;

	int index = day - 1;
	if (index >= 0 && index < high_temps.size()){
		high_temps.erase(high_temps.begin() + index);
		low_temps.erase(low_temps.begin() + index);
		save_temps(low_temps, high_temps);
		cout << "Temps for day " << day << " have been removed.\n\n";
	}
	else {
		cout << "Unable to remove day " << day << ". Invalid day.\n\n";
	}
}