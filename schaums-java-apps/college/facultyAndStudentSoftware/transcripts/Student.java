package college.facultyAndStudentSoftware.transcripts;

import java.util.*;

import college.facultyAndStudentSoftware.Person;
import college.facultyAndStudentSoftware.Section;
public class Student extends Person { // Student inherits Person
	private String country; // Student aggregates String
	private int credits;
	private double gpa;
	private final Transcript transcript = new Transcript();
	public Student(String name, boolean male, int yob, String c) {
		super(name, male, yob);
		this.country = c;
	}
	public void updateTranscript(Section section, Grade grade) {
		transcript.add(section, grade);
	}
	public void printTranscript() {
		System.out.println(transcript);
	}
	private class Transcript { // composition
		Map map = new HashMap();
		void add(Section section, Grade grade) {
			map.put(section, grade);
		}
		public String toString() {
			return map.toString();
		}
	}
}
