package adt;

public class StackString {

	private int maxSize;
	private int top_index;
	private char[] stackArray;

	public StackString(String word) {
		maxSize = word.length();
		stackArray = new char[maxSize];
		top_index = -1; // initializing an empty stackarray
		for (int i = 0; i < maxSize; i++) {
			char c = word.charAt(i);
			push(c);

		}

	}

	public void push(char c) {
		if (isFull()) {
			System.out.println("The stack is full!");
		} else {
			top_index++;
			stackArray[top_index] = c;
		}

	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return 'o';
		} else {
			char c = stackArray[top_index];
			top_index--;
			return c;
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
