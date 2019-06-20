package com.practice.topics.datastructure.sorting;

public class BubbleSort {

	
	/*
	 * input - 2, 7, 4, 1, 5, 3
	 * Each element starting from 0th index are compared with its adjacent element
	 * pass1 - 2 4 1 5 3 7
	 * pass2 - 2 1 4 3 5 7
	 * pass3 - 1 2 3 4 5 7  - sorted
	 * 
	 * Time complexity
	 * Best Case - O(n)
	 * Average Case - O(n2)
	 * Worst Case - O(n2)
	 */
	private static void bubbleSort(int[] arr)
	{
		int length = arr.length;
		int temp;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {5,1,4,2,8,6,10};
		
		bubbleSort(arr);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}

}
