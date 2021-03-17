//movie ticket sales

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

int main(){

	//step 1, fields, references, variables, constructors, methods/functions
	string movieName;
	
	double seniorCitizenTickets;
	
	double adultTicketPrice;
	double childTicketPrice;
	
	int noOfAdultTicketsSold;
	int noOfChildTicketsSold;
	double percentDonation;
	
	double grossAmount;
	double grossTotalAmount;
	
	double amountDonated;
	
	double netSaleAmount;
	
	double grossAdultTicketsSold;
	double grossChildTicketsSold;
	double grossSeniorTicketsSold;
	
	double refundedAdultTickets;
	double refundedChildTickets;
	double refundedSeniorTickets;
	
	double totalRefundedTickets;
	double totalAdultNetSaleAmount;
	double totalChildNetSaleAmount;
	double totalSeniorNetSaleAmount;
	double totalNetSaleAmount;

	cout << fixed << showpoint << setprecision(2);

	cout << "Enter the movie name: ";
	getline(cin, movieName);
	cout << endl;

	cout << "Enter the price of an adult ticket: ";
	cin >> adultTicketPrice;
	cout << endl;

	cout << "Enter the price of a child ticket: ";
	cin >> childTicketPrice;
	cout << endl;
	
	cout << "Enter the number of adult tickets sold: ";
	cin >> noOfAdultTicketsSold;
	cout << endl;

	cout << "Enter the number of child tickets sold: ";
	cin >> noOfChildTicketsSold;
	cout << endl;

	cout << "Enter the percentage donation: ";
	cin >> percentDonation;
	cout << endl << endl;

	//calculate gross amount, all sales received
	grossAdultTicketsSold = (adultTicketPrice * noOfAdultTicketsSold);
	grossChildTicketsSold = (childTicketPrice * noOfChildTicketsSold);
	grossTotalAmount = grossAdultTicketsSold + grossChildTicketsSold;

	amountDonated = grossTotalAmount * percentDonation/100;
	netSaleAmount = grossTotalAmount - amountDonated;

	//my variables added
	totalAdultNetSaleAmount = grossAdultTicketsSold - refundedAdultTickets; 
	totalChildNetSaleAmount = grossChildTicketsSold - refundedChildTickets;
	totalSeniorNetSaleAmount = grossSeniorTicketsSold - refundedSeniorTickets;
	totalRefundedTickets = refundedAdultTickets + refundedChildTickets + refundedSeniorTickets;

	totalNetSaleAmount = netSaleAmount - totalRefundedTickets;

	cout << "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"
		 << "-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*" << endl;
	cout << setfill('.') << left << setw(35) << "Movie Name: "
		 << right << " " << movieName << endl;
	cout << left << setw(35) << "Number of Tickets Sold: "
		 << setfill(' ') << right << setw(10)
		 << noOfAdultTicketsSold + noOfChildTicketsSold
		 << endl;
	cout << setfill('.') << left << setw(35)
		 << "Gross Amount: "
		 << setfill(' ') << right << " $"
		 << setw(8) << grossAmount << endl;
	cout << setfill('.') << left << setw(35)
		 << "Percentage of Gross Amount Donated: "
		 << setfill(' ') << right
		 << setw(9) << percentDonation << '%' << endl;
	cout << setfill('.') << left << setw(35)
		 << "Amount Donated: "
		 << setfill(' ') << right << " $"
		 << setw(8) << amountDonated << endl;
	cout << setfill('.') << left << setw(35) << "Net Sale: "
		 << setfill(' ') << right << " $"
		 << setw(8) << netSaleAmount << endl;
	 cout << setfill('.') << left << setw(35) << "Total Adult Net Sale: "
	 	  << setfill(' ') << right << " $"
	 	  << setw(8) << totalAdultNetSaleAmount << endl;
	 cout << setfill('.') << left << setw(35) << "Total Child Net Sale: "
	 	  << setfill(' ') << right << " $"
	 	  << setw(8) << totalChildNetSaleAmount << endl;
	 cout << setfill('.') << left << setw(35) << "Total Senior Net Sale: "
	 	  << setfill(' ') << right << " $"
	 	  << setw(8) << totalSeniorNetSaleAmount << endl;
	 cout << setfill('.') << left << setw(35) << "Total Refunded Ticket Sales: "
	 	  << setfill(' ') << right << " $"
	 	  << setw(8) << totalRefundedTickets << endl;
	 cout << setfill('.') << left << setw(35) << "Total Net Sale: "
	 	  << setfill(' ') << right << " $"
	 	  << setw(8) << totalNetSaleAmount << endl;

	return 0; 

}