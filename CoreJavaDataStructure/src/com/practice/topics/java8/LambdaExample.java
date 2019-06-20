package com.practice.topics.java8;

interface Draw{
	public void draw(String shape);
}
public class LambdaExample {

	public static void main(String s[])
	{
		Draw draw = (shape)->System.out.println(shape+" is drawn");
		draw.draw("Rectangle");
		
	}
}
