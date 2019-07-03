package com.practice.topics.threads;

public class WaitandNotify {

	public static void main(String s[])
	{
		MyThread t = new MyThread();
				t.start();
		synchronized(t)
		{
			try {
				System.out.println("Waiting for thread to complete ..");
				t.wait();
			}catch(InterruptedException e)
			{
				System.out.println("Total is :"+t.total);
			}
		}
	}
}


class MyThread extends Thread
{
	int total;
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
					total+=i;
			}
			notify();
		}
	}
}
