package java8Features;

public class StringLength {
	
	public static void main(String s[])
	{
		//the variable type declaration is optional and  is can be omitted in belwo statement
		StringLengthLambda length = (String len)->len.length();
		//Above statement is equivalent as below statement
		//StringLengthLambda length = (len)->len.length();
				//or
		//StringLengthLambda length = len->len.length();
		System.out.println("length of String: "+length.getStringLength("HelloLambda"));
	}
	
	interface StringLengthLambda{
		int getStringLength(String s);
	}

}
