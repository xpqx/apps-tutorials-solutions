package ch9;

public class BasePlusCommissionEmployeeTest {
	public static void main(String[] args) {
		
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob", "Lewis",
				"323-55-1234", 5000, .04, 300);
		
		// get base-salaried commission employee data
		 System.out.println(
		 "Employee information obtained by get methods: \n" );
		 System.out.printf( "%s %s\n", "First name is", employee.getFirstName());
		 
		 System.out.printf( "%s %s\n", "Last name is", employee.getLastName());
		 
		 System.out.printf( "%s %s\n", "Social security number is", employee.getSocialSecurityNumber());
		 System.out.printf( "%s %.2f\n", "Gross sales is", employee.getGrossSales());
		 System.out.printf( "%s %.2f\n", "Commission rate is", employee.getCommissionRate());
		 System.out.printf( "%s %.2f\n", "Base salary is", employee.getBaseSalary());
		 System.out.println();
		 System.out.println();
		 System.out.println("Setting the base salary of the employee!");
		 System.out.println();
		 System.out.println();
		 System.out.printf( "%s %.2f\n", "Base salary is", employee.getBaseSalary());
		 
		 employee.setBaseSalary(1000);
		 
		 System.out.printf("\n%s:\n\n%s\n", "Updated employee information", employee.toString() );
	}

}
