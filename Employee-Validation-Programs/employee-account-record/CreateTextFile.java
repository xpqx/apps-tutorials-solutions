package deitel.ch17;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	
	private Formatter output;
	EmployeeAccountRecord record;
	Scanner input;
	
	
	public void openFile() {
		
		try {
			output = new Formatter("clients.txt");
		}
		catch (SecurityException securityException) {
			System.err.println("You do not have write access to this file.");
			System.exit(1);
		}
		catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error opening or creating file.");
			System.exit(1);
		}
	}
	
	
	public void addRecord() {
		record = new EmployeeAccountRecord();
		input = new Scanner(System.in);
		
		System.out.printf("%s\n%s\n%s\n%s\n\n", 
				"To terminate input, type the end of file indicator",
				"when you are prompted to enter input.",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows tye <ctrl> z then press Enter");
		
		System.out.printf("%s\n%s", "Enter account number (>0), first name, last name, and balance.", "? ");
		
		while(input.hasNext() ) {
			try {
				record.setAccount(input.nextInt() );
				record.setFirstName(input.next() );
				record.setLastName(input.next() );
				record.setBalance(input.nextDouble() );
				
				if (record.getAccount() > 0 ) {
					output.format("%d %s %s %.2f\n", record.getAccount(), record.getFirstName(), 
							record.getLastName(), record.getBalance() );
				}
				else {
					System.out.println("Account number must be greater than 0.");
				}
			}
			catch (FormatterClosedException formatterClosedException) {
				System.err.println("Error writing to file.");
				return;
			}
			catch (NoSuchElementException elementException) {
				System.err.println("Invalid input. Please try again!");
				input.hasNextLine();
			}
			System.out.printf("%s %s\n%s", "Enter account number ( > 0),",
					 "first name, last name and balance.", "? ");
		}
	}
	public void closeFile() {
		if (output != null)
			output.close();
	}
	

}
