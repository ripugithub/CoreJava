package datastructures.linkedList.practice;

class LinkedList 
{ 
    Node head;  // head of list 
  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int d)  { data = d;  next=null; } // Constructor 
    } 
  
    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList llist = new LinkedList(); 
  
        llist.head  = new Node(1); 
        Node second = new Node(2); 
        Node third  = new Node(3); 
        
        Node fourth = new Node(4);
       
       
        
  
        /* Three nodes have been allocated  dynamically. 
          We have refernces to these three blocks as first,   
          second and third 
  
          llist.head        second              third 
             |                |                  | 
             |                |                  | 
         +----+------+     +----+------+     +----+------+ 
         | 1  | null |     | 2  | null |     |  3 | null | 
         +----+------+     +----+------+     +----+------+ */
  
        llist.head.next = second; // Link first node with the second node 
  
        /*  Now next of first Node refers to second.  So they 
            both are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  | null |     |  3 | null | 
        +----+------+     +----+------+     +----+------+ */
  
        second.next = third; // Link second node with the third node 
  
        /*  Now next of second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ */
        llist.insertAtPos(fourth.data, 2);
        
        llist.show(llist.head);
        
        
    } 
    public void show(Node llist)
    {
    	while(llist.next!=null)
    	{
    		System.out.println(llist.data);
    		llist = llist.next;
    	}
    	System.out.println(llist.data);
    }
    
    public void insertAtLast(int data)
    {
    	Node node = new Node(data);
    	node.next = null;
    	
    	if(head==null)
    	{
    		head=node;
    	}else {
    		Node n = head;
    		while(n.next!=null)
    		{
    			n = n.next;
    		}
    		n.next = node;
    	}
    }
    
    public  void insertAtPos(int data,int pos)
    {
    	Node node = new Node(data);
    	node.next = null;
    	
    	if(pos==0)
    	{
    		insertAtStart(data);
    	}else {
    		Node tmp = head;
    		for(int i=0;i<pos-1;i++)
    		{
    			tmp = tmp.next;
    		}
    		
    		node.next = tmp.next;
    		tmp.next = node;
    	}
    	
    	
    			
    }
	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.next = null;
		
		node.next = head;
		head = node;
	}
} 
