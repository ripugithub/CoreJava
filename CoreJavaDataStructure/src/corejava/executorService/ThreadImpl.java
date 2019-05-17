package corejava.executorService;

import java.util.concurrent.Semaphore;

public class ThreadImpl {
	
	public static void main(String[] str)
	{
		
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
	}

}
