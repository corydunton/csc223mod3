 package inner_class_ref;

// Simple program for you to run and learn how Inner Classes work

public class OuterClass {
	// Field in the outer class
	private String outerData = "Private Data from OuterClass";

	// Method in the outer class
	public void printFromOuter() {
		System.out.println("Printing from the outer class");
	}

	// Inner class definition
	private class InnerClass {
		// Field in inner class
		private int value;

		// Default constructor
		public InnerClass() {
		}

		// One argument constructor
		public InnerClass(int v) {
			value = v;
		}

		// Method in the inner class
		public void printFromInner() {
			System.out.println("\nPrinting from the inner class");
			System.out.println("The inner number is " + value);
			
			// Demonstrating Inner Class's access to private member of outer class:
			System.out.println("I'm an Inner Class but I can access " + outerData);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

	}

	public static void main(String[] args) {
		// Creating an instance of the outer class
		OuterClass outer = new OuterClass();

		// Creating an instance of the inner class using the outer class instance
		OuterClass.InnerClass inner1 = outer.new InnerClass(10);

		// Another way to create an instance of the inner class
		OuterClass.InnerClass inner2 = new OuterClass().new InnerClass(20);

		// Now let's run these print methods and see what happens!
		outer.printFromOuter();
		
		inner1.printFromInner();
		
		inner2.printFromInner();
	}
}
