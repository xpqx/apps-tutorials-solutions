package ch10.employee.interfaces;

import ch10.employee.invoice.Invoice;

public class PayableInterfaceTest {

	public static void main(String[] args) {

		Payable[] payableObjects = new Payable[4];
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("01234", "tire", 4, 79.95);

		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 875.00);

		payableObjects[3] = new SalariedEmployee("Lisa", "Barnes", "888-11-1111", 1875.00);

		System.out.println(
				"Invoices and Employees processed polymorphically:\n" );

		for (Payable currentPayable:payableObjects) {
			System.out.printf("%s \n%s: $%,.2f\n\n", currentPayable.toString(), 
					"payment due", currentPayable.getPaymentAmount());
		}
	}
}

/*
Invoices and Employees processed polymorphically:

invoice: 
part number: 01234 (seat) 
quantity: 2 
price per item: $375.00 
payment due: $750.00

invoice: 
part number: 01234 (tire) 
quantity: 4 
price per item: $79.95 
payment due: $319.80

salaried employee: John Smith
social security number: 111-11-1111
weekly salary: $875.00 
payment due: $875.00

salaried employee: Lisa Barnes
social security number: 888-11-1111
weekly salary: $1,875.00 
payment due: $1,875.00




*/