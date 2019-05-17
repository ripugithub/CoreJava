package corejava.threads;

public class TestJoin implements Runnable{
	 public void run() 
	    { 
	        System.out.println("From Run Method "); 
	        System.out.println("Running run method "); 
	    } 
	public static void main(String[] str)
	{
		
		TestJoin runnable = new TestJoin();
		Thread thread = new Thread(runnable);
		thread.start();
		//thread.start(); //starting the thread twice will throw Illegal thread State exception(Runtime Exception) code compiles fine but fails at runtime
		System.out.println("Thread started");
		try {
		thread.join();
		}catch(InterruptedException ie)
		{
			
		}
		System.out.println("From Main Method");
	
		
	}

}
