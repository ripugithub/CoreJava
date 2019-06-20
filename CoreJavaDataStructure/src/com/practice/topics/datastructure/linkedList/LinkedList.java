package com.practice.topics.datastructure.linkedList;

public class LinkedList {
	
	private Link head;
	public LinkedList()
	{
		head = null;
	}
	
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void insert(int data)
	{
		Link link = new Link(data);
		link.next = head;
		head = link;		
	}
	public boolean delete()
	{
		if(head==null)
		{
			return false;
		}
		head = head.next;
		return true;
	}
	
	public void print()
	{
		Link current  = head;
		while(current!=null)
		{
			System.out.println(current.getData());
			current = current.next;
		}
	}
	public int length()
	{
		int count=0;
		Link current = head;
		while(current!=null)
		{
			current = current.next;
			count++;
		}
		return count;
	}
	
	public static void main(String s[])
	{
		
		LinkedList linkedList = new LinkedList();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		System.out.println("Length of link list is :"+linkedList.length());
		linkedList.print();
		linkedList.delete();
		System.out.println("---------------------");
		linkedList.print();
	}

}
