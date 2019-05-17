package datastructures.array;

public class ArrangeZeroandOnes {
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,0,0,1,1,0,0,1,0,1,1};
		int j = 0;
		
		//dry Run
		/*1001100 	i=0, j=0;
		1001100 	i=1, j=0;
		0101100 	i=2, j=1;
		0011100 	i=3, j=2;
		0011100 	i=4, j=2;
		0011100 	i=5, j=2;
		0001110 	i=6, j=3;
		0000111 	i=7, j=4*/
		
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;

			}

		}
		
		
		for(int a:arr)
		{
			System.out.print(a);
		}
		
	}

}
