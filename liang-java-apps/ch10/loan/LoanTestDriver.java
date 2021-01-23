package ch10.loan;

import java.util.Scanner;

/*
 * OUTPUT
 * Enter annual interest rate, for example, 8.25: 9.1
Enter number of years: 10
Enter loan amount, for example, 120000.95: 12000
The loan was created on Tue Jan 19 21:21:31 PST 2021
The monthly payment is 152.66
The total payment is 18319.33

 * 
 * 
 */

public class LoanTestDriver {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter annual interest rate, for example, 8.25: ");
		
		double annualInterestRate = input.nextDouble();
		
		System.out.printf("Enter number of years: ");
		
		int numberOfYears = input.nextInt();
		
		
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		Loan myLoan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",  myLoan.getLoanDate().toString(), myLoan.getMonthlyPayment(), myLoan.getTotalPayment() );
		
	}

}
