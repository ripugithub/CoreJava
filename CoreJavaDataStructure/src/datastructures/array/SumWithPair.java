package datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumWithPair {
	
	
	
	public static void main(String s[])
	{
		int arr[] = {8,7,2,5,3,1,2};
		int sum = 10;
		//1. Find the pair of numbers whose sum is equal to the given number.
		//findPairusingForLoop(arr, sum);
		//2. find the pairs using sorted array whose sum is equal to the given numbers. 
		//findPairUsingSortedArray(arr, sum);
		//3. Find duplicate number in a given array.
		//findDuplicates(arr);
		//4.Find maximum products of two numbers in a given array.
		findMaxProduct(arr);
	}

	private static void findMaxProduct(int[] arr) {
		Arrays.sort(arr);
		int length = arr.length;
				
		int product = arr[length-1]*arr[length-2];
		System.out.println("The product is: "+product);
	}

	private static void findDuplicates(int[] arr) {
		
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int num:arr)
		{
			set.add(num);
			list.add(num);
		}
		for(int val:set)
		{
			int freq = Collections.frequency(list, val);
			if(freq>1)
			{
				System.out.println("Duplicate number is: " +val);
			}
		}
	}

	public static void findPairUsingSortedArray(int[] arr, int sum) {
		int low=0;
		int high=arr.length-1;
		
		Arrays.sort(arr);
		while(low<high)
		{
			if(arr[low]+arr[high]==sum)
			{
				System.out.println("The pairs are : " +arr[low]+","+arr[high]);
			}
			if(arr[low]+arr[high]<sum)
			{
				low++;
			}
			else {
				high--;
			}
		}
	}

	/**
	 * @param arr
	 * @param sum
	 */
	public static void findPairusingForLoop(int[] arr, int sum) {
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1; j<length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("The pairs are : " +arr[i]+","+arr[j]);
				}
			}
		}
	}

}
