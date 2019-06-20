package com.practice.topics.misc;


/*Method hiding means subclass has defined a class(static) method with 
 * the same signature as a class method in the superclass. In 
 * that case the method of superclass is hidden by the subclass. 
 * It signifies that : The version of a method that is executed 
 * will NOT be determined by the object that is used to invoke it. 
 * In fact it will be determined by the type of reference variable 
 * used to invoke the method.
 * ------------------------------------
 * What is meant by method overriding? 
 * Method overriding means subclass had defined an instance method with 
 * the same signature and return type( including covariant type) as the 
 * instance method in superclass. In that case method of superclass is 
 * overridden(replaced) by the subclass. It signifies that: The version 
 * of method that is executed will be determined by the object that is 
 * used to invoke it. It will not be determined by the type of reference 
 * variable used to invoke the method. 
 * ------------------------------------------
 * Why can't static methods be overridden?
 * Because, static methods are resolved statically (i.e. at compile time) 
 * based on the class they are called on and not dynamically as in the 
 * case with instance methods which are resolved polymorphically based 
 * on the runtime type of the object. 
 */
class A
{
	public static void display()
	{
		System.out.println("From display method of class A");
	}
	
	public  void show()
	{
		System.out.println("From show method of class A");
	}
}

public class StaticTest extends A{
	
	public  static void display()
	{
		System.out.println("From display method of class StaticTest");
	}
	
	public  void show()
	{
		System.out.println("From show method of class StaticTest");
	}
	
	public static void main(String s[])
	{
		A test = new StaticTest();
	//	A.display();
		//StaticTest.display();
		test.display();
	}
}
