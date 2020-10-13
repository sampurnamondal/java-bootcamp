package com.sampurna.javabootcamp;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Clocks1 {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println(new Date().toString());
			}
		}, 1000, 100);
	}
}
