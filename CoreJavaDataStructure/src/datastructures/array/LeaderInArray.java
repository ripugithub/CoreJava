package datastructures.array;

public class LeaderInArray {

	public static void main(String[] str)
	{
		int[] arr = {15, 16, 3, 2, 6, 1, 4};
		
		int len = arr.length;
		
		for(int i=0;i<len;i++)
		{
			int j;
			for(j=i+1;j<len;j++)
			{
				if(arr[j]>=arr[i])
					break;
			}
			if(j==len)
			{
				System.out.println("Leader is : "+arr[i]);
			}
		}
		
	}
}
