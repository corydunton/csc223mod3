package edu.vwcc.football;

import java.util.Scanner;
import LinkedListPractice.Link;

public class FootballLL {
	// Reference to the first node in the list
	private Node first = null;

	/**
	 * The Node inner class represents a list node.
	 */
	private class Node {
		Team nickname;
		Node next;

		/**
		 * Node Constructor 1.
		 * 
		 * @param val The element to store in this node.
		 * @param n   The reference to the next node.
		 */

		Node(Team val, Node n) {
			nickname = val;
			next = n;
		}

		/**
		 * Node Constructor 2.
		 * 
		 * @param val The element to store in this node.
		 */

		Node(Team val) {
			nickname = val;
			next = null;
		}
	}

	/**
	 * LinkedList outer class constructor // sample code provided for demonstration
	 * purposes
	 */
//	public FootballLL() {
//		// Incrementally build the list to contain: Chuck Debby Elaine Fred
//		first = new Node("Debby");
//		first.next = new Node("Elaine");
//		first.next.next = new Node("Fred");
//		first = new Node("Chuck", first);
//
//		// Use a loop to add all names in an array to the
//		// front of the linked list to build the list
//		String[] names = { "Bob", "Allan" };
//		for (String s : names)
//			first = new Node(s, first);
//	}

	/**
	 * Add a String to the end of the list
	 * 
	 * @param team
	 */
	public void add(Team val) {
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
			System.out.println(ref.nickname + " ");
			ref = ref.next;
		}
	}

	/**
	 * The main method creates the linked list and invokes its print method.
	 */
	public static void main(String[] args) {
		FootballLL ll = new FootballLL();
		int value;
		while (true) {
			value = menu();
			switch (value) {
			case 1 -> {
				System.out.println("Loaded!");
				load(ll);
			}
			case 2 -> {
				System.out.println("The members of the list are:");
				ll.print();
			}
			case 3 -> {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Team nickname: ");
				String nickname = input.nextLine();
				Team t = ll.find(nickname);
				System.out.println(t == null ? "That team is not in our database" : t.toString());
			}
			case 4 -> {
				Team t = ll.mostWins();
				System.out.println(t.toString());
			}
			case 5 -> {
				Team t = ll.worstWinPct();
				System.out.println(t.toString() + " with a winning percentage of " + t.winningPercentage());
			}
			case 6 -> ll.printOrdered();
			case 0 -> {
				System.out.println("Exiting…");
				System.exit(0);
			}
			default -> System.out.println("Invalid option.");
			}
		}
	}

	public static int menu() {
		System.out.println("╔══════════════════════════════════╗");
		System.out.println("║    NFL 2022 Season Standings     ║");
		System.out.println("╚══════════════════════════════════╝");
		Scanner scan = new Scanner(System.in);
		System.out.println("\n1.  Load the data");
		System.out.println("2.  Print the data");
		System.out.println("3.  Find a team");
		System.out.println("4.  Find the team with the most wins");
		System.out.println("5.  Team with the worst win percentage");
		System.out.println("6.  Print the teams out by most wins to least wins");
		System.out.println("0. Exit program \n");
		System.out.println("Choice:\n");
		int choice = scan.nextInt();
		return choice;
	}

	public static void load(FootballLL ll) {
		ll.add(new Team("Cowboys", 12, 5));
		ll.add(new Team("Packers", 8, 9));
		ll.add(new Team("Patriots", 8, 9));
		ll.add(new Team("Browns", 7, 10));
		ll.add(new Team("Chargers", 10, 7));
		ll.add(new Team("Eagles", 15, 3));
		ll.add(new Team("Falcons", 7, 10));
		ll.add(new Team("Commanders", 8, 8));
		ll.add(new Team("Raiders", 6, 11));
		ll.add(new Team("Cardinals", 4, 13));
		ll.add(new Team("Ravens", 10, 7));
		ll.add(new Team("Bills", 13, 3));
		ll.add(new Team("Panthers", 7, 10));
		ll.add(new Team("Bears", 3, 14));
		ll.add(new Team("Bengals", 12, 4));
		ll.add(new Team("Broncos", 5, 12));
		ll.add(new Team("Lions", 9, 8));
		ll.add(new Team("Colts", 4, 12));
		ll.add(new Team("Jaguars", 9, 8));
		ll.add(new Team("Chiefs", 14, 3));
		ll.add(new Team("Rams", 5, 12));
		ll.add(new Team("Dolphins", 9, 8));
		ll.add(new Team("Vikings", 13, 4));
		ll.add(new Team("Saints", 7, 10));
		ll.add(new Team("Giants", 9, 7));
		ll.add(new Team("Jets", 7, 10));
		ll.add(new Team("Steelers", 9, 8));
		ll.add(new Team("49ers", 13, 4));
		ll.add(new Team("Seahawks", 9, 8));
		ll.add(new Team("Buccaneers", 8, 9));
		ll.add(new Team("Titans", 7, 10));
	}

	// TODO return the Team or null if not found
	public Link find(Team nickname) {
		Node ref = first;
		while (ref != null) {
			System.out.println(ref.nickname + " ");
			ref = ref.next;
		}
		
		return first;

//		if (!isEmpty()) {
//			while (theLink.bookName != bookName) {
//				if (theLink.next == null) {
//					return null;
//				} else {
//					theLink = theLink.next;
//				}
//			}
//		} else {
//			System.out.println("Empty LinkedList");
//		}
//
//		return theLink;
	}
	
	// TODO return the team with the most wins. Very similar to find()
	public Link mostWins(Team nickname) {
		Node ref = first;
		while (ref != null) {
			System.out.println(ref.nickname + " ");
			ref = ref.next;
		}
		
		return first;
	}
	
	// TODO return the team with the worst winning percentage
	// Similar to the two above. Note that the Team class provides a winning percentage method
	public int worstWinPct(Team nickname) {
		return 0;
	}
	
	// TODO print out the linked list from most to least wins
	// Implement Comparable on the Team. Have the method copy each item into an ArrayList
	// Collections.sort() on ArrayList
	public void printOrdered() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}