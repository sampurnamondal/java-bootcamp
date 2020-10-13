package com.sampurna.javabootcamp;

public class RunnableDemo {

	public static void main(String[] args) {
		Runnable myRunnable = new MyRunnable();

		Runnable runnable2 = () -> {
			System.out.println("Runnable inside lambda");
		};

		Thread thread1 = new Thread(myRunnable, "Thread 1");
		System.out.println(thread1.getName());
		thread1.start();

		try {
			thread1.join();
			Thread thread2 = new Thread(new Runnable() {
				public void run() {
					System.out.println("Implementing from anonymous class");
				}
			}, "Thread 2");
			System.out.println(thread2.getName());
			thread2.start();
			
			try {
				thread2.join();
				Thread thread3 = new Thread(runnable2, "Thread 3");
				System.out.println(thread3.getName());
				thread3.start();
			} catch (InterruptedException e) {
			}
			
		} catch (InterruptedException e) {
		}

	}
}

class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Implementing runnable with inheritance");
	}
}
