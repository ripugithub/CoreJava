package datastructures.array;

public class LargestSmallest {

	public static void main(String[] args) {
			int[] arr = {8,4, 6,12,2,14};
			largestAndSmallest(arr);
	}

	public static void largestAndSmallest(int[] arr)
	{
		int largest=Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int num:arr)
		{
			if(num>largest)
			{
				largest = num;
			}
			else if(num<smallest)
			{
				smallest = num;
			}
		}
		System.out.println("Smallest: "+smallest+" Largest "+largest);
		
		
	}
}
