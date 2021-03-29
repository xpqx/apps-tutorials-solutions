package c16;

import java.util.Scanner;
/*
 * OUTPUT
 * Enter first name: 
John)))
Enter last name: 
Jim***
Enter street address: 
hdhdgdg
Enter city: 
443333
Enter state: 
56
Enter Zip: 
jjkjgg
Enter Home Phone: 
thydhqwx

Validate Result: Invalid first name!

 * 
 * 
 */
public class EmployeeValidationTestDriver {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		System.out.println("Enter street address: ");
		String address = input.nextLine();
		System.out.println("Enter city: ");
		String city = input.nextLine();
		System.out.println("Enter state: ");
		String state = input.nextLine();
		System.out.println("Enter Zip: ");
		String zip = input.nextLine();
		System.out.println("Enter Home Phone: ");
		String homePhone = input.nextLine();
		
		System.out.print("\nValidate Result: ");
		
		
		if(!EmployeeValidationTest.validateFirstName(firstName))
			System.out.println("Invalid first name!");
		
			else if(!EmployeeValidationTest.validateLAstName(lastName))
			System.out.println("Invalid last name!");
		
			else if(!EmployeeValidationTest.validateAddress(address))
			System.out.println("Invalid address!");
		
			else if(!EmployeeValidationTest.validateCity(city))
			System.out.println("Invalid city!");
		
			else if(!EmployeeValidationTest.validateState(state))
			System.out.println("Invalid state!");
		
			else if(!EmployeeValidationTest.validateAddress(zip))
			System.out.println("Invalid zip!");
		
			else if (!EmployeeValidationTest.validateHomePhoneNumber(homePhone))
			System.out.println("Invalid Home Phone!");
			else 
				System.out.println("Valid Input! Thank you!");
	}

}
