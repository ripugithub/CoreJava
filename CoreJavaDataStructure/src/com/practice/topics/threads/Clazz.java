package com.practice.topics.threads;

public class Clazz{
	
	
	public static void main(String s[]) throws InterruptedException
	{
		MyRunnable1 runnable = new MyRunnable1();
		Thread t1 = new Thread(runnable);
		t1.start();
		Thread t2 = new Thread(runnable);
		t2.start();
		t1.join();t2.join();
		System.out.println("Counter:: "+runnable.getCount());
		
		
	}
	
	
}

class MyRunnable1 implements Runnable {

	private int count=0;
	private Object mutex = new Object();
	@Override
	public void run() {
		
		for(int i=0; i<5;i++)
		{
			processSomething();
			synchronized(mutex) {
			count++;
			}
		}
	}
	public int getCount() {
		return count;
	}
	private void processSomething()
	{
		try {
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
}
