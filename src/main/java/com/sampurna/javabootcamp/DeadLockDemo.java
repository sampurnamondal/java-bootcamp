/*Create a deadlock*/

package com.sampurna.javabootcamp;

public class DeadLockDemo {
	public static void main(String[] args) {
		FinTrans ft = new FinTrans();
		TransThread2 tt1 = new TransThread2(ft, "Deposit Thread");
		TransThread2 tt2 = new TransThread2(ft, "Withdrawal Thread");
		tt1.start();
		tt2.start();
	}
}

class FinTrans {
	static String transName;
	static double amount;
}

class TransThread2 extends Thread {
	private FinTrans ft;
	private static String anotherSharedLock = "";

	TransThread2(FinTrans ft, String name) {
		super(name); 
		this.ft = ft; 
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			if (getName().equals("Deposit Thread")) {
				synchronized (ft) {
					synchronized (anotherSharedLock) {
						FinTrans.transName = "Deposit";
						try {
							Thread.sleep((int) (Math.random() * 1000));
						} catch (InterruptedException e) {
						}
						FinTrans.amount = 2000.0;
						System.out.println(FinTrans.transName + " " + FinTrans.amount);
					}
				}
			} else {
				synchronized (anotherSharedLock) {
					synchronized (ft) {
						FinTrans.transName = "Withdrawal";
						try {
							Thread.sleep((int) (Math.random() * 1000));
						} catch (InterruptedException e) {
						}
						FinTrans.amount = 250.0;
						System.out.println(FinTrans.transName + " " + FinTrans.amount);
					}
				}
			}
		}
	}
}
