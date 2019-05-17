package datastructures.queue;



//Refer this link for diagrammatic view
//https://www.programiz.com/dsa/queue

/*Time Complexity - Time complexity of all operations like 
 * enqueue(), dequeue(), isFull(), isEmpty(), front() and 
 * rear() is O(1). There is no loop in any of the operations.
 * 
 * */
public class MyQueue {

	int front, rear, size;
	int capacity;
	int arr[];

	public MyQueue(int capacity) {
		this.capacity = capacity;
		front = 0;
		rear = -1;
		arr = new int[this.capacity];

	}
	/*
	 * Checks Size, size is full when queue size is equal to the capacity
	 * */
	boolean isFull(MyQueue queue) {
		return (queue.size == queue.capacity);

	}
	/*
	 * It checks if the queue is empty, queue is empty if queue size is equal to 0
	 * */
	boolean isEmpty(MyQueue queue) {
		return (queue.size == 0);
	}
	/*
	 * It adds an item to the queue and increments the index of rear and increase the size of the queue.
	 * */
	public void enQueue(int item) {
		if (isFull(this))
			return;
		rear = rear + 1;
		arr[rear] = item;
		size = size + 1;
		System.out.println(item + " is Enqueud ");

	}
    /*
     * It removes an item from the queue and changes front and decreases the size of the queue.
     * */
	public int deQueue() {
		int element;
		if (isEmpty(this)) {
			return -1;
		}
		element = this.arr[this.front];
		this.front = this.front + 1;
		this.size = this.size - 1;
		System.out.println(element+" Is dequeued");
		return element;

	}

	/*
	 * It returns the front element
	 * */
	public int front() {
		if (isEmpty(this)) {
			return -1;
		}
		return this.arr[this.front];
	}
	/*
	 * It returns the rear element
	 * */
	public int rear() {
		if (isEmpty(this)) {
			return -1;
		}
		return this.arr[this.rear];
	}
}
