package datastructures.sorting;

public class InsertionSort {
	
	
	/*	Array is divided into two parts where first part denotes the sorted 
		array and the second is unsorted , elements from unsorted array is taken one 
		by one and compared with the elements in the sorted array and inserted in the correct position
		https://www.geeksforgeeks.org/insertion-sort/
		4, 3, 2, 10 - first 4 is considered as the sorted array
		3, 4, 2, 10 - 1st Iteration
		2, 3, 4, 10 - 2nd Iteration
	 	Complexity of this algorithm is O(n2)
	 	Insertion sort is not the best sorting algorithm
	 */
	
	public static void insertionSort(int arr[])
	{
		int length = arr.length;
		int j, key;
		for(int i=1;i<length;i++)
		{
			key = arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1]  = key ;
		}
	}
	
	public static void main(String[] s)
	{
		int[] arr = new int[] {18,12,24,10};
		insertionSort(arr);
		for(int num:arr)
			System.out.print(num+" ");
		
	}
	
	

}
