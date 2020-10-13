package com.sampurna.javabootcamp;

public class CalcPi3usingJoin {

	public static void main(String[] args) {

		MyThread3 myThread3 = new MyThread3();
		myThread3.start();

		try {
			myThread3.join(); // current thread waits for 10 millisecs till myThread3 is dead
		} catch (InterruptedException e) {

		}

		// System.out.println(Thread.currentThread().getName());
		System.out.println("pi :" + " " + myThread3.pi);
	}

}

class MyThread3 extends Thread {

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
