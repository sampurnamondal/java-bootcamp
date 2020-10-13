package com.sampurna.javabootcamp;

public class ProducerConsumer1 {

	public static void main(String[] args) {

		Data data = new Data();
		Producer1 producer = new Producer1(data);
		Consumer1 consumer = new Consumer1(data);

		producer.t.start();
		consumer.t.start();
	}
}

class Data {

	Integer n;
	Boolean value = false;

	synchronized int get() {
		while (!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		System.out.println("Consumer got " + n);
		notify();
		value = false;
		return n;
	}

	synchronized void set(Integer n) {
		while (value) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		System.out.println("Producer made " + n );
		notify();
		value = true;
		this.n = n;
	}
}

class Producer1 implements Runnable {

	Thread t;
	Data data;

	public Producer1(Data data) {
		t = new Thread(this, "Producer");
		this.data = data;
	}

	public void run() {
		int i = 0;
		while (true) {
			data.set(i++);
		}
	}
}

class Consumer1 implements Runnable {

	Thread t;
	Data data;

	public Consumer1(Data data) {
		t = new Thread(this, "Consumer");
		this.data = data;
	}

	public void run() {
		int i;
		while (true) {
			i = data.get();
		}
	}
}
