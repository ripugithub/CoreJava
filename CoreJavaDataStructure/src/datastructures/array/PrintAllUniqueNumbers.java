package datastructures.array;

import java.util.Arrays;

public class PrintAllUniqueNumbers {
	
	public static void main(String[] str)
	{
		int[] arr = {8,12,3,5,6,8,3};
		
		printAllUniqueNumbers(arr);
		
		
	}

	private static void printAllUniqueNumbers(int[] arr) {
		int length = arr.length;
		Arrays.sort(arr);
		int current = arr[0];
		System.out.print(current+" ");
		for(int i=0;i<length;i++)
		{
			if(current!=arr[i])
			{
				System.out.print(arr[i]+" ");
				current = arr[i];
			}
			
		}
	}
	
	

}
