package com.sampurna.javabootcamp;

public class CalcPi {

	public static void main(String[] args) {

		MyThread1 myThread1 = new MyThread1();
		myThread1.start();
		try {
			Thread.sleep(100); // sleep for 10 millisecs
		} catch (InterruptedException e) {

		}
		System.out.println("pi :" + " " + myThread1.pi);
	}

}

class MyThread1 extends Thread {

	boolean negative = true;
	double pi; // Initializes to 0.0, by default

	public void run() {
		for (int i = 3; i < 100000; i += 2) {
			if (negative)
				pi -= (1.0 / i);
			else
				pi += (1.0 / i);
			negative = !negative;
		}
		pi += 1.0;
		pi *= 4.0;
		System.out.println("Finished calculating PI");
	}
}
