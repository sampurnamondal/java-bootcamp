package com.sampurna.javabootcamp;

import java.io.IOException;

public class PriorityDemo {

	public static void main(String[] args) {

		BlockingThread blockingThread = new BlockingThread();
		blockingThread.setPriority(Thread.NORM_PRIORITY + 1);
		CalculatingThread calculatingThread = new CalculatingThread();
		calculatingThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		calculatingThread.setFinished(true);
		blockingThread.setFinished(true);
	}

}

class BlockingThread extends Thread {

	private Boolean finished = false;

	public void run() {

		while (!this.finished) {
			try {
				Integer i;
				do {
					i = System.in.read();
				} while (i != '\n');
				System.out.println("\n");
			} catch (IOException e) {
			}
		}
	}

	public void setFinished(Boolean finish) {
		this.finished = finish;
	}
}

class CalculatingThread extends Thread {

	private Boolean finished = false;
	Integer sum = 0;

	public void run() {
		while (!this.finished) {
			sum++;
			System.out.println(sum);
		}
	}

	public void setFinished(Boolean finish) {
		this.finished = finish;
	}
}
