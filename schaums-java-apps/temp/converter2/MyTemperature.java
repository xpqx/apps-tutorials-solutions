package temp.converter2;

import temp.interfaces.Temperature;

public class MyTemperature implements Temperature {
	
	private double celsius;
	private int digits;
	public MyTemperature(double value, char scale, int digits) {
		if (scale=='C')
			setCelsius(value);
		else
			setFahrenheit(value);
		this.digits = digits;
	}
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}
	
	public void setFahrenheit(double fahrenheit) {
		this.celsius = 5* (fahrenheit - 32)/9;
	}
	
	public double getFahrenheit() {
		return 9* celsius/5 + 32.0;
	}
	
	public String toString() {
		return round(getCelsius()) + "C = " + round(getFahrenheit()) + "F";
	}
	
	private double round(double x) {
		double p = Math.pow(10, digits);
		return Math.round(p* x)/p;
	}

	@Override
	public double getKelvin() {
		// TODO Auto-generated method stub
		return celsius + 273.16;
	}

	@Override
	public void setKelvin(double kelvin) {
		this.celsius = kelvin - 273.16;
		
	}
}
