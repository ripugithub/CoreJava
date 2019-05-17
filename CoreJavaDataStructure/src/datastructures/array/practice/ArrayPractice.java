package datastructures.array.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayPractice {
	
	public static void main(String[] s)
	{
		int a;
		//System.out.println(a); //This will give compiler error since a is a local 
		//variable and it must be initialized before use.Unlike instance primitive variables local variable are not given a default value in java
		//-----------------------------X---------------------
		char charc = firstNonRepeatedChar("aadya");
		System.out.println("Non Repeated char is: "+charc);
		
		
		//-----------------------------X---------------------
		int[] arr = {1,1,2,2,3,3,3,4,4};
		removeDuplicates(arr);
		
		//-----------------------------X----------------------
		int[] arr1 = {22, 15, 13,34,56,28};
		largestAndSmallest(arr1);
		
		//-----------------------------X----------------------
		int[] arr2 = {-8,6, -5,-2,12,-16,18,-24};
		rearrangeArrays(arr2);
		
		//-----------------------------X----------------------
		int[] arr3 = {10,20,30,40,50};
		reverseElementsOfArray(arr3);
		
		
		//-----------------------------X-----------------------		
		System.out.println("Reverse Number: "+reverseInteger(12345));
		
		
		//-----------------------------X-------------------------
		int[] arr4 = {60,30,20,40,10,50};
		highest2ndHighest(arr4);
		
	}
	
	
	
	//Finding non repeated characters
	public static Character firstNonRepeatedChar(String str)
	{
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		char[] character = str.toCharArray();
		for(char c:character)
		{
			map.put(c, map.containsKey(c)?map.get(c)+1:1);
		}
		
		for(Map.Entry<Character,Integer> val:map.entrySet())
		{
			if(val.getValue()==1)
			{
				return val.getKey();
			}
		}
		return null;
	}
	
	public static void removeDuplicates(int[] arr)
	{
		Arrays.sort(arr);
		int length = arr.length;      //{1,1,2,3,3,4,4};
		int[] res = new int[length];
		int previous = arr[0];
		res[0] = arr[0];
		
		
		//Put the elements in the target array only if the elements are not equal to the previous element.
		for(int i=1;i<length-1;i++)
		{
			int ch = arr[i];
			if(previous!=ch)
			{
				res[i] = ch;
			}
			previous = ch;
		}
		
		for(int num:res)
		{
			System.out.print(num+" ");
		}
		
		
	}
	
	public static void largestAndSmallest(int[] arr)
	{
		int length = arr.length;
		int largest = arr[0];
		int smallest = arr[0];
		for(int i=0;i<length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest: "+largest+" Smallest: "+smallest);
	}
	
	public static void rearrangeArrays(int[] arr)
	{
		int length = arr.length;
		int j=0;
		int temp;
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]<0)
			{
				//if(i!=j)
				//{
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				//}
				j++;
			}
		}
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}
	
	public static void reverseElementsOfArray(int[] arr)
	{
		int length = arr.length;
		int start = 0;
		int end = length-1;
		int temp;
		
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int num:arr)
		{
			System.out.println();
			System.out.print(num+" ");
		}
		
	}
	
	public static int reverseInteger(int num)
	{
		int rev = 0;
		
		while(num>0)
		{
			rev = rev*10+ num%10;
			num = num/10;
			
		}
		return rev;
	}
	
	public static void highest2ndHighest(int[] arr)
	{
		int length = arr.length;
		
		int highest = arr[0];
		int secondHighest = arr[0];
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]>highest)
			{
				secondHighest = highest;
				highest = arr[i];
			}
		}
		
		System.out.println(" Second Highest: "+secondHighest);
		
		
		
	}

}
