package singlyLinkedList;

public class SLLDemo {

	public static void main(String[] args) {
		SinglyLinkedList sl1 = new SinglyLinkedList();
		sl1.insertFirst(new Node(10));
		sl1.insertFirst(new Node(20));
		sl1.insertFirst(new Node(30));
		sl1.insertFirst(new Node(40));
		sl1.insertFirst(new Node(50));

		sl1.insertLast(new Node(999));

		sl1.displayList();
	}

}
