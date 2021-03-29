package ch3.account;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double depositAmount;
		
		Account myAccount1 = new Account(500.00);
		Account myAccount2 = new Account(34.50);
		Account myAccount3 = new Account(400.25);
		Account myAccount4 = new Account(789.99);
		Account myAccount5 = new Account(234.20);
		
		System.out.println("Initial Balances on the Accounts Before Deposits");
		System.out.println();
		System.out.printf("account1 balance: $%.2f\n", myAccount1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount2.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount3.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount4.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount5.getBalance());
		
	
		System.out.print("Enter deposit amount for account1: " );
		depositAmount = input.nextDouble();
		myAccount1.credit(depositAmount);
		
		System.out.print("Enter deposit amount for account2: " );
		depositAmount = input.nextDouble();
		myAccount2.credit(depositAmount);
		
		System.out.print("Enter deposit amount for account3: " );
		depositAmount = input.nextDouble();
		myAccount3.credit(depositAmount);
		
		System.out.print("Enter deposit amount for account4: " );
		depositAmount = input.nextDouble();
		myAccount4.credit(depositAmount);
		
		System.out.print("Enter deposit amount for account5: " );
		depositAmount = input.nextDouble();
		myAccount5.credit(depositAmount);
		
		
		
		System.out.println("New Balances on the Accounts After Deposits");
		System.out.println();
		System.out.printf("account1 balance: $%.2f\n", myAccount1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount2.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount3.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount4.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", myAccount5.getBalance());
	
	}

}

/*

Initial Balances on the Accounts Before Deposits

account1 balance: $500.00
account2 balance: $34.50

account2 balance: $400.25

account2 balance: $789.99

account2 balance: $234.20

Enter deposit amount for account1: 100
Enter deposit amount for account2: 100
Enter deposit amount for account3: 100
Enter deposit amount for account4: 100
Enter deposit amount for account5: 100
New Balances on the Accounts After Deposits

account1 balance: $600.00
account2 balance: $134.50

account2 balance: $500.25

account2 balance: $889.99

account2 balance: $334.20




*/