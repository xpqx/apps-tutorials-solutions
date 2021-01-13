package college.facultyAndStudentSoftware;

import java.util.*;

public class Person {
	
	public static void main(String[] args) {
		Person grandson = new Person("C. Hubbard", "1.2.1", "M", 2002);
		System.out.println(grandson);
		 grandson.setEmail("abced@fgh.ijk");
		 System.out.println(grandson);
		 System.out.println("\t name: " + grandson.name);
		 System.out.println("\t id: " + grandson.id);
		 System.out.println("\t sex: "+ (grandson.male?"male":"female"));
		 System.out.println("\temail: " + grandson.email);
		 System.out.println("\t yob: " + grandson.yob);
	}
	
	protected int yob;
	protected String email;
	protected String id;
	protected boolean male;
	protected String name;
	
	public Person(String name, String id, String sex, int yob) {
		this.id = id;
		this.male = (sex.substring(0, 1).toUpperCase() == "M");
		this.name = name;
		this.yob = yob;
	}
	
	public Person(String name2, boolean male2, int yob2) {
		this.name = name2;
		this.yob = yob2;
		// TODO Auto-generated constructor stub
	}

	
	public int getYob() {
		return yob;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean isMale() {
		return male;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		String string = name + ", " + id;
		if (male) 
			string += " (M)";
		else string += " (F)";
		
		if (email != null)
			string += ", " + email;
		string += " (" + yob + ")";
		return string;
	}
	
	
	
	
	
	

}
