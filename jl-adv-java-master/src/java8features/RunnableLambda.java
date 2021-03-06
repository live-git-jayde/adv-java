package java8features;

public class RunnableLambda {
	public static void main(String[] args) {
		// runnable with anonymous instance
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable with anonymous class");
			}
		};
		new Thread(runnable).start();

		// Functional Interface : Runnable
		// In oops you need a class to create an object
		// In fp you need a functional interface
		// Writing a lambda expression () -> {}
		Runnable runnable2 = () -> System.out.println("Running with lambda!");
		new Thread(runnable2).start();

		new Thread(() -> System.out.println("Wow, this is awesome")).start();

		new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println(i);
		}).start();

	}
//	public static void main(String[] args) {
//		// method 1
////		MyRunnable myRunnable = new MyRunnable();
////		Thread thread = new Thread(myRunnable);
////		thread.start();
//
//		// method 2
////		new Thread(new MyRunnable()).start();
//
//		// method 3
//		// anonymous class
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Child Thread!");
//			}
//		});
//		thread.start();
//
//		// method 4
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Child Thread!");
//			}
//		}).start();
//	}
}

//class MyRunnable implements Runnable {
//	public void run() {
//		System.out.println("Child Thread!");
//	}
//}
