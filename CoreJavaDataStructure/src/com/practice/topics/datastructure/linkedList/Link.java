package com.practice.topics.datastructure.linkedList;

public class Link {

	private int data;
	public Link next;
	
	public Link()
	{
		next = null;
	}
	
	public Link(int data)
	{
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
