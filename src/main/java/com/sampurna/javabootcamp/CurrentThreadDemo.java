package com.sampurna.javabootcamp;

public class CurrentThreadDemo extends Thread {

	public static void main(String[] args) {

		Thread t = Thread.currentThread();
		System.out.println("Current thread" + " " + t);

		// current thread name change
		System.out.println("Current thread name : " + t.getName());
		t.setName("My Thread");
		System.out.println("After name change " + t);

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");

		}

	}

}
