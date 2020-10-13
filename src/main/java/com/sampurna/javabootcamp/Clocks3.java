package com.sampurna.javabootcamp;

import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Clocks3 {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println(new Date().toString());
			}
		}, 0, 1000);

		InputThread inputThread = new InputThread();
		inputThread.start();

		try {
			inputThread.join(1000);
		} catch (InterruptedException e) {
		}

		timer.cancel();
	}
}

class InputThread extends Thread {

	public void run() {
		try {
			System.in.read();
		} catch (IOException e) {
		}
	}
}
