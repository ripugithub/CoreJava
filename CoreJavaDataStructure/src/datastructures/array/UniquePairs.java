package datastructures.array;


/*
 * Find unique pairs whose sum is 6
 * */
public class UniquePairs {

	public static void main(String[] str)
	{
		int k=6;
		int[] arr = { 2, 4, 3, 3 };
		
		System.out.println("The pairs are:: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				if(i!=j)
				{
					
					if(arr[i]+arr[j]==k)
					{
						
						System.out.print("("+arr[i]+", "+arr[j]+")");
					}
				}
			}
		}
	}
	
}
