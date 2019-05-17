package datastructures.sorting;

public class QuickSort {
	
	//time complexity of quick sort is O(nlogn)  - Average case running time
	// O(n2) worst case running time.
	
	public static void main(String s[])
	{
		int[] arr = new int[] {10, 9, 8, 7, 6, 5,4};
		quickSort(arr, 0, arr.length-1);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
	}
	
	private static int partition(int[] arr, int left, int right)
	{
		int pivot = arr[(right+left)/2];
		int temp;
		while(left<=right)
		{
			while(arr[left]< pivot) left++;
			while(arr[right]> pivot) right--;
			if(left<=right)
			{
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			left++;
			right--;
			
		}
		return left;
		
	}
	
	private static void quickSort(int[] arr, int left ,int right)
	{
		int index  = partition(arr,left,right);
		if(left<index-1)
		{
			quickSort(arr, left, index-1);
		}
		if(index<right)
		{
			quickSort(arr, index, right);
		}
	}
	


}
