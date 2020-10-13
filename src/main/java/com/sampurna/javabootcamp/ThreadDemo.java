package com.sampurna.javabootcamp;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread thread = new MyThread("Thread1");
		thread.start();

		for (int i = 0; i < 50; i++) {
			System.out.println("After thread start" + " " + i);

		}
		
		System.out.println("NAME :" + thread.getName());
	}
}

class MyThread extends Thread {

	MyThread(String name) {
		//setName(name);
		super(name);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Inside run" + " " + i);
		}
	}
}
