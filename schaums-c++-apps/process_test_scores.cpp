#include <iostream>

using namespace std;

const STUDENTS = 4; //O(1) constant time
const TEST = 5; //O(1) constant time

typedef int Table[STUDENTS][TESTS];

void get(Table);
void print(const Table);
void print_test_averages(const Table);
void print_class_averages(const Table);

int main(){
	Table scores;
	get(scores);
	print(scores);
	print_test_averages(scores);
	print_class_averages(scores);
}

void get(Table x){//(T(n))
	for (int s = 0; s < STUDENTS; s++) //n + 1
		for (int t = 0; t < TESTS; t++) //n x n+1
			cin >> x[s][t]; //n x n
}

void print(const Table scores){
	cout << "Test scores:\n";
	for (int s = 0; s < STUDENTS; s++){
		for (int t = 0; t < TESTS; t++)
			cout << scores[s][t] << "\t";
		cout << endl;
	}
}

void print_test_averages(const Table scores){
	cout << "Test averages:\n";
	for (int s = 0; s < STUDENTS; s++){
		float sum = 0.0;
		for (int t = 0; t < TESTS; t++)
			sum += scores[s][t];
		cout << "\tStudent" << s << ": " << sum/TESTS << endl;
	 }
	}

	void print_class_averages(const Table scores){
		cout << "Class averages:\n";
		for (int t = 0; t < TESTS; t++){
			float sum = 0.0;
			for (int s = 0; s < STUDENTS; s++)
				sum += scores[s][t];
		cout << "\tTest " << t << ": " << sum/STUDENTS << endl;
	}
}



