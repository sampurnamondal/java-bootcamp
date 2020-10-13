package com.sampurna.javabootcamp;

public class UserDaemonThreadDemo {

	public static void main(String[] args) {

		MyThread4 myThread4 = new MyThread4();
		myThread4.setDaemon(true);
		myThread4.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}
	}

}

class MyThread4 extends Thread {
	public void run() {
		System.out.println("Daemon is" + " " + isDaemon());
		for(;;) {
		//infinite loop	
		}
	}
}