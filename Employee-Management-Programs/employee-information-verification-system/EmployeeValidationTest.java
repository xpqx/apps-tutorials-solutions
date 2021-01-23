package deitel.ch16;

public class EmployeeValidationTest {
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");
	}
	
	public static boolean validateLAstName(String lastName) {
		return lastName.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
	}
	
	public static boolean validateAddress( String address ) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
	}
	
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+) ");
	}
	
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+) ");
	}
	
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");
	}
	
	public static boolean validateHomePhoneNumber(String homePhone) {
		return homePhone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	}
	
	

}
