package datastructures.linkedList;



public class Runner {

	public static void main(String s[])
	{
		LinkedList list = new LinkedList();
		
		list.insertAtLast(5);
		list.insertAtLast(12);
		list.insertAtLast(18);
		list.insertAtStart(25);
		list.insertAtStart(35);
		list.insertAtStart(45);
		list.insertAt(2, 55);
		
		list.show();
		list.deleteFromLast();
		System.out.println("-----------------");
		list.show();
		System.out.println("-----------------");
		//list.deleteFrontNode();
		list.show();
		System.out.println("Size of link list:: "+ list.sizeOfLinkedList());
		System.out.println(list.isNodeExists(55));
		System.out.println("Middle Node:: "+list.getMiddleNode().data);
	}
}
