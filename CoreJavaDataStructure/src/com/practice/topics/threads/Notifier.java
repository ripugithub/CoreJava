package com.hitachi.topics.threads;

public class Notifier implements Runnable{
	
	private Message msg;
	
	public Notifier(Message msg)
	{
		this.msg = msg;
	}
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+"  Started");
		
		try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg("Notifier Work Done");
				msg.notify();
				//msg.notifyAll();
			}
		}catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	

}
