package com.practice.topics.oca;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HasMapProg {
	
	public static void main(String s[]) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("KA", "Karnataka");
		hm.put("DL", "New Delhi");
		hm.put("MH", "Maharashtra");
		hm.put("BR", "Bihar");
		System.out.println(hm);
		System.out.println("*********************************");
		Set<String> keys = hm.keySet();
		for(String elem:keys)
		{
			System.out.println(hm.get(elem));
			keys.forEach(val->System.out.println("key"+val+"value "+hm.get(val)));
		}
		System.out.println("*********************************");
		Set<Entry<String, String>> entries = hm.entrySet();
		for(Entry<String, String> entry:entries)
		{
			System.out.println("Key::"+entry.getKey()+"\t"+"Value::"+entry.getValue());
		}
		
	//	List<String> values = hm.values();
		hm.values().forEach(val->System.out.println(val));
		
		Set keys1 = hm.keySet();
		Set<Entry<String, String>> entries1 = hm.entrySet();
		
	
	}

}
