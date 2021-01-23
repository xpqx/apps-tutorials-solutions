package ch10.bmi;

/*
 * OUTPUT
 * BMI for Kim Yang is 20.81 age is 18 status is: Normal Weight height is 70.0 weight is 145.0
BMI for Susan King is 31.75 age is 20 status is: Obese height is 69.0 weight is 215.0


 * 
 * 
 */


public class BMITestDriver {
	
	public static void main(String[] args) {
	
		BodyMassIndexChecker bmi1 = new BodyMassIndexChecker("Kim Yang", 18, 145, 70);
		
		System.out.println("BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " age is " + bmi1.getAge() + " "
				+ "status is: " + bmi1.getStatus() + " height is " + 
				bmi1.getHeight() + " weight is " 
				+  bmi1.getWeight() );
		
		BodyMassIndexChecker bmi2 = new BodyMassIndexChecker("Susan King", 215, 69);
		
		System.out.println("BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " age is " + bmi2.getAge() + " "
				+ "status is: " + bmi2.getStatus() + " height is " + 
				bmi2.getHeight() + " weight is " 
				+  bmi2.getWeight() );
		
	}
	

}
