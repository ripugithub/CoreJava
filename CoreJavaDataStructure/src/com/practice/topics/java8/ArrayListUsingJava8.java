package com.practice.topics.java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingJava8 {
	
	public static void main(String s[])
	{
		List<String> players = new ArrayList<String>();
		players.add("Satya");
		players.add("Ripu");
		players.add("Lokesh");
		
		players.forEach(name->System.out.println(name));
		
	}

}
