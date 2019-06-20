package java8Features;

public class StringLengthUsingLambda {
	
	public static void main(String s[])
	{
		StringLengthLambda length = (str)->str.length();
		System.out.println("Length of String: "+length.getLength("Ripudaman"));
		
		
	}
	
	interface StringLengthLambda{
		int getLength(String s);
		
	}

}
