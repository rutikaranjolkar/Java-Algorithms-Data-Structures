package adt;

public class CounterDemo {

	public static void main(String[] args) {
		Counter c1 = new Counter("Rutika's Counter");

		System.out.println(c1.toString());
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		int val2 = c1.getCurrentValue();
		System.out.println("val2 = " + val2);
		System.out.println(c1.toString());
	}

}
