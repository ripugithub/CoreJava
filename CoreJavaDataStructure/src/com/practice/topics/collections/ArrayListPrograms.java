package com.practice.topics.collections;

import java.util.ArrayList;

public class ArrayListPrograms {
	public static void main(String s[])
	{
		ArrayList<String> al = new ArrayList<String>();
	     arrayListOperations(al);
		
	}

	/**
	 * @param al
	 */
	public static void arrayListOperations(ArrayList<String> al) {
		al.add("Hi");
	     al.add("hello");
	     al.add("String");
	     al.add("Test");
	     System.out.println("ArrayList1 before addAll:"+al);

	     //ArrayList2 of String Type
	     ArrayList<String> al2 = new ArrayList<String>();
	     al2.add("Text1");
	     al2.add("Text2");
	     al2.add("Text3");
	     al2.add("Text4");

	     //Adding ArrayList2 into ArrayList1
	     al.addAll(al2);
	     System.out.println("ArrayList1 after addAll:"+al);
	     
	}
	 
}
