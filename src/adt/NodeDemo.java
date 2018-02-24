package adt;

public class NodeDemo {

	public static void main(String[] args) {
		Node nodeA = new Node(10);
		Node nodeB = new Node(20);
		Node nodeC = new Node(30);
		Node nodeD = new Node(40);

		nodeA.nextNode = nodeB;
		nodeB.nextNode = nodeC;
		nodeC.nextNode = nodeD;

		System.out.println(lengthOfNodes(nodeA));
	}

	// To count the number of nodes following a given node:

	public static int lengthOfNodes(Node node) {
		int count = 0;
		while (node.nextNode != null) {
			node = node.nextNode;
			count++;
		}
		return count;
	}

}
