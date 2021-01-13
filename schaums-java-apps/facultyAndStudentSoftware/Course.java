package college.facultyAndStudentSoftware;

public class Course {
	
	private float credit;
	private String dept;
	private String id;
	private String name;
	private Section[] sections = new Section[1000];
	
	public Course(String dept, String id, String name, float credit) {
		this.credit = credit;
		this.dept = dept;
		this.id = id;
		this.name = name;
	}
	
	public void add(Section section) {
		int i = 0;
		while (sections[i] != null)
			++i;
		sections[i] = section;
	}
	
	public String toString() {
		String s = dept + " " + id + "\' '" + name + "\", " + credit + " credits";
		for (int i = 0; sections[i] != null; i++)
			s+= sections[i];
		return s;
	}
	
	public static void main(String[] args) {
		Course course = new Course("CMSC", "221", "Data Structures", 4);
		System.out.println(course);
	}
}
