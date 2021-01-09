package murachsJavaProg.ch3Apps;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {
	public static void main(String[] args) {
		final double SALES_TAX_PCT = .05;
		System.out.println("Welcome to the Invoice Calculator 3!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			//--get user input
			System.out.print("Enter subtotal: " );
			double subtotal = sc.nextDouble();
			
			//--calculate the results
			double discountPercent = 0.0;
			if (subtotal >= 100) {
				discountPercent = .1;
				}else {
				discountPercent = 0.0;
			}
			double discountAmount = subtotal * discountPercent;
			double totalBeforeTax = subtotal - discountAmount;
			double salesTax = totalBeforeTax * SALES_TAX_PCT;
			double total = totalBeforeTax + salesTax;
			
			//format and display the results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			String message = 
					"Discount percent: $ " + percent.format(discountPercent) + "\n"
					+ "Discount amount: $ " + currency.format(discountAmount) + "\n"
					+ "Total before tax: $ " + currency.format(totalBeforeTax) + "\n"
					+ "Sales tax: $ "        + currency.format(salesTax) + "\n"
					+ "Invoice total: $ " + currency.format(total) + "\n";
			System.out.println(message);
			
			//--see if the user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}
