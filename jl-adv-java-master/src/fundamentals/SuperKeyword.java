package fundamentals;

public class SuperKeyword {
	public static void main(String[] args) {
		Derived derived = new Derived(10);
		derived.display();
	}
}

class Base {
	public Base() {
		System.out.println("Base");
	}

	public Base(int i) {
		System.out.println("Base with i");
	}

	public void display() {
		System.out.println("Base display");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived");
	}

	public Derived(int i) {
		// super(10);
		System.out.println("derived with i");
	}

	public void display() {
		super.display();
		System.out.println("Derived display");
	}
}