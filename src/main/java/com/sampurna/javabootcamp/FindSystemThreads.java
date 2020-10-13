package com.sampurna.javabootcamp;

import java.util.Arrays;

public class FindSystemThreads {

	public static void main(String[] args) {

		ThreadGroup system = null;

		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

		while (threadGroup != null) {
			system = threadGroup;
			threadGroup = threadGroup.getParent();
		}

		while (system != null) {
			ThreadGroup[] threadGroupArray = new ThreadGroup[system.activeGroupCount()];
			int n = system.enumerate(threadGroupArray);
			Arrays.asList(threadGroupArray).stream().forEach((tg) -> {System.out.println(tg);});
		}
		
		while(system != null) {
			Thread[] threadArray = new Thread[system.activeCount()];
			int numOfThreads = system.enumerate(threadArray);
			Arrays.asList(threadArray).stream().forEach((thread) -> {System.out.println(thread + " " + thread.isDaemon());});
		}

	}

}
