package temp.converter1;

import temp.interfaces.Temperature;

public class MyTemperature implements Temperature {
	
	private double celsius;
	
	public MyTemperature(double value, char scale) {//begin constructor
		if (scale == 'C') 
			setCelsius(value);
		if (scale == 'F')
			setFahrenheit(value);
		else
			setKelvin(value);
	}//end constructor
	
	
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
		return 9*celsius/5 + 32.0;
	}
	
	public void setKelvin(double kelvin) {
		this.celsius = kelvin - 273.16;
	}
	
	public double getKelvin() {
		return celsius + 273.16;
	}
	
	public String toString() {
		return round(getCelsius()) + " C = "
				+ round(getFahrenheit()) + "F=" 
						+ round(getKelvin()) + "K " ;
	}
	
	private static double round(double x) {
		return Math.round(10*x)/10.0;
	}
}
