package LinkedListPractice;

public class Link {

	public String bookName;
	public int millionsSold;

	public Link next;

	public Link(String bookName, int millionsSold) {
		this.bookName = bookName;
		this.millionsSold = millionsSold;
	}

	public void display() {
		System.out.println(bookName + ": " + millionsSold + ",000,000");
	}
	
	public String toString() {
		return bookName;
	}

	public static void main(String[] args) {
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("Don Quixote", 500);
		theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
		theLinkedList.insertFirstLink("The Lord of the Rings", 150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);
		
		theLinkedList.removeFirst();
		
		System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " was found");
		
		theLinkedList.removeLink("The Lord of the Rings");
		theLinkedList.display();
	}

}

class LinkList {

	public Link firstLink;
	
	LinkList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return (firstLink == null);
	}
	
	/* How is a new Link added?
	 * 1) New Link is created
	 * 2) Its Next is assigned the reference to the previous Link created
	 * 3) The LinkedList's firstLink is assigned a reference to the newest Link added
	 */
	public void insertFirstLink(String bookName, int millionsSold) {
		Link newLink = new Link(bookName, millionsSold);		
		newLink.next = firstLink;		
		firstLink = newLink;
	}
	
	/* How is a Link removed?
	 * 1) The LinkedList's firstLink is assigned the value of the current firstLink's next
	 * 2) That's it 
	 */
	public Link removeFirst() {
		Link linkReference = firstLink;
		
		if(!isEmpty()) {
			firstLink = firstLink.next;
		} else {
			System.out.println("Empty LinkedList");
		}
		
		return linkReference;		
	}
	
	/* How do you cycle throgh all the Links?
	 * 1) Start at the reference stored in firstLink for the LinkedList
	 * 2) Get the references stored in next for every Link until next returns null 
	 */
	public void display() {
		Link theLink = firstLink;
		
		while (theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}
	
	/* How do you find a Link in a LinkedList?
	 * 1) Check the data for the firstLink reference stored in the LinkedList
	 * 2) If you don't get a match, continue searching every reference stored in next until next returns null 
	 */
	public Link find(String bookName) {
		Link theLink = firstLink;
		
		if (!isEmpty()) {
			while (theLink.bookName != bookName) {
				if (theLink.next == null) {
					return null;
				} else {
					theLink = theLink.next;
				}
			}
		} else {
			System.out.println("Empty LinkedList");
		}
		
		return theLink;
	}
	
	/* How do you remove a specific Link?
	 * 1) Cycle through all Links until there is a match
	 * 2) If the referenced Link stored in the LinkedList's firstLink matches
	 * 		- Store the reference next in firstLink as firstLink
	 * 3) If a match occurs elsewhere, find the Link thats next equals the reference to remove
	 * 4) Get the reference named next in the Link to remove and assign it to the Link above
	 */
	public Link removeLink(String bookName) {
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		while (currentLink.bookName != bookName) {
			if (currentLink.next == null) {
				return null;
			} else {
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
		}
		
		if (currentLink == firstLink) {
			firstLink = firstLink.next;
		} else {
			previousLink.next = currentLink.next;
		}
		
		return currentLink;
	}
	
	
	
	
	
	
	
}
