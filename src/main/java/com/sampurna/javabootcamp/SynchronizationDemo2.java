package com.sampurna.javabootcamp;

public class SynchronizationDemo2 {

	public static void main(String[] args) {

		FinTransaction1 ft = new FinTransaction1();
		TransThread1 thread1 = new TransThread1(ft, "Deposit Thread");
		TransThread1 thread2 = new TransThread1(ft, "Withdrawal Thread");
		thread1.start();
		thread2.start();
	}

}

class FinTransaction1 {
	private String name;
	private Integer amount;

	synchronized void update(String transName, Integer transAmount) {
		System.out.println(transName + " " + transAmount);
	}

}

class TransThread1 extends Thread {

	private FinTransaction1 ft;

	TransThread1(FinTransaction1 ft, String name) {
		super(name);
		this.ft = ft;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {

			if (getName().equals("Deposit Thread")) {
				ft.update("Deposit", 2000);
			} else {
				ft.update("Withdrawal", 250);
			}
		}
	}

}
