package deitel.ch17;


/*
 * OUTPUT
 * To terminate input, type the end of file indicator
when you are prompted to enter input.
On UNIX/Linux/Mac OS X type <ctrl> d then press Enter
On Windows tye <ctrl> z then press Enter

Enter account number (>0), first name, last name, and balance.
? 23
Jake
Jan
200
Enter account number (>0), first name, last name and balance.
? 24 Steve Doe 345.67
Enter account number (>0), first name, last name and balance.
? 300 Pam White 42.16
Enter account number (>0), first name, last name and balance.
? 500 Sue Rich 2234.65
Enter account number (>0), first name, last name and balance.
? 
 * 
 * 
 */
public class EmployeeAccountRecord {
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public EmployeeAccountRecord() {
		this(0, "", "", 0.0);
	}
	
	public EmployeeAccountRecord(int acct, String first, String last, double bal) {
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setBalance(bal);
	}

	public void setAccount(int acct) {
		account = acct;
	}
	
	public int getAccount() {
		return account;
	}
	
	public void setFirstName(String first) {
		firstName = first;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String last) {
		lastName = last;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public double getBalance() {
		return balance;
	}
	
	

}
