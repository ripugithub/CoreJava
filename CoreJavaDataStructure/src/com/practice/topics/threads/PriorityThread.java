package com.hitachi.topics.threads;

public class PriorityThread extends Thread{

	
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
	
	public static void main(String s[])
	{
		PriorityThread m1=new PriorityThread();  
		PriorityThread m2=new PriorityThread();  
		m1.setName("Ripu");m2.setName("Daman");
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m1.start();  
		  m2.start();
	}
}
