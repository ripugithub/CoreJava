package com.practice.topics.datastructure.queue;

public class Queue {
	int front,rear,size;
	int capacity;
	int[] arr;
	
	public Queue(int capacity)
	{
		this.capacity = capacity;
		arr = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty(Queue queue)
	{
		return queue.size==0;
	}
	
	public boolean isFull(Queue queue)
	{
		return queue.size == this.capacity;
	}
	
	public void enQueue(int data)
	{
		if(isFull(this))
			return;
		
		arr[++rear] = data;
		size++;
	}
	
	public Integer deQueue()
	{
		int element;
		if(isEmpty(this))
			return null;
		element = arr[++front];
		size--;
		return element;
	}
	

}
