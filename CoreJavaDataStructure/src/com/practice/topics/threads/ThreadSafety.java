package com.practice.topics.threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThreadSafety {

	
	public static void main(String[] s) throws InterruptedException
	{
		
		ProcessingThread pThread = new ProcessingThread();
		
		Thread t1 = new Thread(pThread);
		t1.start();
		Thread t2 = new Thread(pThread);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Processing Count "+ pThread.getCount());
		
			}
	
	public void doStuff(int num) throws IOException
	{
		try {
		BufferedReader br = new BufferedReader(new FileReader("d:\\test.txt"));
		}catch(IOException ie)
		{
			throw ie;
		}
	}
	
}


class ProcessingThread implements Runnable{
	
	private int count;
	//It is preferable to create a dummy private Object to use for synchronized block, so that
	//it’s reference can’t be changed by any other code  i.e as below
	private Object mutex = new Object();
	@Override
	public void run() {
				
		for (int i=0;i<5;i++)
		{
			
			processSomething(i);
			synchronized(mutex) {			
			count++;
			}
		}
	}
	
	private void processSomething(int i) {
		
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		
	}
	
	public int getCount()
	{
		return this.count;
	}
	
}
