package college.facultyAndStudentSoftware;

import java.util.*;
public class Instructor extends Person {
	protected String dept;
	protected String office;
	protected String tel;
	public Instructor(String name, String id, String sex, int yob) {
		super(name, id, sex, yob);
	}
	public String getDept() {
		return office;
	}
	public String getOffice() {
		return office;
	}

	public String getTel() {
		return tel;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String toString() {
		String s = super.toString();
		if (dept != null) s += ", " + dept;
		if (office != null) s += ", " + office;
		if (tel != null) s += " (" + tel + ")";
		return s;
	}
	public static void main(String[] args) {
		Instructor knuth = new Instructor("Don Knuth","8122063","M",1938);
		System.out.println(knuth);
		knuth.setDept("CS");
		System.out.println(knuth);
	}
}