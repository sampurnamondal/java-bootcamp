package com.sampurna.javabootcamp;

public class SynchronizationDemoUsingSyncFunction {

	public static void main(String[] args) {

		CallMe1 target = new CallMe1();
		Caller1 callerThread = new Caller1(target, "Hello");
		Caller1 callerThread1 = new Caller1(target, "Synchronised");
		Caller1 callerThread2 = new Caller1(target, "World");

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

class CallMe1 {

	synchronized void call(String message) {

		System.out.print("[ " + message);
		try {
			Thread.sleep(1000);
			System.out.print("]");
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
}

class Caller1 implements Runnable {

	Thread t;
	CallMe1 callMe;
	String msg;

	Caller1(CallMe1 callMe, String msg) {
		t = new Thread(this);
		this.msg = msg;
		this.callMe = callMe;
	}

	public void run() {
		callMe.call(msg);
	}
}
