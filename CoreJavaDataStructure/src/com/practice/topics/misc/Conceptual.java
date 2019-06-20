package com.practice.topics.misc;

import java.math.BigDecimal;

public class Conceptual {
	
	public static void main(String s[])
	{
		
		/* 1. -----------Equality and Identity-------------*/
		Integer a = new Integer(5);
		Integer b = a;
		Integer c = new Integer(5);
		System.out.println(a==b);   //Identity - a and b are identical and identity is tested using == operator
		System.out.println(a==c);
		System.out.println(a.equals(c)); //Equality  - a is equal to c but not identical to c Equality is tested using equals operator
		
		/* 2. -----------Monetary Calculation in java-------------*/
		//avoid float and double where exact answers are required; for monetary calculations, use
				//int, long, or BigDecimal
		System.out.println(4-1);//gives a wrong result
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
		
		/* 3. ------------Characters test------------*/
		/*
		 * The compiler evaluates the constant expression 'H' + 'a' by promoting each of the char-valued operands ('H'
			and 'a') to int values through a process known as widening primitive conversion [JLS 5.1.2, 5.6.2]. Widening
			primitive conversion of a char to an int zero extends the 16-bit char value to fill the 32-bit int. In the case of
			'H', the char value is 72 and in the case of 'a', it is 97, so the expression 'H' + 'a' is equivalent to the int
			constant 72 + 97, or 169.
		 * */
		//A char is an unsigned 16-bit primitive integer
		System.out.println("H"+"A");
		System.out.println('H'+'a');  // prints numbers i.e sum of 'H' and 'A'
		System.out.println("---------------------");
		StringBuffer sb = new StringBuffer();
		sb.append('H');
		sb.append('a');
		System.out.println(sb);
		System.out.println('a');
		
	}


}
