package com.practice.topics.threads;

public class Waiter implements Runnable{
	
	private Message msg;
	
	public Waiter(Message msg){
		this.msg = msg;
		
	}
	
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		synchronized(msg) {
			try {
			System.out.println(name+" Waiting to get notified"+ System.currentTimeMillis());
			msg.wait();
			}catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			System.out.println(name+" Waiter thread got notified"+ System.currentTimeMillis());
			
			System.out.println(name+"Thread Processed"+ System.currentTimeMillis());
		}
	}

}
