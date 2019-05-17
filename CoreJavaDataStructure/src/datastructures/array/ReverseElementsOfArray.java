package datastructures.array;

public class ReverseElementsOfArray {
	
	public static void main(String[] s)
	{
		
		int[] arr = {6,4,8,2,9};
		int[] res = reverseElements(arr);
		for(int num:res)
		{
			System.out.print(num+" ");
		}
		
	}
	
	private static int[] reverseElements(int[] arr)
	{
		int length = arr.length;
		
		int start = 0;
		int end = length-1;
		int temp;
	
			while(start<end)
			{
				temp  = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		return arr;
	}
	
	
	

	

}
