package ch3;

public class GradeBookTest {
	public static void main(String[] args) {
		GradeBook myGradeBook1 = new GradeBook("Welcome to Java Level 1 Programming");
		GradeBook myGradeBook2 = new GradeBook("Welcome to Java Level 2 Programming");
		GradeBook myGradeBook3 = new GradeBook("Welcome to Java Level 3 Programming");
		GradeBook myGradeBook4 = new GradeBook("Welcome to Java Level 4 Programming");
		GradeBook myGradeBook5 = new GradeBook("Welcome to Java Level 5 Programming");
	
	System.out.printf("grade book course name is: %s\n", myGradeBook1.getCourseName());
	System.out.printf("grade book course name is: %s\n", myGradeBook2.getCourseName());
	System.out.printf("grade book course name is: %s\n", myGradeBook3.getCourseName());
	System.out.printf("grade book course name is: %s\n", myGradeBook4.getCourseName());
	System.out.printf("grade book course name is: %s\n", myGradeBook5.getCourseName());
	
	}

}

/*
grade book course name is: Welcome to Java Level 1 Programming
grade book course name is: Welcome to Java Level 2 Programming
grade book course name is: Welcome to Java Level 3 Programming
grade book course name is: Welcome to Java Level 4 Programming
grade book course name is: Welcome to Java Level 5 Programming

*/