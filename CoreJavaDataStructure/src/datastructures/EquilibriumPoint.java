package datastructures;

public class EquilibriumPoint {
	
	
	
	public static void main(String[] str)
	{
		int[] arr = {1,6,7,0,7};
		System.out.println(getEquilibriumPoint(arr));
	}
	
	
public static int getEquilibriumPoint(int[] arr)
{
	int sum=0;
	int target=0;
	if(arr.length==0)
	{
		return -1;
	}
	
	for(int i=0;i<arr.length;i++)
	{
		sum = sum+arr[i];
	}
	
	for(int i=0; i<arr.length; i++)
	{
		sum = sum-arr[i];
		if(sum==target)
		{
			return arr[i];
		}
		
			target = target+arr[i];
		
		
	}
	return -1;
	
}

}
