package com.practice.topics.threads;

public class ThreadProgram {

	public static void main(String s[]) throws InterruptedException
	{
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
		System.out.println("Count::"+runnable.getCount());
	}
	
	public void someMethod()
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


 class MyRunnable implements Runnable
{
	private int count=0;
	private Object mutex = new Object();
	
	
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			//synchronized(mutex)
			//{
				count++;
			//}
		}
	}


	public int getCount() {
		return count;
	}
	
	

}