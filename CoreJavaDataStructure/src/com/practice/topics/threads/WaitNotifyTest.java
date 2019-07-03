package com.practice.topics.threads;

public class WaitNotifyTest {

	
	public static void main(String[] s )
	{
		Message msg = new Message("Process it");
		Waiter waiter = new Waiter(msg);
		new Thread(waiter,"Waiter").start();
		
		
		Waiter waiter1 = new Waiter(msg);
		new Thread(waiter1,"waiter1").start();
		
		
		Notifier notifier = new Notifier(msg);
		new Thread(notifier,"notifier").start();;
		System.out.println("All threads now started");
	}
}
