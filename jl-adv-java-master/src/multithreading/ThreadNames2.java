//package multithreading;
//
//public class ThreadNames2 {
//	public static void main(String[] args) {
//		TestThread testThread = new TestThread();
//		// testThread.run();
//		testThread.start();
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("The Main Thread");
//		System.out.println(Thread.currentThread().getName());
//
//		TestThread testThread1 = new TestThread();
//		System.out.println(testThread1.getName());
//		testThread1.setName("Child Thread 1");
//		System.out.println(testThread1.getName());
//		// testThread.run();
//		testThread1.start();
////		for (int i = 0; i < 100; i++) {
////			System.out.println("Main " + i);
////		}
//	}
//}
//
//class TestThread extends Thread {
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
////		for (int i = 0; i < 100; i++) {
////			System.out.println("Child " + i);
////		}
//	}
//}