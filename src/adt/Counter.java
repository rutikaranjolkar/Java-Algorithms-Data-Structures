package adt;

public class Counter {
	private String name;
	private int count = 0;

	public Counter(String str) {
		name = str;
	}

	public void increment() {
		count++;
	}

	public int getCurrentValue() {
		return count;
	}

	public String toString() {
		return ("The counter " + name + " has a count of " + count);

	}

}
