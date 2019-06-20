package com.practice.topics.datastructure.queue;

public class MyQueue {
	
	public static void main(String s[])
	{
		Queue queue = new Queue(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println(queue.deQueue());
		queue.enQueue(40);
		queue.enQueue(50);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		
		
	}

}
