package datastructures.array;

public class DutchFlagProblem {

	
	public static void main(String[] s)
	{
		int[] arr = {1,1,1, 0,2,0,2,0,1,0,2,0,2,1};
		
		dutchArrange(arr);	
		for(int num:arr)
		{
		System.out.print(num+" ");
		}
		
	}
	
	public static void dutchArrange(int[] arr)
	{
		
		int high = arr.length-1;
		int low = 0;
		int mid = 0;
		int temp = 0;
		
		while(mid<=high)
		{
			
			switch(arr[mid])
			{
			
				case 0:
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					temp = arr[high];
					arr[high] = arr[mid];
					arr[mid] = temp;
					high--;
					break;
			}
		}
		
	}
	
}
