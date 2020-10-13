package com.sampurna.javabootcamp;

public class ThreadCensus {

	public static void main(String[] args) {

		Integer count = Thread.activeCount();
		Thread[] threadArray = new Thread[count];
		int n = Thread.enumerate(threadArray);   //returns no of threads
		for (Thread thread : threadArray) {
			System.out.println("COUNT :" + " " + count + " " + "," + thread.toString());
		}
	}

}
