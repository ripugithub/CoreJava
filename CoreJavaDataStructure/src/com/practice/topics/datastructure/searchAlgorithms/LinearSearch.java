package com.practice.topics.datastructure.searchAlgorithms;

public class LinearSearch {
	
	public static void main(String s[])
	{
		int arr[] = new int[] {6,4,10,43,36,8,12};
		System.out.println(linearSeacrh(arr, 8));
	}
	
	private static int linearSeacrh(int[] arr, int key)
	{
		int length = arr.length;
		for(int i=0;i<length; i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}

}
