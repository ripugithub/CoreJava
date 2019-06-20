package com.practice.topics.datastructure.stack;

public class Mystack {
	
	public static void main(String s[])
	{
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(40);
		stack.push(50);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
