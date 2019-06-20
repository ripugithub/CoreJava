package com.practice.topics.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HahMapExample {
	
	
	public static void main(String s[])
	{
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("1", "Ripu");
		map.put("2", "Raj");
		map.put("3", "Amit");
		map.put("4", "Rohit");
		map.put("5", "Prabhjot");
		
	/*	//using Lambda expression
		map.keySet().forEach(val->System.out.println(map.get(val)));
		
		
		Set keySet = map.entrySet();
		Iterator itr = keySet.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String>  entry = (Map.Entry)itr.next();
		//	System.out.println("Key:"+entry.getKey()+" Value: "+entry.getValue());
			//System.out.println(itr.next());;
			
			
		}
		map.entrySet().forEach(entry->System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue()));
		
		for(String name:map.values())
		{
			System.out.println("Values are: "+name);
		}*/
		
		//map.entrySet().forEach(entry->System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue()));
		
		//map.keySet().forEach(key->System.out.println("Key: "+key+" Value: "+map.get(key)));
		
		map.entrySet().forEach(entry->System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue()));
		
		Set set = map.keySet();
		System.out.println("--------------------------------------");
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			
			System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue());
		}
		
	}

}
