package college.facultyAndStudentSoftware;

public class Section {
	private Course course;
	private String place;
	private String term;
	private String time;
	private Instructor instructor;
	private Student[] students;
	
	
	public Section(String term, String p, String t, Course course) {
		this.course = course;
		this.term = term;
		this.place = p;
		this.time = t;
	}
	
	public Course getCourse() {
		return course;
	}
	
	public String getPlace() {
		return place;
	}
	
	public String getTerm() {
		return time;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void setTerm(String term) {
		this.term = term;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public void setStudents(Student[] students) {
		int n = students.length;
		this.students = new Student[n];
		for (int i = 0; i < n; i++)
			this.students[i] = students[i];
	}
	
	public String toString() {
		return course + ": " + term + ", " + place + ", " + time + ", " + instructor; 
	}
}
