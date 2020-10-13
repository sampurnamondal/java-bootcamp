package com.sampurna.javabootcamp;

public class YieldDemo extends Thread {

	private static int sum = 0;
	private static Boolean finished = false;

	public static void main(String[] args) {

		new YieldDemo().start();
		for (int i = 0; i < 50000; i++) {
			sum++;
			Thread.yield();
		}
		finished = true;
	}

	public void run() {
		while(!finished) {
			System.out.println(sum);
		}
	}

}
