package ch10.employee;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;

	//begin five arg constructor
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
		super(first, last, ssn);
		setGrossSales(sales);
		setCommissionRate(rate);
	}//end five arg constructor

	public void setCommissionRate(double rate) {
		if (rate > 0.0 && rate < 1.0) {
			commissionRate = rate;
		} else {
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		}
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double sales) {
		if (sales >= 0.0) {
			grossSales = sales;
		} else {
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}


	public String toString() {
		return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", 
				"commission employee", super.toString(), 
				"gross sales", getGrossSales(), 
				"commission rate", getCommissionRate());
	}

}
