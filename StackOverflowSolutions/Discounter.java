package javaQuestionsAndAnswers;

/*
 * Original problem found at this url: https://stackoverflow.com/questions/65387630/initialization-of-local-variables-within-a-method
 * I'm not too sure what the issue is here aside from minor code fixes. Maybe the user is still learning?
 * I did not investigate this code thoroughly, but it does compile without errors and returns a result.
 */
public class Discounter {
	public static void main(String[] args) {
		System.out.println("StackOverflow Problem and Solution");
		System.out.println(calc(100));
	} 
	public static double calc(double value) {
		double percent = 0;
		int coupon = 0, offset = 0, base = 0; //3
		if(percent <10){ //4
			coupon = 15;
			offset = 20;
			base = 10;
		}
		return coupon*offset*base*value/100; //5
	}
}
