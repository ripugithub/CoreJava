package practice.topics.collections.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListExample {
	
	public static void main(String s[])
	{
	//	LinkedHashMap<Integer, String> linkedHaspMap= new LinkedHashMap<Integer, String>();
		Map<Integer, String> linkedHaspMap= new HashMap<Integer, String>();
		
		linkedHaspMap.put(101, "Ripu");
		linkedHaspMap.put(201,"Raj");
		linkedHaspMap.put(301,"Amit");
		linkedHaspMap.put(401,"Rohit");
		
		System.out.println(linkedHaspMap.get(301));
		
		Set set = linkedHaspMap.entrySet();
		for(Map.Entry entry:linkedHaspMap.entrySet())
		{
			System.out.println("key::"+entry.getKey()+" Value:: "+entry.getValue());
		}
		
		Set<Integer> elems = new HashSet<Integer>();
		elems.add(4);
		elems.add(5);
		elems.add(6);
		elems.add(8);
		elems.add(2);
		elems.add(null);
		
		System.out.println(elems);
		for(int num:elems)
			System.out.println(num);
		
		
		
		
		
	}

}
