package stackDataStructure.linkedStack;

import stackDataStructure.arrayStack.Stack;

public class LinkedStack<E> implements Stack<E> {
	private Node<E> head = new Node<E>();//dummy node
	private int size;
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public E peek() {
		if (size == 0) {
			throw new java.util.EmptyStackException();
		}
		return head.prev.element;//top of stack
	}
	
	public E pop() {
		if (size == 0) {
			throw new java.util.EmptyStackException();
		}
		E element = head.prev.element;
		head.prev = head.prev.prev;
		head.prev.next = head;
		--size;
		return element;
	}
	
	public void push(E element) {
		head.prev = head.prev.next = new Node<E>(element, head.prev, head);
		++size;
	}
	
	
	public int size() {
		return size;
	}

	@Override
	public long[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

}
