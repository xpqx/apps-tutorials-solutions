package murachs.ch5;

import java.text.NumberFormat;
import java.util.Scanner;

public class EmployeeInvestmentCalculator {
	
	static double monthlyInvestment;
	static double interestRate;
	static int years;
	static double monthlyInterestRate;
	static double futureValue;
	static int months;
	static String results;
	static String choice;
	
	static Scanner input = new Scanner(System.in);
	static NumberFormat currency = NumberFormat.getCurrencyInstance();
	static NumberFormat percent = NumberFormat.getPercentInstance();
    
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Employee Performance Bonus Calculator!");
		choice = "y";
		while (choice.equalsIgnoreCase("y") ) {
			System.out.println("DATA ENTRY");
			monthlyInvestment = getDoubleWithinRange(input, "Enter monthly investment: ", 0, 1000);
			interestRate = getDoubleWithinRange(input, "Enter yearly interest rate: ", 0, 30);
			years = getIntWithinRange(input, "Enter number of years: ", 0, 100);
			
			monthlyInterestRate = interestRate/12/100;
			months = years * 12;
			
			futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);
			
			percent.setMinimumFractionDigits(1);
			results = currency.format(monthlyInvestment) + percent.format(interestRate/100) + 
													years + currency.format(futureValue);
			
			System.out.print(results);
			
			System.out.print("Continue? (y/n): ");
			choice = input.next();
			input.nextLine();
		}
	}

	private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		
		double futureValue = 0;
		for (int i = 1; i < months; i++)
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		
		return futureValue;
	}

	private static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			isValid = true;
		}
		return 0;
	}

	private static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min)
				System.out.println("Error! Number must be greater than " + min + ".");
			else if (d >= max)
				System.out.println("Error! Number must be less than " + max + ".");
			else
				isValid = true;
		}
		
		return d;
	}

	private static double getDouble(Scanner sc, String prompt) {
		
		double d = 0.0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} 
			else
				System.out.println("Error! Invalid decimal! Try again!");
			}
			sc.hasNextLine();
		return d;
	}
	
private static int getInt(Scanner sc, String prompt) {
		
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} 
			else
				System.out.println("Error! Invalid Integer! Try again!");
			}
			sc.hasNextLine();
		return i;
	}
	

}
