package multithreading;

public class CallingRun {
	public static void main(String[] args) {
		TestThread testThread = new TestThread();
		testThread.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main " + i);
		}
	}
}

class TestThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 100; i++) {
			System.out.println("Child " + i);
		}
	}
}