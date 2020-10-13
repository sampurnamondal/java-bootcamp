package com.sampurna.javabootcamp;

public class InterruptedDemo {

	public static void main(String[] args) {

		ThreadB threadB = new ThreadB();
		threadB.setName("B");
		ThreadA threadA = new ThreadA(threadB);
		threadA.setName("A");
		threadA.start();
		threadB.start();
	}

}

class ThreadA extends Thread {

	private Thread threadOther;

	ThreadA(Thread threadOther) {
		this.threadOther = threadOther;
	}

	public void run() {

		int sleepTime = (int) (Math.random() * 1000);
		System.out.println(getName() + " sleeping for " + sleepTime);
		try {
			sleep(sleepTime);
		} catch (InterruptedException e) {
		}
		System.out.println("Interrupting other thread after sleeping");
		threadOther.interrupt();
	}
}

class ThreadB extends Thread {

	private int count = 0;

	public void run() {
		while (!isInterrupted()) {                     //interrupted
			try {
				Thread.sleep((int) (Math.random() * 10));
			} catch (InterruptedException e) {
				interrupt();
			}
			System.out.println(getName() + " counting " + count++);
		}
	}
}