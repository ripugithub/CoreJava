package datastructures.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;



public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatedChar("aadya"));
		
		int[] arr = {8,5,4,12,16,13,12,8};

		removeDuplicates(arr);
		
		int[] arr1 = {1,1,2,2,3,3,4,4};//{1,1,2,2,3,3,6,6,12,14};
		removeDuplicatesWithoutSet(arr1);
	}
	
	
	public static char firstNonRepeatedChar(String word)
	{
		//Map<Character,Integer> counts = new HashMap<Character,Integer>(); //Using HashMap may give incorrect results as the values stored will be random order
		Map<Character,Integer> counts = new LinkedHashMap<Character,Integer>();//LinkedHashMap will maintain the order of the insertion in the which the characters of the array is inserted into the map
		for(char ch:word.toCharArray())
		{
			counts.put(ch, counts.containsKey(ch)?counts.get(ch)+1:1);
		}
		
		for(Map.Entry<Character, Integer> entry:counts.entrySet())
		{
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}	
		
		throw new RuntimeException("No non repeated characters found");
		
	}
	
	public static void removeDuplicates(int[] arr)
	{
		int length = arr.length;
		
		Set<Integer> set = new HashSet<Integer>();
		for(Integer num:arr)
		{
			set.add(num);
		}
		
		set.toArray();
		//set.forEach((val)->System.out.println(val));
		for(int nums:set)
		{
			System.out.print(nums+" ");
		}
	}
	
	public static void removeDuplicatesWithoutSet(int[] arr)
	{
		 Arrays.sort(arr);     
	        int[] result = new int[arr.length];
	        int previous = arr[0];
	        result[0] = previous;

	        for (int i = 1; i < arr.length; i++) {
	            int ch = arr[i];

	            if (previous != ch) {
	                result[i] = ch;
	            }
	            previous = ch;
	        }
		System.out.println();
		for(int num:result)
		{
			System.out.print(num+" ");
		}
		
	}

}
