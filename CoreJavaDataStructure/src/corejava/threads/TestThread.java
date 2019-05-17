package corejava.threads;

public class TestThread extends Thread implements Runnable {

	public void run()
	{
		System.out.println("From run method");
		notify();
	}
	
	public static void main(String[] str)
	{
		TestThread obj = new TestThread();
		obj.run();
		obj.start();
	}
}
