package com.sampurna.javabootcamp;

public class ProducerConsumer {
	public static void main(String[] args) {
		Shared sharedItem = new Shared();
		new Producer(sharedItem).start();
		new Consumer(sharedItem).start();
		
	}
}

class Shared
{
   private char c = '\u0000';
   private boolean writeable = true;

   synchronized void setSharedChar (char c)
   {
      while (!writeable)
         try
         {
            wait ();
         }
         catch (InterruptedException e) {}

      this.c = c;
      writeable = false;
      notify ();
   }

   synchronized char getSharedChar ()
   {
      while (writeable)
         try
         {
            wait ();
         }
         catch (InterruptedException e) { }

      writeable = true;
      notify ();

      return c;
   }
}

class Producer extends Thread {

	private Shared sharedItem;

	Producer(Shared sharedItem) {
		this.sharedItem = sharedItem;
	}

	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			try {
				Thread.sleep((int) Math.random() * 4000);
			} catch (InterruptedException e) {
			}
			sharedItem.setSharedChar(i);
			System.out.println(i + " produced by producer.");
		}
	}
}

class Consumer extends Thread {

	private Shared sharedItem;

	Consumer(Shared sharedItem) {
		this.sharedItem = sharedItem;
	}

	public void run() {
		char i;
		do {
			try {
				Thread.sleep((int) Math.random() * 4000);
			} catch (InterruptedException e) {
			}
			i = sharedItem.getSharedChar();
			System.out.println(i  + " consumed by consumer.");
		} while (i != 'Z');
	}

}