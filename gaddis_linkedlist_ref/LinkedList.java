package gaddis_linkedlist_ref;

public class LinkedList {
	// Reference to the first node in the list
	private Node first = null;

	/**
	 * The Node inner class represents a list node.
	 */
	private class Node {
		String value;
		Node next;

		/**
		 * Node Constructor 1.
		 * 
		 * @param val The element to store in this node.
		 * @param n   The reference to the next node.
		 */

		Node(String val, Node n) {
			value = val;
			next = n;
		}

		/**
		 * Node Constructor 2.
		 * 
		 * @param val The element to store in this node.
		 */

		Node(String val) {
			value = val;
			next = null;
		}
	}

	/**
	 * LinkedList outer class constructor // sample code provided for demonstration
	 * purposes
	 */
	public LinkedList() {
		// Incrementally build the list to contain: Chuck Debby Elaine Fred
		first = new Node("Debby");
		first.next = new Node("Elaine");
		first.next.next = new Node("Fred");
		first = new Node("Chuck", first);

		// Use a loop to add all names in an array to the
		// front of the linked list to build the list
		String[] names = { "Bob", "Allan" };
		for (String s : names)
			first = new Node(s, first);
	}

	/**
	 * Add a String to the end of the list
	 * 
	 * @param team
	 */
	public void add(String val) {
		if (this.first == null) {
			this.first = new Node(val);
		} else {
			Node ref = first;
			while (ref.next != null) { // Loop until you find the last node
				ref = ref.next;
			}
			ref.next = new Node(val);
		}
	}

	/**
	 * The print method traverses the list and prints all of its elements.
	 */
	public void print() {
		Node ref = first;
		while (ref != null) {
			System.out.println(ref.value + " ");
			ref = ref.next;
		}
	}

	/**
	 * The main method creates the linked list and invokes its print method.
	 */
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		String str = "The contents of the list are:";
		System.out.println(str);
		ll.print();
	}
}