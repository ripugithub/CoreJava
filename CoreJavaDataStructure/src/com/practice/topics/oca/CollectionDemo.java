package com.practice.topics.oca;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String s[])
	{
		//int arr[] = new int[] {1,2,3,4,5};
		Integer arr[] = new Integer[] {1,2,3,4,5};
		Vector<Integer> v = new Vector<Integer>();
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		v.add(1);
		v.add(2);
		h.put(1, "Ripu");
		h.put(2, "Daman");
		h.put(3, "Singh");
		System.out.println(arr[2]);
		System.out.println(v.get(0));
		System.out.println(h.get(1));
		
		List<String> str = new ArrayList<String>();
		str.add("Ripu");
		str.add("Amit");
		str.add("Raj");
		
		System.out.println(str.get(0));
	}
}
