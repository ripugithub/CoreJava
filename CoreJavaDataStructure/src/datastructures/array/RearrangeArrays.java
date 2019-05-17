package datastructures.array;

public class RearrangeArrays {

	public static void main(String s[])
	{
		
		int[] arr = {4, -6, 7, -2, 5, -12, -15, 10, 18,-11};
		
		rearrange(arr);
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
	}
	
	public static void rearrange(int[] arr)
	{
		int length = arr.length;
		int j = 0;
		int temp;
		for (int i = 0; i < length; i++) {

			if (arr[i] < 0) {
				//if (i != j) 
					//{
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

					//}
					j++;
				
			}

		}
	}
}
