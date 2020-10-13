package com.sampurna.javabootcamp;

public class CalcPi2usingIsAlive {

	public static void main(String[] args) {

		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		while(myThread2.isAlive()) {
			try {
				Thread.sleep(1); // sleep for 10 millisecs
			} catch (InterruptedException e) {

			}
		}
		//System.out.println(Thread.currentThread().getName());
		System.out.println("pi :" + " " + myThread2.pi);
	}

}

class MyThread2 extends Thread {

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
