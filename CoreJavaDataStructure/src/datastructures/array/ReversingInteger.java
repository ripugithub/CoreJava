package datastructures.array;

public class ReversingInteger {
	
	public static void main(String s[])
	{
		long num = 12345;
		long rev=0;
		
		while(num!=0)
		{
			
			rev = rev*10 + num%10; //1st Iteration 0*10+12345%10 = 0+5 = 5
			num = num/10;
		}
		
		System.out.println("Reverse is: "+rev);
		
		
		long num1 = 56789;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
