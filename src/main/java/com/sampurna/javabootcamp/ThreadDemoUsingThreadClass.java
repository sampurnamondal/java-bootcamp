package com.sampurna.javabootcamp;

public class ThreadDemoUsingThreadClass {

	public static void main(String[] args) {
		DemoThread1 demoThread = new DemoThread1("ChildThread");
		demoThread.start();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Exiting Main thread");

	}

}

class DemoThread1 extends Thread {

	DemoThread1(String name) {
		super(name);
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
