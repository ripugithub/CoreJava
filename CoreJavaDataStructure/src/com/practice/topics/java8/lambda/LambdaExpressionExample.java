package com.practice.topics.java8.lambda;

interface Drawable{
	void  draw();
}

public class LambdaExpressionExample {

	
	public static void main(String s[]) {
		
		Drawable draw = ()->System.out.println("Circle drawn");
		draw.draw();
	}
}
