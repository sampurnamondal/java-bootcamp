package com.sampurna.javabootcamp;

public class SynchronizationDemoUsingSyncBlock {

	public static void main(String[] args) {

		CallMe2 target = new CallMe2();
		Caller2 callerThread = new Caller2(target, "Hello");
		Caller2 callerThread1 = new Caller2(target, "Synchronized");
		Caller2 callerThread2 = new Caller2(target, "World");

		callerThread.t.start();
		callerThread1.t.start();
		callerThread2.t.start();

		try {
			callerThread.t.join();
			callerThread1.t.join();
			callerThread2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

class CallMe2 {
	void call(String text) {
		System.out.print("[ " + text);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.print("]");
	}
}

class Caller2 implements Runnable {

	Thread t;
	CallMe2 callMe;
	String text;

	Caller2(CallMe2 callMe, String text) {
		t = new Thread(this);
		this.callMe = callMe;
		this.text = text;
	}

	public void run() {
		synchronized (this.callMe) {
			callMe.call(text);
		}
	}
}