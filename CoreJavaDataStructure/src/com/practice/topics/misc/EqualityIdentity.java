package com.practice.topics.misc;

public class EqualityIdentity {
	
	
	public static void main(String s[])
	{
		Integer a = new Integer(5);
		Integer b = a;
		Integer c = new Integer(5);
		System.out.println(a==b);   //Identity - a and b are identical and identity is tested using == operator
		System.out.println(a==c);
		System.out.println(a.equals(c)); //Equality  - a is equal to c but not identical to c Equality is tested using equals operator
	}

}
