package corejava.collections.list.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	
	
	public static void main(String[] str)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ripu");
		list.add("Amit");
		list.add("Rohit");
		
		list.forEach(name->System.out.println(name));
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Ripu");
		list1.add("Amit");
		list1.add("Rohit");
		list1.add("Raj");
		
		list1.forEach(name->System.out.println(name));
		
		
		System.out.println("poll method of Linked List:"+list.poll());
		System.out.println("---------------After poll-----------------");
		list.forEach(name->System.out.println(name));
		list.offer("Ripudaman");
		System.out.println("---------------After offer-----------------");
		list.forEach(name->System.out.println(name));
	}

}
