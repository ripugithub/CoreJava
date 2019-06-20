package com.practice.topics.misc;

interface Drawable{
	void draw();
	
}
public class LambdaExample {

	public static void main(String s[])
	{
		Drawable draw = ()->System.out.println("Draw Completed");
		draw.draw();
	}
	
}
