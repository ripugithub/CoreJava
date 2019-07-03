package com.practice.topics.threads;


class Table{
	public static synchronized void printTable(int num) 
	{
		
		for(int i=1;i<=5;i++)
		{
			try {
			Thread.sleep(500);
			}catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		System.out.println(num*i);
		}
	}
}
public class TestSynchronization {
	
	
	
	public static void main(String[] s)
	{
		
		Thread t1 = new Thread() {
			public void run() {
				Table.printTable(5);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				Table.printTable(10);
			}
		};
		t1.start();
		t2.start();
	}

}