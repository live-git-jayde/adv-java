package multithreading;

//Process is Ramas Last wish to eat pizza and drink coke.
public class MultiThreadedProgram_Rama {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Begins!");
		System.out.println("Rama begins the party!");
		ChildThreadForeLeg1 thread2 = new ChildThreadForeLeg1();
		thread2.start();
		ChildThreadForeLeg2 thread3 = new ChildThreadForeLeg2();
		thread3.start();
		// thread3.stop();
		System.out.println("Rama walks away in bliss!");
//		for (int i = 0; i < 10000; i++) {
////			for (int ij = 0; ij < 10000; ij++) {
////
////			}
//		}
		// System.out.println("Main Thread may possible end now!");
		// thread2.join();
		// thread3.join();
		System.out.println("This gets executed after the child thread completes!");
		System.out.println("Main Thread definitely ends now!");
	}
}

class ChildThreadForeLeg1 extends Thread {
//	public ChildThreadForeLeg1() {
//		System.out.println("Cons");
//	}

	public void run() {
		System.out.println("Drink Coke");
		drinkCoke();
	}

	public void drinkCoke() {
		System.out.println("Rama wonders how to open the bottle....");
		System.out.println("Rama barks and the waiter opens the bottle");
		System.out.println("Rama drinks the coke");
		System.out.println("Rama pays the bill through credit card which is attached to his collar...");
	}
}

class ChildThreadForeLeg2 extends java.lang.Thread {
	public void run() {
		eatPizza();
	}

	public void eatPizza() {
		System.out.println("Smells The Pizza");
		System.out.println("Thoughts ::: What a treat today...");
		System.out.println("Pounce and eat");
		System.out.println("Looks aroung and sees Deva too a pizaa... says Hi Deva");

	}
}