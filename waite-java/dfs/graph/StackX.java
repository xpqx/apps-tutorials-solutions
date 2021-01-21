package ch13.dfs.graph;

public class StackX {
	
	private final int SIZE = 20;
	private int[] myStack;
	private int top;
	
	public StackX() {
		myStack = new int[SIZE];
		top = -1;
	}
	
	public void push(int j) {
		myStack[++top] = j;
	}
	
	public int pop() {
		return myStack[top--];
	}
	
	public int peek() {
		return myStack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
}
