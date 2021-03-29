package ch10.employee.interfaces;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String first, String last, String ssn, double salary) {
		super(first, last, ssn);//pass to employee constructor
		setWeeklySalary(salary);

	}


	//set salary
	public void setWeeklySalary(double salary) {
		if (salary>= 0.0) {
			weeklySalary = salary;
		} else {
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		}//end method setWeeklySalary

	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public double getPaymentAmount() {
		return getWeeklySalary();
	}


	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}//end method toString


	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return 0;
	}





}
