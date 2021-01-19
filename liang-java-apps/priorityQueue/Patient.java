package priorityQueue;

public class Patient implements Comparable<Patient> {
	//fields
	private String name;
	private int priority;
	
	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public String toString() {
		return name + "(priority:" + priority + ")\n";
	}
	
	public int compareTo(Patient patient) {
		return this.priority - patient.priority;
	}

}
