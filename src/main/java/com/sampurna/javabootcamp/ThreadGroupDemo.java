package com.sampurna.javabootcamp;


public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup threadGroup = new ThreadGroup("Subgroup 1");
		Thread a = new Thread(threadGroup, "A");
		Thread b = new Thread(threadGroup, "B");
		Thread c = new Thread(threadGroup, "C");
		threadGroup.list();
		
		System.out.println("Subgroup 1 priority " + threadGroup.getMaxPriority());
		Thread x = new Thread(threadGroup, "X");
		System.out.println(x.getName() + " " + "priority initially " + x.getPriority());
		x.setPriority(Thread.NORM_PRIORITY + 1);
		threadGroup.setMaxPriority(Thread.NORM_PRIORITY - 1);
		System.out.println("Subgroup 1 priority changed to " + threadGroup.getMaxPriority());
		Thread y = new Thread(threadGroup, "Y");
		System.out.println(y.getName() + " " + "priority initially " + y.getPriority());
		y.setPriority(Thread.NORM_PRIORITY + 1);
		System.out.println(x.getName() + " " + "priority after setMaxPriority (changed before changing group prority) " + x.getPriority());
		System.out.println(y.getName() + " " + "priority after setMaxPriority (changed after changing group prority) " + y.getPriority());
		
		
		System.out.println("\n");
		
		threadGroup = new ThreadGroup("Subgroup 2");
		Thread d = new Thread(threadGroup, "D");
		threadGroup.list();
		threadGroup = Thread.currentThread().getThreadGroup();
		System.out.println("Active thread groups in current threadgroup " + threadGroup.activeGroupCount());
		threadGroup.list();
	}
}
