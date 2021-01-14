package test.phoneChecker;

public class Person {

	private final boolean male;
	private final String name;
	private final Phone phone;
	private final int yob;

	public Person(String name, boolean male, int yob, Phone phone) {
		this.name = name;
		this.male = male;
		this.yob = yob;
		this.phone = new Phone(phone);
	}

	public String getName() {
		return name;
	}
	public Phone getPhone() {
		return phone;
	}
	public int getYob() {
		return yob;
	}
	public boolean isMale() {
		return male;
	}
	public String toString() {
		return (male?"Mr. ":"Ms. ") + name+" ("+yob+"), tel. "+phone;
	}

	public static void main(String[] args) {
		
		Phone tel = new Phone("808", "4561414");
		
		Person person1 = new Person("H. K. Jojkuil", true, 1901, tel);
		
		System.out.println(person1);
		
		tel.setAreaCode("202");
		
		System.out.println(person1);
	}
}
