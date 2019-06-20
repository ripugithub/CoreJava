package com.practice.topics.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplNumber {

	public static void main(String s[]) {
		int arr[] = { 2, 5, 6, 8, 7, 2, 2 };
		List<Integer> list = new ArrayList<>();
		
		List list1 = Arrays.asList(arr);

		Set<Integer> set = new HashSet<Integer>();

		for (int num : arr) {
			list.add(num);

		}

		for (int val : list) {
			if (set.contains(val)) {
				System.out.println("Duplicate number:" + val);
					break;
			} else {
				set.add(val);
			}
		}
		/*
		 * for(int val:set) {
		 *  int freq = Collections.frequency(list, val); 
		 *  if(freq>1) 
		 *  {
		 *		 System.out.println("Duplicate number is: "+val +"and freq is: "+freq); 
		 *  } 
		 * }
		 */
	}

}
