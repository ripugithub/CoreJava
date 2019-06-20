package java8Features;

public class RunnableExample {
	
	public static void main(String s[])
	{
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread from anonymous class");
				
			}
		});
		myThread.run();
		
		Runnable myRunnable = ()->System.out.println("Thread from Lambda");
		myRunnable.run();
		
		//OR
		Thread thread = new Thread(()->System.out.println("Thread from another lambda"));
		thread.run();
	}

}
