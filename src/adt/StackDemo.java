package adt;

public class StackDemo {

	public static void main(String[] args) {
		/*Stack s1 = new Stack(10);
		s1.push(20);
		s1.push(40);
		s1.push(60);
		s1.push(80);

		while (!s1.isEmpty()) {
			int n = s1.pop();
			System.out.println(n);
		}*/

		StackString ss1 = new StackString("Rutika");
		while (!ss1.isEmpty()) {
			System.out.println(ss1.pop());
		}

	}

}
