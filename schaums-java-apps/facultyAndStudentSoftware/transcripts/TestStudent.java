package college.facultyAndStudentSoftware.transcripts;

import college.facultyAndStudentSoftware.Section;

public class TestStudent {
	public static void main(String[] args) {
		Student joe = new Student("Joe", true, 1983, "IT");
		joe.updateTranscript(new Section("CS211.02"), new Grade("A-"));
		joe.updateTranscript(new Section("EC110.07"), new Grade("B+"));
		joe.printTranscript();
	}