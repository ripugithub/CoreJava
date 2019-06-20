package java8Features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.toList;

public class IsPrime {
	
	public static void main(String s[])
	{
		
		Integer number = 12345;
		String str = number.toString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		System.out.println("Check Prime: "+isPrime(num));
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
	        // Prime number 
	        System.out.println(numbers.stream()
	                            .filter(IsPrime::isPrime)
	                             .collect(toList()));
		 
		// numbers.stream().filter(IsPrime::isPrime).collect(toList());
	        
	        System.out.println(checkPrime(24));
	        
	        List<Integer> nums = numbers.stream().filter(IsPrime::checkPrime).collect(toList());
	        System.out.println(nums);
	}
	
	
	public static boolean checkPrime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				return false;
				
			}
			
		}
		return true;
	}
private static boolean isPrime(int num)
{
	return num>1 && IntStream.range(2, num).noneMatch(i->num%i==0);
}
}
