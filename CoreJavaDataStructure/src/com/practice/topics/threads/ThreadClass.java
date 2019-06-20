package com.hitachi.topics.threads;

public class ThreadClass {
	
	public static void main(String s[])
	{
		ThreadA thread = new ThreadA();
		thread.start();
		synchronized (thread){
			try {
				System.out.println("Waiting for B to complete");
				thread.wait();
			}catch(InterruptedException e) {
				System.out.println("Total is: "+thread.total);
			}
		}
		
	}

}

class ThreadA extends Thread
{
	int total;
	public void run()
	{
		synchronized (this) {
			for(int i=0;i<10;i++) {
				total = total+i;
			}
			notify();
		}
	}
}