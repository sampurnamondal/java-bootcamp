package com.sampurna.javabootcamp;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Clocks2 {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.out.println(new Date().toString());
			}
		}, 0, 1000);
	}

}
