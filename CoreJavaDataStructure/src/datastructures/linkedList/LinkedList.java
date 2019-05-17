package datastructures.linkedList;

public class LinkedList {

	Node head;

	public void insertAtLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		// head==null means there are no nodes in the linked list and the new node that
		// we have created will be the head node
		if (head == null) {
			head = node;

		}
		// traverse all the way till the last node using below condition
		else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		// Assign the head node to next of the new node
		node.next = head;
		// make the new node as head
		head = node;

	}

	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;

		// if the node has to be inserted to start
		if (index == 0) {
			// call the insert at start method
			insertAtStart(data);
		}
		// traverse till the index -1 position
		else {
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			// after traversing, point the next of new node to next node
			node.next = n.next;

			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		// prints the last element in the linked list
		System.out.println(node.data);
	}
	
	//https://www.youtube.com/watch?v=jY-EUKXYT20     - Link to demonstrate reversing a linked list.
	public Node reverse(Node node)
	{
		Node previous = null;
		Node current = node;
		Node next = null;
		
		while(current!=null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		node = previous;
		return node;
		
	}
	
	public Node deleteFromLast()
	{
		Node node = head;
		if(node==null||node.next==null) {
			return null;
		}
		
		Node tmp = node;
		while(tmp.next.next!=null)
		{
			tmp = tmp.next;
		}
		tmp.next = null;
		
		return node;
	}
	
	public Node deleteFrontNode()
	{
		if(head==null)
		{
			return null;
		}
		head = head.next;
		return head;
	}
	
	public int sizeOfLinkedList()
	{
		Node node = head;
		int count=0;
		if(node==null)
		{
			return 0;
		}
		while(node.next!=null)
		{
			count++;
			node = node.next;
		}
		return count++;
	}
	
	public boolean isNodeExists(int val)
	{
		Node node = head;
		if(node==null)
		{
			return false;
		}
		
		while(node.next!=null)
		{
			if(node.data==val)
			{
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	public Node getMiddleNode()
	{
		Node node = head;
		if(node==null)
		{
			return null;
		}
		Node a = node;
		Node b = node.next;
		
		while(b!=null && b.next!=null)
		{
			a = a.next;
			b = b.next.next;
		}
		
		return a;
	}
	
	public Node mergeSort(Node node)
	{
		if(node==null||node.next==null)
		{
			return node;
		}
		
		Node middle = getMiddleNode();
		Node secondHalf = middle.next;
		
		middle.next = null;
		return merge(mergeSort(node),mergeSort(secondHalf));
	}

	private Node merge(Node a, Node b) {
		
		Node temp = new Node();
		Node finalList = temp;
		while(a!=null && b!=null)
		{
			if(a.data <b.data)
			{
				temp.next = a;
				a = a.next;
				
			}else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		temp.next = (a==null)?b:a;
		return finalList.next;
	}
	
	public Node deleteLinkedList()
	{
		return null;
	}

}
