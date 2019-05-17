package datastructures.array;

public class FibonacciSeries {

	
	public static void main(String[] str)
	{
		int num=8;
		for(int i=0;i<num; i++)
		{
		System.out.print(fibonacci(i)+ " ");
		}
	}
	
	public static int fibonacci(int num)
	{
		if(num==0)
		{
			return 0;			
		}
		else if(num==1)
		{
			return 1;
		}
		
		else return fibonacci(num-1)+fibonacci(num-2);
	}
}
