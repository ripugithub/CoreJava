package com.practice.topics.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class VectorClass {
	public static void main(String s[])
	{
		
		List<String> list = new Vector<String>();
		
		list.add("Ripu");
		list.add("Raj");
		list.add("Amit");
		list.add("Rohit");
		list.add("Neeraj");
		//list.forEach(name->System.out.println(name));
		System.out.println(list.get(2));
		
		Map<String,String> map = new TreeMap<String,String>();
		map.put("1", "Ripu");
		map.put("2", "Raj");
		map.put("3", "Amit");
		map.put("4", "Rohit");
		map.put("5", "Neeraj");
		
		
		System.out.println("-------------------------");
		Iterator itr = map.values().iterator();
		while(itr.hasNext())
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
		
		
		
		
		
	}
}
