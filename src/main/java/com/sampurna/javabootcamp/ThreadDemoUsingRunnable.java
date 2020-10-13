package com.sampurna.javabootcamp;

public class ThreadDemoUsingRunnable {

	public static void main(String[] args) {
		DemoThread demoThread = new DemoThread();
		
		Runnable runnableOnject = () -> System.out.println("Inside lambda");
		Thread demoThread2 = new Thread(runnableOnject, "usingLambda");
	
		Thread demoThread1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Inside anonymous");
			}
		},"usingAnonymousClass");
		
		
		try {
			demoThread1.start();
			demoThread1.join();
			demoThread.t.start();
			try {
				demoThread.t.join();
				demoThread2.start();
			}catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		
		try {
			demoThread2.join();
			for (int i = 0; i < 5; i++) {
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Exiting main thread");
		
		
		
		
	}
}

class DemoThread implements Runnable {

	Thread t;

	DemoThread() {
		t = new Thread(this, "ChildThread");
	}

	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread interrupted");
		}
		System.out.println("Exiting child thread");
	}
}
