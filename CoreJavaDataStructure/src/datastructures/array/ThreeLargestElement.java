package datastructures.array;

public class ThreeLargestElement {
	
	public static void main(String[] str)
	{
		int[] arr = {12,4,8,16,24,9,15};
		
		threeLargestElement(arr);
		threeSmallestElement(arr);
	}

	private static void threeSmallestElement(int[] arr) {
		int length = arr.length;
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]<first)
			{
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i]<second)
			{
				third = second;
				second = arr[i];
			}
			else if(arr[i]<third)
			{
				third = arr[i];
			}
			
		}
		System.out.println("Three smallest are: "+ first+ " "+second+" "+third);
	}
		
	

	private static void threeLargestElement(int[] arr) {
		
		int length = arr.length;
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]>first)
			{
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second)
			{
				third = second;
				second = arr[i];
			}
			else if(arr[i]>third)
			{
				third = arr[i];
			}
			
		}
		System.out.println("Three Largest are: "+ first+ " "+second+" "+third);
	}

}
