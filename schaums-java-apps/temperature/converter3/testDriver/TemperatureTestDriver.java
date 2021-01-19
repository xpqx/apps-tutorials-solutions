package temp.converter3.testDriver;

import java.util.Scanner;

import temp.converter2.MyTemperature;
import temp.interfaces.Temperature;

public class TemperatureTestDriver {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Enter a temperature to convert: ");
		String s1;
		s1 = input.next();
		double value = Double.parseDouble(s1);
		
		System.out.println("Enter F or C to convert: ");
		char ch = input.next().charAt(0);
		char scale = Character.toUpperCase(ch);
		
		System.out.println("Enter F or C to convert: ");
		String s2 = null;
		int digits = Integer.parseInt(s2);
		
		if ( scale!='C' && scale!='F')
			exit();
		
		Temperature temp1 = new MyTemperature(value, scale, digits);
		System.out.println(temp1);
	}
	
		private static void exit() {
			 // prints usage message and then terminates the program:    
			System.out.println(     "Usage: java Convert <temperature> <scale> <digits>" 
			 + "\nwhere:"  
					+ "\t<temperature> is the temperature that you want to convert" 
			 + "\n\t<scale> is either \"C\" or \"F\"."   
					+ "\n\t<digits> is the number of digits to use right of decimal." 
			 + "\nExample: java Convert 67 F 2"    ); 
			System.exit(0);
			
		}
		
		
}