package datastructures.queue;

public class TestMyQueue {
	
	public static void main(String s[])
	{
		
		MyQueue queue = new MyQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		queue.enQueue(60);
		
		//Here 20 was added to the queue first so it should come out of queue first as per the FIFO concept
		queue.deQueue();
		
	}

}
