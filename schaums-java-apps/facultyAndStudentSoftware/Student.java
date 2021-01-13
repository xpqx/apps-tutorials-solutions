package college.facultyAndStudentSoftware;

import java.util.List;

public class Student extends Person {
	
	protected String country;
	protected int credits;
	protected double gpa;
	
	public Student(String name, String id, String s, int y, String c) {
		super(name, id, s, y);
		this.country = c;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public double getGpa() {
			return gpa;
		}
	
	public String getCountry() {
		return country;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void setCountry(List record) {
		this.country = country;
	}
	
	public static void main(String[] args) {
		Student student = new Student("Anne Miller", "200491", "F", 1985, "US");
		System.out.println(student);
	}
	
	
	}


