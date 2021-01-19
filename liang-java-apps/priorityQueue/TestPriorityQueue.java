package priorityQueue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		Patient patient1 = new Patient("John", 2);
		Patient patient2 = new Patient("Jack", 1);
		Patient patient3 = new Patient("Jill", 5);
		Patient patient4 = new Patient("Joe", 7);
		Patient patient5 = new Patient("Jim", 9);
		Patient patient6 = new Patient("Jen", 15);
		
		MyPriorityQueue<Patient> priorityQueue = new MyPriorityQueue<>();
		
		priorityQueue.enqueue(patient1);
		priorityQueue.enqueue(patient2);
		priorityQueue.enqueue(patient3);
		priorityQueue.enqueue(patient4);
		priorityQueue.enqueue(patient5);
		priorityQueue.enqueue(patient6);
		
		while (priorityQueue.getSize() > 0)
			System.out.print(priorityQueue.dequeue() + " ");
	}

}
