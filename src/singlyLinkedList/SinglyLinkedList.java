package singlyLinkedList;

public class SinglyLinkedList {

	Node head;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(Node newNode) {
		newNode.nextNode = head;
		head = newNode;

	}

	public Node deleteFirst() {
		Node nodeToDelete = head;
		head = head.nextNode;
		return nodeToDelete;
	}

	public void displayList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.nextNode;
		}
	}

	public void insertLast(Node newNode) {
		Node currentNode = head;
		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}
		currentNode.nextNode = newNode;

	}
}
