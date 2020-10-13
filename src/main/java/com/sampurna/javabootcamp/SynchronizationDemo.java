package com.sampurna.javabootcamp;
import static java.lang.System.out; 

public class SynchronizationDemo {

	public static void main(String[] args) {

		FinTransaction ft = new FinTransaction();
		TransThread thread1 = new TransThread(ft, "Deposit Thread");
		TransThread thread2 = new TransThread(ft, "Withdrawal Thread");
		thread1.start();
		thread2.start();
	}
}

class FinTransaction {
	static String transName = "";
	static Integer amount = 0;
}

class TransThread extends Thread {

	private FinTransaction ft;

	public TransThread(FinTransaction ft, String name) {
		super(name);
		this.ft = ft;
	}

	public void run() {

		for (int i = 0; i < 100; i++) {
			if (getName().equals("Deposit Thread")) {
				synchronized (ft) { // synchronized (this) both threads get a copy of TransThread obj each in
									// contrast to sharing only one ft obj. hence both enter crictical section w/o waiting leading
									// to no sync
					FinTransaction.transName = "Deposit";
					try {
						Thread.sleep((int) (Math.random() * 1000));
					} catch (InterruptedException e) {
					}
					FinTransaction.amount = 2000;
					out.println(FinTransaction.transName + " " + FinTransaction.amount);   //used import staic java.lang.System.out
				}
			} else {
				synchronized (ft) { // synchronized(this)
					FinTransaction.transName = "Withdrawal";
					try {
						Thread.sleep((int) (Math.random() * 1000));
					} catch (InterruptedException e) {
					}
					FinTransaction.amount = 250;
					System.out.println(FinTransaction.transName + " " + FinTransaction.amount);
				}
			}
		}
	}

}
