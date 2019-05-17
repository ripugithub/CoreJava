package datastructures.sorting;

public class SelectionSort {
	
			/*
			 * In selection sort first minimum element is selected and inserted 
			 * at the beginning of the array
			 * 
			 * Time Complexity = O(n2)
			 * arr[] = 64 25 12 22 11

			// Find the minimum element in arr[0...4]
			// and place it at beginning
			11 25 12 22 64

			// Find the minimum element in arr[1...4]
			// and place it at beginning of arr[1...4]
			11 12 25 22 64

			// Find the minimum element in arr[2...4]
			// and place it at beginning of arr[2...4]
			11 12 22 25 64

			// Find the minimum element in arr[3...4]
			// and place it at beginning of arr[3...4]
			11 12 22 25 64 
			*/

	
	public static void main(String s[])
	{
		int[] arr = new int[] {64, 25, 12, 22, 11};
		selectionSort1(arr);
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
	}
	
	public static void selectionSort(int[] arr)
	{
		int length = arr.length;
		
		
		for(int i=0;i<length-1;i++)
		{
			int min_idx=i;
			for(int j=i+1; j<length;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx = j;
					
				}
			}
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
			
			
		}
	}
	
	




}
