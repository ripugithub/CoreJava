package com.practice.topics.java8;

interface MyString{
	String myStringFunction(String str);
}
public class RevesStringUsingLambda {
	/*public static void main(String st[]) {
	MyString myString = (String str)->{
		StringBuilder strng = new StringBuilder(str);
		return strng.reverse().toString();
	};
	
	System.out.println(revString(myString, "TEA"));

}
	public static String revString(MyString str, String sourceString) {
		return str.myStringFunction(sourceString);
	}*/
	
	public static void main(String s[])
	{
		MyString str = (st)->
		{
			StringBuilder sb = new StringBuilder(st);
			sb.reverse();
			return sb.toString();
		};
		System.out.println(str.myStringFunction("Ripudaman"));
	}

}


