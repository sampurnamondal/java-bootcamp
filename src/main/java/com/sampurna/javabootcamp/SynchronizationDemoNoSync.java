package com.sampurna.javabootcamp;

public class SynchronizationDemoNoSync {

	public static void main(String[] args) {

		CallMe target = new CallMe();
		Caller callerThread = new Caller(target, "Hello");
		Caller callerThread1 = new Caller(target, "Synchronised");
		Caller callerThread2 = new Caller(target, "World");

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

class CallMe {

	void call(String message) {

		System.out.print("[ " + message);
		try {
			Thread.sleep(1000);
			System.out.print("]");
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}

class Caller implements Runnable {

	Thread t;
	CallMe callMe;
	String msg;

	Caller(CallMe callMe, String msg) {
		t = new Thread(this);
		this.msg = msg;
		this.callMe = callMe;
	}

	public void run() {
		callMe.call(msg);
	}
}
