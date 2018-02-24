package adt;

public class Stack {
	private int maxSize;
	private int top_index;
	private int[] stackArray;

	public Stack(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top_index = -1; // initializing an empty stackarray
	}

	public void push(int num) {
		if (isFull()) {
			System.out.println("The stack is full!");
		} else {
			top_index++;
			stackArray[top_index] = num;
		}

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int n = stackArray[top_index];
			top_index--;
			return n;
		}

	}

	public boolean isEmpty() {
		return (top_index == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top_index);
	}

	public int peek() {
		return (stackArray[top_index]);
	}
}
