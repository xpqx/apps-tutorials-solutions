package ch10.employee;

public class PayrollSystemTest {
	public static void main(String[] args) {
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 3000);
		
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-2322", 10000, .06);
		
		System.out.println( "Employees processed individually:\n" );
		
		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings() );
		
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings() );
		
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings() );
		
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings() );
		
		Employee[] employees = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		
		System.out.println("Employees Processed Polymorphically:\n");
		
		
		for(Employee currentEmployee:employees) {
			
			System.out.println(currentEmployee);
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
			}
			
			System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
		}//end for
		
		//get type name of each object in employees array
		for (int j = 0; j < employees.length;j++) {
			System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
		}
		
		
	}

}


/*
 * OUTPUT
 * Employees processed individually:

salaried employee: John Smith
social security number: 111-11-1111
weekly salary: $800.00
earned: $800.00

hourly employee: Karen Price
social security number: 222-22-2222
hourly wage: $16.75; hours worked: 40.00
earned: $670.00

commission employee: Sue Jones
social security number: 333-33-2322
gross sales: $10,000.00; commission rate: 0.06
earned: $600.00

base-salaried commission employee: Bob Lewis
social security number: 444-44-4444
gross sales: $5,000.00; commission rate: 0.04; base salary: $3,000.00
earned: $3,200.00

Employees Processed Polymorphically:

salaried employee: John Smith
social security number: 111-11-1111
weekly salary: $800.00
earned $800.00

hourly employee: Karen Price
social security number: 222-22-2222
hourly wage: $16.75; hours worked: 40.00
earned $670.00

commission employee: Sue Jones
social security number: 333-33-2322
gross sales: $10,000.00; commission rate: 0.06
earned $600.00

base-salaried commission employee: Bob Lewis
social security number: 444-44-4444
gross sales: $5,000.00; commission rate: 0.04; base salary: $3,000.00
new base salary with 10% increase is: $3,300.00
earned $3,500.00

Employee 0 is a ch10.employee.SalariedEmployee
Employee 1 is a ch10.employee.HourlyEmployee
Employee 2 is a ch10.employee.CommissionEmployee
Employee 3 is a ch10.employee.BasePlusCommissionEmployee

 * 
 * 
 * 
 * 
 * 
 * */
 